package com.avaloq.api.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.avaloq.api.dao.DiceDAO;
import com.avaloq.api.dao.ResultDAO;
import com.avaloq.api.dao.SimulationDAO;
import com.avaloq.api.model.Simulation;

@Repository("diceDAO")
public class DiceDAOImpl implements DiceDAO {

	@Autowired
	ResultDAO resultDAO;

	@Autowired
	SimulationDAO simulationDAO;

	@Override
	public Simulation saveSimulation(Simulation simulation) {
		return simulationDAO.save(simulation);
	}

	@Override
	public List<Simulation> findAllSimulation() {
		return (List<Simulation>) simulationDAO.findAll();
	}
}
