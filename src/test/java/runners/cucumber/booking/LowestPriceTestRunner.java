package runners.cucumber.booking;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        glue = {"driver", "driver.settings", "pages.booking", "pages.yandex_mail",
                "steps", "steps.booking", "steps.yandex_mail", "cucumber_scenarios.booking"},
        features = {"src/test/resources/features/booking/lowestPriceTest.feature"},
        monochrome = false,
        snippets = SnippetType.CAMELCASE,
        strict = false)
public class LowestPriceTestRunner {
}
