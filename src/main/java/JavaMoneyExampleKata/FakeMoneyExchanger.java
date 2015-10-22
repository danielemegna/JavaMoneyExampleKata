package JavaMoneyExampleKata;

public class FakeMoneyExchanger extends MoneyExchanger {

	public FakeMoneyExchanger() {
		super(null);
	}
	
	@Override
	public int change(int amount, String fromCurrency, String toCurrency) {
		return amount;		
	}

}
