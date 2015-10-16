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
}
