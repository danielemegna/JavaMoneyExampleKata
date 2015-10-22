package JavaMoneyExampleKata;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Report {

	private List<ReportItem> items = new ArrayList<>();
	private String mainCurrency = null;

	public Report(String mainCurrency) {
		this.mainCurrency = mainCurrency;
	}

	public Report() {
		// TODO Auto-generated constructor stub
	}

	public void add(ReportItem reportItem) {
		this.items.add(reportItem);
	}

	public int total() {
		int total = 0;
		for(ReportItem item : items)
			total += item.total();
		
		return total;
	}

	public Iterator<ReportItem> items() {
		return items.iterator();
	}

}
