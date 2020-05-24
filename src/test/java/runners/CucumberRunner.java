package runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        glue = {"steps.simple", "steps.gui", "steps.api"},
        features = {"src/test/resources/features/userApiTest.feature"
        },
        monochrome = false,
        snippets = SnippetType.CAMELCASE,
        strict = false)

public class CucumberRunner {
}
