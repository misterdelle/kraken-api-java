package edu.self.kraken.model;

import java.util.List;

public class High {

	private List<String> h = null;

	public High() {
		super();
	}

	public High(List<String> h) {
		super();
		this.h = h;
	}

	public List<String> getH() {
		return h;
	}

	public void setH(List<String> h) {
		this.h = h;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("High [h=").append(h).append("]");
		return builder.toString();
	}

}
