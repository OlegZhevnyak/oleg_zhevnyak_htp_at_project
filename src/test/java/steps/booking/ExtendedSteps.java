package steps.booking;

import com.sun.org.apache.xpath.internal.operations.Bool;
import driver.GetDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.booking.SearchResultPage;
import settings.DriverConfig;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ExtendedSteps {

    public static String setDate(int days) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, days);
        Date tenDays = calendar.getTime();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String datePlusTreeDays = dateFormat.format(tenDays);
        return datePlusTreeDays;
    }

}
