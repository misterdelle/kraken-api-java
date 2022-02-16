package edu.self.kraken.model;

import java.util.List;

public class Volume {

	private List<String> v = null;

	public Volume() {
		super();
	}

	public Volume(List<String> v) {
		super();
		this.v = v;
	}

	public List<String> getV() {
		return v;
	}

	public void setV(List<String> v) {
		this.v = v;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Volume [v=").append(v).append("]");
		return builder.toString();
	}

}
