package challenge.celonis.pageFiles;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import challenge.celonis.pageObjectFiles.OrderToCashPageObjects;
import challenge.celonis.utils.TestBase;
import challenge.celonis.utils.UIActions;

public class OrderToCashPage extends TestBase {

	private static final Logger logger = Logger.getLogger(OrderToCashPage.class);
	
	public WebDriver navigateToOTCDemo() throws Exception {
		OrderToCashPageObjects otcpageobject = new OrderToCashPageObjects(driver); 
		UIActions uiactions = new UIActions(driver);
		uiactions.fn_click(otcpageobject.OrderTocashTab);
		logger.info("Clicked on Order to cashTab");
		uiactions.fn_wait(otcpageobject.OrderToCashOverviewBtn, 10);
		uiactions.fn_click(otcpageobject.OrderToCashOverviewBtn);
		return driver;
	}
}
