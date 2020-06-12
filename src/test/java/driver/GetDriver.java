package driver;

import org.openqa.selenium.WebDriver;
import settings.DriverConfig;

public class GetDriver {

    private static ThreadLocal<WebDriver> webDriver = new ThreadLocal<WebDriver>();

    public static WebDriver getWebDriver(DriverConfig config) {
        if (webDriver.get() == null)
            webDriver.set(GetDriverManager.getDriver(config));
        return webDriver.get();
    }
}
