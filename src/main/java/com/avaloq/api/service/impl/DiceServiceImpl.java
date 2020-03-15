package com.avaloq.api.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avaloq.api.dao.DiceDAO;
import com.avaloq.api.model.Result;
import com.avaloq.api.model.Simulation;
import com.avaloq.api.service.DiceService;

@Service("diceService")
public class DiceServiceImpl implements DiceService{
	
	@Autowired
	private DiceDAO diceDAO;

	private Random random = new Random();

	@Override
	public List<Result> rollThem(int noOfDice, int noOfSide, int noOfRolls) {

		List<Integer> listOfSums = new ArrayList<>();
		for (int i = 1; i <= noOfRolls; i++) {
			int sum = rollASet(noOfDice, noOfSide);
			listOfSums.add(sum);
		}
		return getCounOfEachTotal(listOfSums);
	}

	private List<Result> getCounOfEachTotal(List<Integer> listOfTotals) {
		List<Result> getCounOfEachTotal = new ArrayList<Result>();

		listOfTotals.stream().distinct().forEach(aTotal -> {

			long count = listOfTotals.stream().filter(aSum -> aSum == aTotal).count();

			getCounOfEachTotal.add(new Result(aTotal, Integer.valueOf(Long.valueOf(count).toString())));

		});

		return getCounOfEachTotal;
	}

	private int rollASet(int noOfDice, int noOfSide) {
		System.out.println("there are " + noOfDice + " for this set");

		int sum = 0;
		for (int i = 1; i <= noOfDice; i++) {
			int rollResult = rollADice(noOfSide);
			System.out.println("dice result:" + rollResult);
			sum = sum + rollResult;
		}
		System.out.println("sum:" + sum);

		return sum;

	}

	private int rollADice(int noOfSide) {
		return random.nextInt(noOfSide) + 1;
	}

	@Override
	public Simulation saveSimulation(Simulation Simulation) {
		return diceDAO.saveSimulation(Simulation);
	}

	@Override
	public List<Simulation> findAllSimulation() {
		return diceDAO.findAllSimulation();
	}

	

}
