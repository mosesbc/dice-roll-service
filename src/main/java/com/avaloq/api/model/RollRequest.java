package com.avaloq.api.model;

import java.util.List;

public class RollRequest {
	
	Integer noOfDice; 
	Integer noOfSide; 
	Integer noOfRolls;
	
	List<Result> resultList;
	
	

	public RollRequest(Integer noOfDice, Integer noOfSide, Integer noOfRolls, List<Result> resultList) {
		super();
		this.noOfDice = noOfDice;
		this.noOfSide = noOfSide;
		this.noOfRolls = noOfRolls;
		this.resultList = resultList;
	}

	public Integer getNoOfDice() {
		return noOfDice;
	}

	public void setNoOfDice(Integer noOfDice) {
		this.noOfDice = noOfDice;
	}

	public Integer getNoOfSide() {
		return noOfSide;
	}

	public void setNoOfSide(Integer noOfSide) {
		this.noOfSide = noOfSide;
	}

	public Integer getNoOfRolls() {
		return noOfRolls;
	}

	public void setNoOfRolls(Integer noOfRolls) {
		this.noOfRolls = noOfRolls;
	}

	public List<Result> getResultList() {
		return resultList;
	}

	public void setResultList(List<Result> resultList) {
		this.resultList = resultList;
	}
	
	

}
