package runners.cucumber.cinema;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        glue = {"driver", "settings", "pages.cinema", "steps", "steps.cinema", "steps.trash_mail",
                "steps.yandex_mail", "steps.gui", "cucumber_scenarios.cinema"},
        features = {"src/test/resources/features/cinema/loginAppBlankField.feature"},
        monochrome = false,
        snippets = SnippetType.CAMELCASE,
        strict = false)
public class LogInAppBlankFieldTestRunner {
}
