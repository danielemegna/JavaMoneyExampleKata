package mvntest;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest extends TestCase
{
    public AppTest( String testName ) {
        super( testName );
    }

    public static Test suite() {
        return new TestSuite( AppTest.class );
    }

    public void testSimpleMoneySum() {
      Dollar fiveBucks = new Dollar(5);
      Dollar threeBucks = new Dollar(3);

      assertEquals(new Dollar(8), fiveBucks.add(threeBucks));
    }
}
