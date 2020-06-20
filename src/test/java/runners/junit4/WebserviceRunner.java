package runners.junit4;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.web_service.*;

@RunWith(Suite.class)
@Suite.SuiteClasses({SearchUserByPartialShortNameTest.class, SearchUserByPartialLongNameTest.class,
        SearchUserByFullShortNameTest.class, SearchUserByFullLongNameTest.class,
        SearchAllUsersTest.class})

public class WebserviceRunner {
}
