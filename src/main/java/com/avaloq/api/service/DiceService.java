package com.avaloq.api.service;

import java.util.List;

import com.avaloq.api.model.Result;

public interface DiceService {
	
	public List<Result> rollThem(int noOfDice, int noOfSide, int noOfRolls);	

}
