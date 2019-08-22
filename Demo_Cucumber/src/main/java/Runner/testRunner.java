package Runner;

import org.junit.runner.RunWith;


//format options is deprecated, instead of this use plugin

/*
Note : cucumber option 

dryRun = It is used to check one to one mapping between feature and step definition file
*/

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\ADMIN\\eclipse-workspace1\\Demo_Cucumber\\src\\main\\java\\Features\\login.feature",
		glue={"StepDefinition"}, //the path of the step definition files
		plugin= {"pretty","html:test-output", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //to generate different types of reporting
        dryRun =false,
        monochrome=true,
        strict = true
        )
public class testRunner {

	
	
}
