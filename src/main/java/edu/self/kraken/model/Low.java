package edu.self.kraken.model;

import java.util.List;

public class Low {

	private List<String> l = null;

	public Low() {
		super();
	}

	public Low(List<String> l) {
		super();
		this.l = l;
	}

	public List<String> getL() {
		return l;
	}

	public void setL(List<String> l) {
		this.l = l;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Low [l=").append(l).append("]");
		return builder.toString();
	}

}
