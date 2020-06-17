package runners.cucumber.web_service;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        glue = {"driver", "settings", "pages.web_service",
                "steps", "steps.web_service",
                "cucumber_scenarios.web_service"},
        features = {"src/test/resources/features/web_service/searchUsersTests.feature"},
        monochrome = false,
        snippets = SnippetType.CAMELCASE,
        strict = false)
public class SearchUsersScenario {
}
