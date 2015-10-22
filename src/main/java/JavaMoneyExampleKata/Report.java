package JavaMoneyExampleKata;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Report {

	private List<ReportItem> items = new ArrayList<>();

	public void add(ReportItem reportItem) {
		this.items.add(reportItem);
	}

	public int total() {
		return items
			.stream()
			.mapToInt(ReportItem::total)
			.sum();
	}

	public Iterator<ReportItem> items() {
		return items.iterator();
	}

}
