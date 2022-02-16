package edu.self.kraken.model;

public class AssetTickerInfo {
	private String pair;

	AssetTickerInfoDetail assetTickerInfoDetail;

	public AssetTickerInfo() {
		super();
	}

	public AssetTickerInfo(String pair, AssetTickerInfoDetail assetTickerInfoDetail) {
		super();
		this.pair = pair;
		this.assetTickerInfoDetail = assetTickerInfoDetail;
	}

	public String getPair() {
		return pair;
	}

	public void setPair(String pair) {
		this.pair = pair;
	}

	public AssetTickerInfoDetail getAssetTickerInfoDetail() {
		return assetTickerInfoDetail;
	}

	public void setAssetTickerInfoDetail(AssetTickerInfoDetail assetTickerInfoDetail) {
		this.assetTickerInfoDetail = assetTickerInfoDetail;
	}

	@Override
	public String toString() {
		return "AssetTickerInfo [pair=" + pair + ", assetTickerInfoDetail=" + assetTickerInfoDetail + "]";
	}

}
