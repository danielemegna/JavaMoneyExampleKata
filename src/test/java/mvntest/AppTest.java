package mvntest;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

public class AppTest
{
    @Test
    public void simpleDollarsSum() {
      Dollar fiveBucks = new Dollar(5);
      Dollar threeBucks = new Dollar(3);

      assertEquals(new Dollar(8), fiveBucks.add(threeBucks));
    }

    @Test
    public void simpleDollarsMoltiplication() {
      Dollar fiveBucks = new Dollar(5);

      assertEquals(new Dollar(10), fiveBucks.times(2));
    }

    @Test
    public void simpleEurosMoltiplication() {
      Euro fiveEuro = new Euro(5);

      assertEquals(new Euro(10), fiveEuro.times(2));
    }
}
