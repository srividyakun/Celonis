package challenge.celonis.stepDefinationFiles;

import challenge.celonis.pageFiles.PurchaseToPayPage;
import challenge.celonis.utils.TestBase;
import cucumber.api.java.en.And;

public class PurchaseToPayStepDefs extends TestBase {
	
	PurchaseToPayPage ptpPage = new PurchaseToPayPage();
	
	
	@And("^I check the availability of Purchase To Pay$")
    public void i_check_the_availability_of_purchase_to_pay() throws Throwable {
       ptpPage.navigateToPTPDemo();
    }
}
