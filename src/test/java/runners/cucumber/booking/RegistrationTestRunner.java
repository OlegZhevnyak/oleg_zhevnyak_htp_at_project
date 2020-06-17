package runners.cucumber.booking;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        glue = {"driver", "settings", "pages.booking", "pages.trash_mail", "pages.yandex_mail",
                "steps", "steps.booking", "steps.trash_mail","steps.yandex_mail", "steps.gui",
                "cucumber_scenarios.booking"},
        features = {"src/test/resources/features/booking/registrationTest.feature"},
        monochrome = false,
        snippets = SnippetType.CAMELCASE,
        strict = false)
public class RegistrationTestRunner {
}
