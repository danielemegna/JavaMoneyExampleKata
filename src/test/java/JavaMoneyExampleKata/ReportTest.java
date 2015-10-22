package JavaMoneyExampleKata;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class ReportTest {
	
	@Test
	public void reportReturnsTotalCorrectly() {
		Report report = new Report();
		report.add(new ReportItem("IBM", 1000, 25));
		report.add(new ReportItem("GE", 400, 100));
		
		assertEquals(65000, report.total());
	}
}
