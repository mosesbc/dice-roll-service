package com.avaloq.api.dao.impl;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.avaloq.api.dao.CombinationDAO;
import com.avaloq.api.model.Combination;
import com.avaloq.api.model.Distribution;

@Repository("combinationDAO")
public class CombinationDAOImpl implements CombinationDAO {

	@PersistenceContext
	EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public List<Combination> getCombinations() {
		String sql = "SELECT a.*,b.sum ,b.times_rolled,  ROUND(b.times_rolled * 100.00 / total_no_of_rolls , 4) AS Percent "
				+ "FROM ( "
				+ "	SELECT NO_OF_DICE,NO_OF_SIDE, COUNT(*) as SIM_COUNT , SUM(NO_OF_ROLLS) as TOTAL_NO_OF_ROLLS "
				+ "	FROM SIMULATION  " + "	GROUP BY (NO_OF_DICE,NO_OF_SIDE) " + ") A INNER JOIN  " + "( "
				+ "	SELECT NO_OF_DICE,NO_OF_SIDE, TOTAL as sum,sum(TIMES_ROLLED) as TIMES_ROLLED "
				+ "	FROM SIMULATION " + "	INNER JOIN RESULT ON RESULT .SIM_ID=SIMULATION.SIM_ID "
				+ "	GROUP BY(NO_OF_DICE,NO_OF_SIDE, TOTAL) " + ") B "
				+ "ON a.NO_OF_DICE=b.NO_OF_DICE and a.NO_OF_SIDE=b.NO_OF_SIDE";

		Query query = entityManager.createNativeQuery(sql);
		List<Combination> combinationDetailsList = new ArrayList<>();
		Integer currentNoOfDice = null;
		Integer currentNoOfSide = null;
		Combination c = null;
		List<Distribution> distList = new ArrayList<>();
		List<Object[]> resultList = query.getResultList();
		for (Object[] result : resultList) {

			Integer noOfDice = (Integer) result[0];
			Integer noOfSide = (Integer) result[1];

			System.out.println("noOfDice:" + noOfDice + ", noOfSide:" + noOfSide);
			System.out.println("currentNoOfDice:" + currentNoOfDice + ", currentNoOfSide:" + currentNoOfSide);
			if (currentNoOfDice != noOfDice || currentNoOfSide != noOfSide) {
				if (c != null) {
					c.setDistributions(distList);
				}
				Integer noOfSimulation = ((BigInteger) result[2]).intValue();
				Integer noOfRolls = ((BigInteger) result[3]).intValue();

				c = new Combination();
				c.setNoOfDice(noOfDice);
				c.setNoOfSide(noOfSide);
				c.setNoOfRolls(noOfRolls);
				c.setNoOfSimulation(noOfSimulation);
				c.setDistributions(distList);

				combinationDetailsList.add(c);

				currentNoOfDice = noOfDice;
				currentNoOfSide = noOfSide;
			}

			Integer sum = (Integer) result[4];
			Integer timesRolled = ((BigInteger) result[5]).intValue();
			BigDecimal percentage = (BigDecimal) result[6];
			Distribution dist = new Distribution(sum, timesRolled, percentage);
			distList.add(dist);

		}

		return combinationDetailsList;
	}

}
