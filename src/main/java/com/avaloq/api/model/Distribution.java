package com.avaloq.api.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class Distribution implements Serializable {

	private static final long serialVersionUID = 3120904692211522512L;

	private Integer sum;
	private Integer timesRolled;
	private BigDecimal percentage;

	public Distribution(Integer sum, Integer timesRolled, BigDecimal percentage) {
		super();
		this.sum = sum;
		this.timesRolled = timesRolled;
		this.percentage = percentage;
	}

	public Integer getSum() {
		return sum;
	}

	public void setSum(Integer sum) {
		this.sum = sum;
	}

	public Integer getTimesRolled() {
		return timesRolled;
	}

	public void setTimesRolled(Integer timesRolled) {
		this.timesRolled = timesRolled;
	}

	public BigDecimal getPercentage() {
		return percentage;
	}

	public void setPercentage(BigDecimal percentage) {
		this.percentage = percentage;
	}

}
