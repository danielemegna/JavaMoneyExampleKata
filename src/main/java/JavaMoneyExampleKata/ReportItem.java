package JavaMoneyExampleKata;

public class ReportItem {

	private String instrument;
	private int shares;
	private int price;

	public ReportItem(String instrument, int shares, int price) {
		this.instrument = instrument;
		this.shares = shares;
		this.price = price;
	}

	public int total() {
		return shares * price;
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

}
