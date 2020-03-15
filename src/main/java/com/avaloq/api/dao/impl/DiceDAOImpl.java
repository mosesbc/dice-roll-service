package com.avaloq.api.dao.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.avaloq.api.dao.DiceDAO;
import com.avaloq.api.dao.ResultDAO;
import com.avaloq.api.dao.RollRequestDAO;
import com.avaloq.api.model.Result;
import com.avaloq.api.model.RollRequest;

@Repository("diceDAO")
public class DiceDAOImpl implements DiceDAO {

	@Autowired
	ResultDAO resultDAO;

	@Autowired
	RollRequestDAO rollRequestDAO;

	@Override
	public RollRequest saveRollRequest(RollRequest rollRequest) {
		return rollRequestDAO.save(rollRequest);
	}

	@Override
	public List<RollRequest> findAllRollRequest() {
		return (List<RollRequest>) rollRequestDAO.findAll();
	}

	@Override
	public RollRequest findRollRequest(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Result> findAllResult() {
		return (List<Result>) resultDAO.findAll();
	}

	@Override
	public Result findResult(Integer id) {
		return null;
	}

}
