package JavaMoneyExampleKata;

import java.util.HashMap;
import java.util.Map;

public class StubStockMarket implements StockMarket {
	
	HashMap<String, HashMap<String, Double>> changeRates = new HashMap<String, HashMap<String, Double>>() {{
		put("CHF", new HashMap<String, Double>() {{
			put("USD", 1.5);
		}});
	}};
	

	@Override
	public Double getChangeRate(String fromCurrency, String toCurrency) {
		if(fromCurrency == toCurrency)
			return 1.0;
		
		return changeRates.get(fromCurrency).get(toCurrency);
	}

}
