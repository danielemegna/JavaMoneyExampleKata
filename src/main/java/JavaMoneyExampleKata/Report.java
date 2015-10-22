package JavaMoneyExampleKata;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Report {

	private List<ReportItem> items = new ArrayList<>();
	private String mainCurrency;
	private MoneyExchanger moneyExchanger;

	public Report(String mainCurrency, MoneyExchanger moneyExchanger) {
		this.mainCurrency = mainCurrency;
		this.moneyExchanger = moneyExchanger;
	}

	public Report() {
		this("USD", new FakeMoneyExchanger());
	}

	public void add(ReportItem reportItem) {
		this.items.add(reportItem);
	}

	public int total() {
		int total = 0;
		for(ReportItem item : items)
			total += calcolateReportItemTotal(item);
		
		return total;
	}

	private int calcolateReportItemTotal(ReportItem item) {
		return moneyExchanger.change(item.total(), item.currency(), mainCurrency);
	}

	public Iterator<ReportItem> items() {
		return items.iterator();
	}

}
