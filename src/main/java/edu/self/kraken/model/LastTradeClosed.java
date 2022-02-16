package edu.self.kraken.model;

import java.util.List;

public class LastTradeClosed {

	private List<String> c = null;

	public LastTradeClosed() {
		super();
	}

	public LastTradeClosed(List<String> c) {
		super();
		this.c = c;
	}

	public List<String> getC() {
		return c;
	}

	public void setC(List<String> c) {
		this.c = c;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LastTradeClosed [c=").append(c).append("]");
		return builder.toString();
	}

}
