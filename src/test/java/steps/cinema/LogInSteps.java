package steps.cinema;

import driver.GetDriver;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pages.silverscreen.HomePage;
import pages.silverscreen.SearchResultsPage;
import driver.settings.DriverConfig;

import java.util.concurrent.TimeUnit;

public class LogInSteps {

    static HomePage homePage = new HomePage(GetDriver.getWebDriver(DriverConfig.CHROME));
    static SearchResultsPage searchResultsPage = new SearchResultsPage(GetDriver.getWebDriver(DriverConfig.CHROME));

    public static Logger logger = Logger.getLogger(SearchMovieSteps.class);

    public static void logIn(WebDriver driver, String string, String string2) throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        homePage.webElementSignInButton().click();
        homePage.webElementSignInButton().click();
        homePage.webElementEmailInput().sendKeys(string);
        homePage.webElementPasswordInput().sendKeys(string2);
        homePage.webElementEnterButton().click();
    }

    public static boolean compareUserLevel(WebDriver driver, String string) {
        boolean compareCondition = false;
        String filmDescription = homePage.webElementMyLevelText().getText();
        System.out.println(filmDescription);
        return compareCondition = filmDescription.contains(string);
    }

    public static boolean checkNoSuchUserMessage(WebDriver driver, String string) {
        boolean compareCondition = false;
        String filmDescription = homePage.webElementNoSuchUserSpan().getText();
        return compareCondition = filmDescription.contains(string);
    }

}
