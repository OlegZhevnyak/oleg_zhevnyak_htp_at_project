package steps.cinema;

import driver.GetDriver;
import org.apache.log4j.Logger;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import pages.silverscreen.HomePage;
import pages.silverscreen.SearchResultsPage;
import driver.settings.DriverConfig;

public class SearchMovieSteps {

    static HomePage homePage = new HomePage(GetDriver.getWebDriver(DriverConfig.CHROME));
    static SearchResultsPage searchResultsPage = new SearchResultsPage(GetDriver.getWebDriver(DriverConfig.CHROME));

    public static Logger logger = Logger.getLogger(SearchMovieSteps.class);

    public static void searchMovie(WebDriver driver, String string) {
        homePage.webElementMagnifierSvg().click();
        homePage.webElementSearchTextField().sendKeys(string);
        homePage.webElementStartSearchButton().click();
    }

    public static int getMoviesAmount(WebDriver driver) {
        String filmsAmountString = searchResultsPage.webElementFoundFilmsAmountText().getText();
        logger.debug("Replace all symbols except numbers from text");
        filmsAmountString = filmsAmountString.replaceAll("[^0-9]+", "");
        logger.debug("Parse String text to int");
        int filmsAmountInt = Integer.parseInt(filmsAmountString);
        return filmsAmountInt;
    }

    public static Boolean isFoundFilmsListPresent(WebDriver driver) {
        Boolean elementCondition = false;
        try {
            logger.debug("Verify that Element displayed.");
            elementCondition = searchResultsPage.webElementFoundFilmsList().isDisplayed();
        } catch (NoSuchElementException e) {
            return elementCondition;
        }
        return elementCondition;
    }

    public static boolean checkAllFoundMoviesDescriptions(WebDriver driver, String string) {
        boolean compareCondition = false;
        searchResultsPage.webElementFirstFilmNameLink().click();
        String filmDescription = searchResultsPage.webElementFilmDescription().getText();
        return compareCondition = filmDescription.contains(string);
    }

    public static boolean checkFillEmailFieldMessage(WebDriver driver, String string) {
        boolean compareCondition = false;
        String filmDescription = homePage.webElementFillEmailFieldSpan().getText();
        return compareCondition = filmDescription.contains(string);
    }

}
