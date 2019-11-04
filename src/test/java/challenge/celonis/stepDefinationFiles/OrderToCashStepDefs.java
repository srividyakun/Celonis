package challenge.celonis.stepDefinationFiles;

import challenge.celonis.pageFiles.OrderToCashPage;
import challenge.celonis.utils.TestBase;
import cucumber.api.java.en.And;

public class OrderToCashStepDefs  extends TestBase {

	OrderToCashPage ordertocash = new OrderToCashPage();

	@And("^I check the availability of Order To Cash$")
	public void i_check_the_availability_of_order_to_cash() throws Throwable {
         ordertocash.navigateToOTCDemo();
	}
}
