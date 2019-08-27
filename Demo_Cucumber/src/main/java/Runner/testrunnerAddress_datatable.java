package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "F:\\Selenium all\\Cucumber\\Git repository workspace cucumber\\Demo_Cucumber\\src\\main\\java\\Features\\addressDatatable.feature",
		glue={"StepDefinition"}, //the path of the step definition files
		plugin= {"pretty","html:test-output", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //to generate different types of reporting
        dryRun =false,
        monochrome=true,
        strict = true
        )
public class testrunnerAddress_datatable {

}
