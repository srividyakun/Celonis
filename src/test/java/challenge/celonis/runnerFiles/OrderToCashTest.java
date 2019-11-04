package challenge.celonis.runnerFiles;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(features = { "resources/featureFiles" }, tags = { "@OrderToCash" }, glue = {
		"challenge.celonis.runnerFiles", "challenge.celonis.pageObjectFiles", "challenge.celonis.pageFiles",
		"challenge.celonis.stepDefinationFiles","challenge.celonis.utils" }, plugin = { "json:target/cucumberLogin.json" })
public class OrderToCashTest {

}
