package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/HorizontalSlider",
        glue = {"HorizontalSlider"},
        plugin = {"pretty", "html:target/SystemReports/html",
                "json: target/SystemReports/json/cucumber.json"},
        tags = {"@Slider"}

)
public class TestRunner {
}
