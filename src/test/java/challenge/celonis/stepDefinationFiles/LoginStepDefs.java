package challenge.celonis.stepDefinationFiles;

import challenge.celonis.pageFiles.LoginPage;
import challenge.celonis.utils.TestBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class LoginStepDefs  extends TestBase {

	LoginPage loginpage = new LoginPage();
	
	@Given("^I am on celonis cloud login page$")
	public void i_am_on_celonis_cloud_login_page() throws Throwable {
    	loginpage.openUrl();
    }

    @And("^I Login with valid credentials$")
    public void i_Login_with_valid_credentials() throws Throwable {
    	loginpage.loginCloud();
    }


}