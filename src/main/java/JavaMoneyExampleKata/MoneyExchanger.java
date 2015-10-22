package JavaMoneyExampleKata;

public class MoneyExchanger {

	private StockMarket stockMarket;

	public MoneyExchanger(StockMarket stockMarket) {
		this.stockMarket = stockMarket;
	}

	public int change(int amount, String fromCurrency, String toCurrency) {
		double changeRate = stockMarket.getChangeRate(fromCurrency, toCurrency);
		return (int) (amount / changeRate);
	}

}
