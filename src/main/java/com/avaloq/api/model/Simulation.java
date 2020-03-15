package com.avaloq.api.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Simulation implements Serializable {

	private static final long serialVersionUID = 7958304460702421272L;

	@Id
	@GeneratedValue
	private Integer requestId;

	Integer noOfDice;
	Integer noOfSide;
	Integer noOfRolls;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "request_Id")
	List<Result> resultList;

	public Simulation() {
	}

	public Simulation(Integer noOfDice, Integer noOfSide, Integer noOfRolls, List<Result> resultList) {
		super();
		this.noOfDice = noOfDice;
		this.noOfSide = noOfSide;
		this.noOfRolls = noOfRolls;
		this.resultList = resultList;
	}

	public Integer getRequestId() {
		return requestId;
	}

	public void setRequestId(Integer requestId) {
		this.requestId = requestId;
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
