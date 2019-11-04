package challenge.celonis.stepDefinationFiles;

import challenge.celonis.pageFiles.ServiceNowPage;
import challenge.celonis.utils.TestBase;
import cucumber.api.java.en.And;

public class ServiceNowStepDefs extends TestBase{
	
	ServiceNowPage snPage = new ServiceNowPage();

	
	 @And("^I check the availability of Service Now Ticketing$")
	    public void i_check_the_availability_of_service_now_ticketing() throws Throwable {
	       snPage.navigateToServiceNowDemo();
	    }
}
