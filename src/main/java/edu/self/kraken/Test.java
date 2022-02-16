package edu.self.kraken;

import java.util.ArrayList;
import java.util.List;

import edu.self.kraken.model.AskPrice;
import edu.self.kraken.model.AssetTickerInfo;
import edu.self.kraken.model.AssetTickerInfoDetail;
import edu.self.kraken.model.BidPrice;
import edu.self.kraken.model.High;
import edu.self.kraken.model.LastTradeClosed;
import edu.self.kraken.model.Low;
import edu.self.kraken.model.NumberOfTrades;
import edu.self.kraken.model.TodayOpeningPrice;
import edu.self.kraken.model.Volume;
import edu.self.kraken.model.VolumeWeightedAvgPrice;
import jakarta.json.bind.Jsonb;
import jakarta.json.bind.JsonbBuilder;
import jakarta.json.bind.JsonbConfig;
import jakarta.json.bind.config.PropertyNamingStrategy;

public class Test {

	private static JsonbConfig config = new JsonbConfig().withPropertyNamingStrategy(PropertyNamingStrategy.IDENTITY);
	private static Jsonb jsonb = JsonbBuilder.create(config);

	public static void main(String[] args) {
		Test test = new Test();
		test.doIt();

	}

	private void doIt() {
		List<String> a = new ArrayList<>();
		a.add("42206.70000");
		a.add("1");
		a.add("1.000");
		AskPrice askPrice = new AskPrice(a);
		System.out.println(askPrice);

		List<String> b = new ArrayList<>();
		b.add("42198.80000");
		b.add("1");
		b.add("1.000");
		BidPrice bidPrice = new BidPrice(b);
		System.out.println(bidPrice);

		List<String> c = new ArrayList<>();
		c.add("42201.20000");
		c.add("0.00500000");
		LastTradeClosed lastTradeClosed = new LastTradeClosed(c);
		System.out.println(lastTradeClosed);

		List<String> v = new ArrayList<>();
		v.add("57.27867016");
		v.add("158.20622509");
		Volume volume = new Volume(v);
		System.out.println(volume);

		List<String> p = new ArrayList<>();
		p.add("42123.73633");
		p.add("42207.44417");
		VolumeWeightedAvgPrice volumeWeightedAvgPrice = new VolumeWeightedAvgPrice(p);
		System.out.println(volumeWeightedAvgPrice);

		List<Integer> t = new ArrayList<>();
		t.add(899);
		t.add(1909);
		NumberOfTrades numberOfTrades = new NumberOfTrades(t);
		System.out.println(numberOfTrades);

		List<String> l = new ArrayList<>();
		l.add("41586.40000");
		l.add("41586.40000");
		Low low = new Low(l);
		System.out.println(low);

		List<String> h = new ArrayList<>();
		h.add("42430.50000");
		h.add("42715.40000");
		High high = new High(h);
		System.out.println(high);

		String o = "42079.80000";
		TodayOpeningPrice todayOpeningPrice = new TodayOpeningPrice(o);
		System.out.println(todayOpeningPrice);

//		Pair pair = new Pair();
//		pair.setPair("XBTUSDT");
//		pair.setA(a);
//		pair.setB(b);
//		pair.setC(c);
//		pair.setV(v);
//		pair.setP(p);
//		pair.setT(t);
//		pair.setL(l);
//		pair.setH(h);
//		pair.setO(o);
//		System.out.println(pair);

		AssetTickerInfo assetTickerInfo = new AssetTickerInfo();
		assetTickerInfo.setPair("XBTUSDT");

		AssetTickerInfoDetail assetTickerInfoDetail = new AssetTickerInfoDetail();
		assetTickerInfoDetail.setA(a);
		assetTickerInfoDetail.setB(b);
		assetTickerInfoDetail.setC(c);
		assetTickerInfoDetail.setV(v);
		assetTickerInfoDetail.setP(p);
		assetTickerInfoDetail.setT(t);
		assetTickerInfoDetail.setL(l);
		assetTickerInfoDetail.setH(h);
		assetTickerInfoDetail.setO(o);
		assetTickerInfo.setAssetTickerInfoDetail(assetTickerInfoDetail);
		System.out.println(assetTickerInfo);

		String askPriceJson = jsonb.toJson(askPrice);
		System.out.println(askPriceJson);

		String bidPriceJson = jsonb.toJson(bidPrice);
		System.out.println(bidPriceJson);

		String lastTradeClosedJson = jsonb.toJson(lastTradeClosed);
		System.out.println(lastTradeClosedJson);

		String volumeJson = jsonb.toJson(volume);
		System.out.println(volumeJson);

		String volumeWeightedAvgPriceJson = jsonb.toJson(volumeWeightedAvgPrice);
		System.out.println(volumeWeightedAvgPriceJson);

		String numberOfTradesJson = jsonb.toJson(numberOfTrades);
		System.out.println(numberOfTradesJson);

		String lowJson = jsonb.toJson(low);
		System.out.println(lowJson);

		String highJson = jsonb.toJson(high);
		System.out.println(highJson);

		String todayOpeningPriceJson = jsonb.toJson(todayOpeningPrice);
		System.out.println(todayOpeningPriceJson);

//		String pairJson = jsonb.toJson(pair);
//		System.out.println(pairJson);

		String assetTickerInfoJson = jsonb.toJson(assetTickerInfo);
		System.out.println(assetTickerInfoJson);

		String newAssetTickerInfoJson = "{\"pair\":\"XBTUSDT\",\"assetTickerInfoDetail\":{\"a\":[\"44218.40000\",\"2\",\"2.000\"],\"b\":[\"44218.30000\",\"1\",\"1.000\"],\"c\":[\"44218.30000\",\"0.00014115\"],\"v\":[\"42.22801379\",\"169.26233669\"],\"p\":[\"44071.72980\",\"44154.79157\"],\"t\":[737,2765],\"l\":[\"43687.40000\",\"43687.40000\"],\"h\":[\"44552.60000\",\"44722.60000\"],\"o\":\"44552.50000\"}}";
		System.out.println(newAssetTickerInfoJson);

		AssetTickerInfo azz = jsonb.fromJson(newAssetTickerInfoJson, AssetTickerInfo.class);
		System.out.println(azz);

	}

}
