package edu.self.kraken.model;

import java.util.List;

public class VolumeWeightedAvgPrice {

	private List<String> p = null;

	public VolumeWeightedAvgPrice() {
		super();
	}

	public VolumeWeightedAvgPrice(List<String> p) {
		super();
		this.p = p;
	}

	public List<String> getP() {
		return p;
	}

	public void setP(List<String> p) {
		this.p = p;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("VolumeWeightedAvgPrice [p=").append(p).append("]");
		return builder.toString();
	}

}
