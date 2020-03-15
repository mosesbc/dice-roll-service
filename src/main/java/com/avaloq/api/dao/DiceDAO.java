package com.avaloq.api.dao;

import java.util.List;

import com.avaloq.api.model.Simulation;

public interface DiceDAO {
	
	public Simulation saveSimulation(Simulation Simulation);
	
	public List<Simulation> findAllSimulation();
}
