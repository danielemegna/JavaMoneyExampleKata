package JavaMoneyExampleKata;

import java.util.Iterator;

public class ReportPrinter {

	private static final String REPORT_HEADER = "Instrument\t\tShares\t\tPrice\t\tTotal\n";

	public String print(Report report) {
		StringBuilder print = new StringBuilder();
		
		print.append(REPORT_HEADER);

		Iterator<ReportItem> itemsIterator = report.items();
		while(itemsIterator.hasNext()) {
			ReportItem item = itemsIterator.next();
			print.append(item.instrument() + "\t\t" + item.shares() + "\t\t" + item.price() + "\t\t" + item.total() + "\n");
		}
		
		print.append("\t\t\t\t\t\tTotal\t\t" + report.total());
		
		return print.toString();
	}

}
