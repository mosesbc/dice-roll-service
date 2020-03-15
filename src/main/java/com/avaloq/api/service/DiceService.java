package com.avaloq.api.service;

import java.util.List;

import com.avaloq.api.model.Result;
import com.avaloq.api.model.Simulation;

public interface DiceService {
	
	public List<Result> rollThem(int noOfDice, int noOfSide, int noOfRolls);	
	
	public Simulation saveSimulation(Simulation Simulation);
	
	public List<Simulation> findAllSimulation();

}
