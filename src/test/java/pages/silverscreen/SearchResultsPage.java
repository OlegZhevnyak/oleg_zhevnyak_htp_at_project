package pages.silverscreen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResultsPage {

    public static final String FOUND_FILMS_AMOUNT_TEXT_XPATH = "//*[@class='sc-irsooP iVzzKK']/h2";
    public static final String FOUND_FILMS_LIST_XPATH = "//*[@class='sc-hpAzQi fwyoFB']";
    public static final String FIRST_FILM_NAME_LINK_XPATH = "//*[@class='sc-hpAzQi fwyoFB']/div[1]/div/div/a";
    public static final String FILM_DESCRIPTION_XPATH = "//*[@class='sc-whdbJ ghEKaE']/span";

    static WebDriver driver;

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    public static WebElement webElementFoundFilmsAmountText() {
        return driver.findElement(By.xpath(FOUND_FILMS_AMOUNT_TEXT_XPATH));
    }

    public static WebElement webElementFoundFilmsList() {
        return driver.findElement(By.xpath(FOUND_FILMS_LIST_XPATH));
    }

    public static WebElement webElementFirstFilmNameLink() {
        return driver.findElement(By.xpath(FIRST_FILM_NAME_LINK_XPATH));
    }

    public static WebElement webElementFilmDescription() {
        return driver.findElement(By.xpath(FILM_DESCRIPTION_XPATH));
    }

}
