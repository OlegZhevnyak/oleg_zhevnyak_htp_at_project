package runners.junit4;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.booking.ChangeColorTest;
import tests.booking.HighestPriceTest;
import tests.booking.LowestPriceTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({HighestPriceTest.class, LowestPriceTest.class, ChangeColorTest.class})

public class BookingRunner {
}
