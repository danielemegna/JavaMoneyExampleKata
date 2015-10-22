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

}
