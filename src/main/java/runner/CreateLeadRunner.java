package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(features="src/main/java/feature/CreateLead.feature", glue = "definitionfile",monochrome=true,tags="@sanity")
@RunWith(Cucumber.class)

public class CreateLeadRunner {
}
