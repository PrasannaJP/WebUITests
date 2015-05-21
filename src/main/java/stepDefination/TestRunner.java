package stepDefination;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Feature"
		,glue={"stepDefination"}
		,dryRun = true
		,monochrome = false
		,format = {"json:JsonReport/cucumber.json"}
		,tags={"@Search"}
				
		)

public class TestRunner {

}
