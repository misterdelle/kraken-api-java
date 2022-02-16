package edu.self.kraken.model;

public class Error {

	private String error;

	public Error() {

	}

	public Error(String error) {
		super();
		this.error = error;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Error [error=").append(error).append("]");
		return builder.toString();
	}

}
