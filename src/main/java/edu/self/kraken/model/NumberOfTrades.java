package edu.self.kraken.model;

import java.util.List;

public class NumberOfTrades {

	private List<Integer> t = null;

	public NumberOfTrades() {
		super();
	}

	public NumberOfTrades(List<Integer> t) {
		super();
		this.t = t;
	}

	public List<Integer> getT() {
		return t;
	}

	public void setT(List<Integer> t) {
		this.t = t;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("NumberOfTrades [t=").append(t).append("]");
		return builder.toString();
	}

}
