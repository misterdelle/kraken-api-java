package edu.self.kraken.model;

import java.util.List;

public class AskPrice {
	private List<String> a = null;

	public AskPrice() {
		super();
	}

	public AskPrice(List<String> a) {
		super();
		this.a = a;
	}

	public List<String> getA() {
		return a;
	}

	public void setA(List<String> a) {
		this.a = a;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AskPrice [a=").append(a).append("]");
		return builder.toString();
	}
	
}
