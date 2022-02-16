package edu.self.kraken.model;

import java.util.List;

public class AssetTickerInfoResponse {

	private List<Error> error;

	private AssetTickerInfo result;

	public AssetTickerInfoResponse() {

	}

	public AssetTickerInfoResponse(List<Error> error, AssetTickerInfo result) {
		super();
		this.error = error;
		this.result = result;
	}

	public List<Error> getError() {
		return error;
	}

	public void setError(List<Error> error) {
		this.error = error;
	}

	public AssetTickerInfo getResult() {
		return result;
	}

	public void setResult(AssetTickerInfo result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "AssetTickerInfoResponse [error=" + error + ", result=" + result + "]";
	}

}
