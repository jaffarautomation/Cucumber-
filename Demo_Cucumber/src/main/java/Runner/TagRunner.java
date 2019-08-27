package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "F:\\Selenium all\\Cucumber\\Git repository workspace cucumber\\Demo_Cucumber\\src\\main\\java\\Features\\tag.feature",
		glue={"StepDefinition"}, //the path of the step definition files
		plugin= {"pretty","html:test-output", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //to generate different types of reporting
        dryRun =false,
        monochrome=true,
        strict = true,
        tags = {"@SmokeTest,@RegressionTest"}
        )

//tags = {"@SmokeTest","@RegressionTest"} this means ADD condition , will execute both which contains both tags
////tags = {"@SmokeTest, @RegressionTest"} this means OR condition , will execute method which have either one of the tag present

public class TagRunner {

}
