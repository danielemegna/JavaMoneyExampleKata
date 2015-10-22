package JavaMoneyExampleKata;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReportPrinterTest {

	@Test
	public void print() {
		ReportPrinter printer = new ReportPrinter();
		
		Report report = new Report();
		report.add(new ReportItem("IBM", 1000, 25));
		report.add(new ReportItem("GE", 400, 100));
		
		String expected = "Instrument\t\tShares\t\tPrice\t\tTotal\n"
				+ "IBM\t\t1000\t\t25\t\t25000\n"
				+ "GE\t\t400\t\t100\t\t40000\n"
				+ "\t\t\t\t\t\tTotal\t\t65000";
		
		String actual = printer.print(report);
		
		assertEquals(expected, actual);
	}
	
}
