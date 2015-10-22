package JavaMoneyExampleKata;

public class ReportItem {

	private String instrument;
	private int shares;
	private int price;
	private String currency;

	public ReportItem(String instrument, int shares, int price) {
		this(instrument, shares, price, "USD");
	}

	public ReportItem(String instrument, int shares, int price, String currency) {
		this.instrument = instrument;
		this.shares = shares;
		this.price = price;
		this.currency = currency;
	}

	public String instrument() {
		return instrument;
	}
	
	public String shares() {
		return Integer.toString(shares);
	}
	
	public String price() {
		return Integer.toString(price);
	}
	
	public String currency() {
		return currency;
	}
	
	public int total() {
		return shares * price;
	}
}
