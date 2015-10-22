package JavaMoneyExampleKata;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoneyExchangerTest {

	@Test
	public void foo() {
		
		MoneyExchanger exchanger = new MoneyExchanger(
			new StubStockMarket()
		);
		
		int expected = (int) (60000 / 1.5);
		int actual = exchanger.change(60000, "CHF", "USD");
		
		assertEquals(expected, actual);
	}
	
}
