package pages.silverscreen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    public static final String MAGNIFIER_SVG_XPATH = "//div/*[@id='svg-icon-search']";
    public static final String SEARCH_TEXT_FIELD_XPATH = "//div/*[@placeholder='Поиск']";
    public static final String START_SEARCH_BUTTON_XPATH = "//button/*[@id='svg-icon-search']";

    public static final String SIGN_IN_BUTTON_XPATH = "//*[@class='sc-eIHaNI fhfuYI']";
    public static final String EMAIL_INPUT_XPATH = "//input[@type='email']";
    public static final String PASSWORD_INPUT_XPATH = "//input[@type='password']";
    public static final String ENTER_BUTTON_XPATH = "//div[@class='sc-imABML hPiJzp sc-hUfwpO wVnOq']/button";
    public static final String MY_LEVEL_TEXT_XPATH =
            "//*[@id=\"root\"]/header/div/div/div/div[3]/div[2]/div[3]/div[1]/div[2]/div/div/div/div/div[1]/div[1]/span";

    public static final String NO_SUCH_USER_SPAN_XPATH = "//span[contains(text(),'Пользователь не найден')]";
    public static final String FILL_EMAIL_FIELD_SPAN_XPATH = "//div[contains(text(),'Необходимо заполнить поле \"E-mail\"')]";

    static WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public static WebElement webElementMagnifierSvg() {
        return driver.findElement(By.xpath(MAGNIFIER_SVG_XPATH));
    }

    public static WebElement webElementSearchTextField() {
        return driver.findElement(By.xpath(SEARCH_TEXT_FIELD_XPATH));
    }

    public static WebElement webElementStartSearchButton() {
        return driver.findElement(By.xpath(START_SEARCH_BUTTON_XPATH));
    }

    public static WebElement webElementSignInButton() {
        return driver.findElement(By.xpath(SIGN_IN_BUTTON_XPATH));
    }

    public static WebElement webElementEmailInput() {
        return driver.findElement(By.xpath(EMAIL_INPUT_XPATH));
    }

    public static WebElement webElementPasswordInput() {
        return driver.findElement(By.xpath(PASSWORD_INPUT_XPATH));
    }

    public static WebElement webElementEnterButton() {
        return driver.findElement(By.xpath(ENTER_BUTTON_XPATH));
    }

    public static WebElement webElementMyLevelText() {
        return driver.findElement(By.xpath(MY_LEVEL_TEXT_XPATH));
    }

    public static WebElement webElementNoSuchUserSpan() {
        return driver.findElement(By.xpath(NO_SUCH_USER_SPAN_XPATH));
    }

    public static WebElement webElementFillEmailFieldSpan() {
        return driver.findElement(By.xpath(FILL_EMAIL_FIELD_SPAN_XPATH));
    }

}
