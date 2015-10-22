package JavaMoneyExampleKata;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReportItemTest {
	
	@Test
	public void reportItemReturnsTotalCorrectly() {
		ReportItem reportItem = new ReportItem("IMB", 1000, 25);
		assertEquals(1000 * 25, reportItem.total());
	}

}
