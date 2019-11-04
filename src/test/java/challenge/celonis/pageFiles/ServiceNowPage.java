package challenge.celonis.pageFiles;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import challenge.celonis.pageObjectFiles.ServiceNowPageObjects;
import challenge.celonis.utils.TestBase;
import challenge.celonis.utils.UIActions;

public class ServiceNowPage extends TestBase {

	private static final Logger logger = Logger.getLogger(ServiceNowPage.class);

	public WebDriver navigateToServiceNowDemo() throws Exception {
		ServiceNowPageObjects snPageObject = new ServiceNowPageObjects(driver);
		UIActions uiactions = new UIActions(driver);
		uiactions.fn_click(snPageObject.serviceNowTab);
		logger.info("Clicked on purchase to Pay Tab");
		uiactions.fn_wait(snPageObject.serviceNowOverviewBtn, 10);
		uiactions.fn_click(snPageObject.serviceNowOverviewBtn);
		return driver;

	}

}
