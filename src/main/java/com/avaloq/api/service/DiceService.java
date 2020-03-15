package com.avaloq.api.service;

import java.util.List;

import com.avaloq.api.model.Result;
import com.avaloq.api.model.RollRequest;

public interface DiceService {
	
	public List<Result> rollThem(int noOfDice, int noOfSide, int noOfRolls);	
	
	public RollRequest saveRollRequest(RollRequest rollRequest);
	
	public List<RollRequest> findAllRollRequest();
	
	public List<Result> findAllResult();

}
