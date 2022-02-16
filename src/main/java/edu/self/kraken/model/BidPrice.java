package edu.self.kraken.model;

import java.util.List;

public class BidPrice {
	private List<String> b = null;

	public BidPrice() {
		super();
	}

	public BidPrice(List<String> b) {
		super();
		this.b = b;
	}

	public List<String> getB() {
		return b;
	}

	public void setB(List<String> b) {
		this.b = b;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BidPrice [b=").append(b).append("]");
		return builder.toString();
	}

}
