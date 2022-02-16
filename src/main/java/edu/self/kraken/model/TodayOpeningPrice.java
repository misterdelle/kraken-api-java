package edu.self.kraken.model;

public class TodayOpeningPrice {

	private String o = null;

	public TodayOpeningPrice() {
		super();
	}

	public TodayOpeningPrice(String o) {
		super();
		this.o = o;
	}

	public String getO() {
		return o;
	}

	public void setO(String o) {
		this.o = o;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TodayOpeningPrice [o=").append(o).append("]");
		return builder.toString();
	}

}
