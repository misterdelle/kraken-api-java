package edu.self.kraken;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

import edu.self.kraken.api.KrakenApi;
import edu.self.kraken.api.KrakenApi.Method;
import edu.self.kraken.model.AssetTickerInfoResponse;
import jakarta.json.bind.Jsonb;
import jakarta.json.bind.JsonbBuilder;
import jakarta.json.bind.JsonbConfig;
import jakarta.json.bind.config.PropertyNamingStrategy;

public class Examples {

	private static JsonbConfig config = new JsonbConfig()
			.withPropertyNamingStrategy(PropertyNamingStrategy.IDENTITY);
	private static Jsonb jsonb = JsonbBuilder.create(config);

	public static void main(String[] args) throws IOException, InvalidKeyException, NoSuchAlgorithmException {

		KrakenApi api = new KrakenApi();
		api.setKey("XNBEojNDIpMsESbywof6aBs9dDSx5K2yetR3HwaeHz5HU8SygaKIgQdM");
		api.setSecret("vC3ICfW9dVn+O51PSXwODZo4jSwVzQXEWZt1dSQWevaW1qWrZAMUR3R1hxz9VM6K5yG3s+XbWeXRfvtylxUIqg==");

		String response;
		Map<String, String> input = new HashMap<>();

//        input.put("pair", "XBTEUR");
		input.put("pair", "BTCUSDT");
		response = api.queryPublic(Method.TICKER, input);
		System.out.println(response);

		AssetTickerInfoResponse assetTickerInfoResponse = jsonb.fromJson(response, AssetTickerInfoResponse.class);
		System.out.println(assetTickerInfoResponse);

//		input.clear();
//		input.put("pair", "XBTEUR,XBTLTC");
//		response = api.queryPublic(Method.ASSET_PAIRS, input);
//		System.out.println(response);
//
//		input.clear();
//		input.put("asset", "ZEUR");
//		response = api.queryPrivate(Method.BALANCE, input);
//		System.out.println(response);
	}
}
