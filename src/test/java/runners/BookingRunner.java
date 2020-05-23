package runners;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.ChangeColorTest;
import tests.HighestPriceTest;
import tests.LowestPriceTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({HighestPriceTest.class, LowestPriceTest.class, ChangeColorTest.class})

public class BookingRunner {
}
