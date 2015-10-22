package JavaMoneyExampleKata;

import java.util.Iterator;

public class ReportPrinter {

	private StringBuilder printResult = null;

	public String print(Report report) {
		initNewPrint();
		
		appendHeader();
		appendReportItemsRows(report);
		appendFooterTotal(report);
		
		return printResultString();
	}

	private void initNewPrint() {
		printResult = new StringBuilder();
	}

	private void appendHeader() {
		printResult.append("Instrument\t\tShares\t\tPrice\t\tTotal\n");
	}
	
	private void appendReportItemsRows(Report report) {
		Iterator<ReportItem> itemsIterator = report.items();
		while(itemsIterator.hasNext())
			appendReportItemRow(itemsIterator.next());
	}
	
	private void appendReportItemRow(ReportItem item) {
		printResult.append(
			item.instrument() + "\t\t" + item.shares() + "\t\t" + item.price() + "\t\t" + item.total() + "\n"
		);
	}
	
	private void appendFooterTotal(Report report) {
		printResult.append("\t\t\t\t\t\tTotal\t\t" + report.total());
	}
	
	private String printResultString() {
		return printResult.toString();
	}

}
