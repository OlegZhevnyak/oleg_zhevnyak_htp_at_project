package pages.booking;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import steps.booking.SimpleSteps;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class StaysHomePage {

    public static void setCityDateGuests(WebDriver driver, String City, int startThrough, int duration,
                                         int numberOfAdults, int numberOfChildren, int numberOfRooms){
        WebElement element = driver.findElement(By.xpath("//*[@id=\"ss\"]"));
        element.sendKeys(Keys.chord(Keys.CONTROL, "a"), City);
        SimpleSteps.findElementClick(driver, "//*[contains(@class, \"xp__input-group xp__date-time\")]");
        SimpleSteps.findElementClick(driver, String.format("//*[contains(@data-date, \"%s\")]", setDays(startThrough)));
        SimpleSteps.findElementClick(driver, String.format("//*[contains(@data-date, \"%s\")]", setDays(duration + startThrough)));
        SimpleSteps.findElementClick(driver, "//*[@id=\"xp__guests__toggle\"]");
        int adultAmount = Integer.parseInt(SimpleSteps.findElementGetAttribute(driver,
                "//*[contains(@class,\"field-adult\")]//input", "value"));
        SimpleSteps.findElementClickRepeat(driver,
                "//*[contains(@aria-describedby, \"adult\")][contains(@class, \"add\")]", adultAmount, numberOfAdults);
        int roomAmount = Integer.parseInt(SimpleSteps.findElementGetAttribute(driver,
                "//*[contains(@class,\"field-rooms\")]//input", "value"));
        SimpleSteps.findElementClickRepeat(driver, "//*[contains(@aria-describedby, \"no_rooms_desc\")]" +
                "[contains(@class, \"add\")]", roomAmount, numberOfChildren);
        int childAmount = Integer.parseInt(SimpleSteps.findElementGetAttribute(driver,
                "//*[@id=\"group_children\"]", "value"));
        SimpleSteps.findElementClickRepeat(driver, "//*[contains(@aria-describedby, \"group_children_desc\")]" +
                "[contains(@class, \"add\")]", childAmount, numberOfRooms);
        SimpleSteps.findElementClick(driver, "//*[contains(@type, \"submit\")]");
    }

    public static String setDays(int daysAmount) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, daysAmount);
        Date newDate = calendar.getTime();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return dateFormat.format(newDate);
    }

}
