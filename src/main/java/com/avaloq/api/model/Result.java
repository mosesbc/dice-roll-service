package com.avaloq.api.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Result implements Serializable {

	private static final long serialVersionUID = -3233762681941262515L;

	@Id
	@Column(name = "result_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private Integer total;
	private Integer timesRolled;

	@ManyToOne
	private Simulation simulation;

	public Result() {
	}

	public Result(Integer total, Integer timesRolled) {
		super();
		this.total = total;
		this.timesRolled = timesRolled;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getTimesRolled() {
		return timesRolled;
	}

	public void setTimesRolled(Integer timesRolled) {
		this.timesRolled = timesRolled;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Simulation getSimulation() {
		return simulation;
	}

	public void setSimulation(Simulation simulation) {
		this.simulation = simulation;
	}
	
}
