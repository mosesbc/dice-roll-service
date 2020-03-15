package com.avaloq.api.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Combination extends Simulation implements Serializable {

	private static final long serialVersionUID = 5092924052493975950L;

	private Integer noOfSimulation;
	private List<Distribution> distributions;

	public Combination() {
		super();
	}

	public Combination(Integer noOfDice, Integer noOfSide, Integer noOfRolls, List<Result> resultList,
			List<Distribution> distributions) {
		super(noOfDice, noOfSide, noOfRolls, resultList);
	}

	public List<Distribution> getDistributions() {
		return distributions;
	}

	public void setDistributions(List<Distribution> distributions) {
		this.distributions = distributions;
	}

	public Integer getNoOfSimulation() {
		return noOfSimulation;
	}

	public void setNoOfSimulation(Integer noOfSimulation) {
		this.noOfSimulation = noOfSimulation;
	}

}
