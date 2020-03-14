package com.avaloq.api.model;

public class Result {
	
	private Integer total;
	private Integer timesRolled;
	
	
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
	

}
