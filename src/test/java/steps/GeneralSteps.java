package steps;

import org.openqa.selenium.WebDriver;
import settings.DriverScreenSettings;
import settings.ScreenMode;

public class GeneralSteps {

    public static void openPage(WebDriver driver, String url, ScreenMode screenMode){
        DriverScreenSettings.setScreenMode(screenMode, driver);
        driver.get(url);
    }

    public static void destroyDriver(WebDriver driver){
        driver.close();
        driver.quit();
    }

}
