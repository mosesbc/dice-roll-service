package com.avaloq.api.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.avaloq.api.model.Simulation;

@Repository("simulationDAO")
public interface SimulationDAO extends CrudRepository<Simulation, Integer>{

}
