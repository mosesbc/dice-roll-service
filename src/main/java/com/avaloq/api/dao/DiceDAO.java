package com.avaloq.api.dao;

import java.util.List;

import com.avaloq.api.model.Result;
import com.avaloq.api.model.RollRequest;

public interface DiceDAO {
	
	public RollRequest saveRollRequest(RollRequest rollRequest);
	
	public List<RollRequest> findAllRollRequest();
	
	public RollRequest findRollRequest(Integer id);
	
	public List<Result> findAllResult();
	
	public Result findResult(Integer id);

}
