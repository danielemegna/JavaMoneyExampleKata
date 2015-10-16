package mvntest;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

public class AppTest
{
    @Test
    public void simpleDollarsSum() {
      Banknote fiveBucks = Banknote.dollar(5);
      Banknote threeBucks = Banknote.dollar(3);

      assertEquals(Banknote.dollar(8), fiveBucks.add(threeBucks));
    }

    @Test
    public void simpleDollarsMoltiplication() {
      Banknote fiveBucks = Banknote.dollar(5);

      assertEquals(Banknote.dollar(10), fiveBucks.times(2));
    }

    @Test
    public void simpleEurosMoltiplication() {
      Banknote fiveEuro = Banknote.euro(5);

      assertEquals(Banknote.euro(10), fiveEuro.times(2));
    }

    @Test
    public void simpleEurosSum() {
      Banknote fiveEuro = Banknote.euro(5);
      Banknote fourEuro = Banknote.euro(4);

      assertEquals(Banknote.euro(9), fiveEuro.add(fourEuro));
    }
}
