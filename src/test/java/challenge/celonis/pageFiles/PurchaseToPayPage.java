package challenge.celonis.pageFiles;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import challenge.celonis.pageObjectFiles.PurchaseToPayPageObjects;
import challenge.celonis.utils.TestBase;
import challenge.celonis.utils.UIActions;

public class PurchaseToPayPage extends TestBase {

		private static final Logger logger = Logger.getLogger(PurchaseToPayPage.class);

		public WebDriver navigateToPTPDemo() throws Exception {
			PurchaseToPayPageObjects ptpPageObject = new PurchaseToPayPageObjects(driver); 
			UIActions uiactions = new UIActions(driver);
			uiactions.fn_click(ptpPageObject.purchaseToPayTab);
			logger.info("Clicked on purchase to Pay Tab");
			uiactions.fn_wait(ptpPageObject.purchaseToPayOverviewBtn, 10);
			uiactions.fn_click(ptpPageObject.purchaseToPayOverviewBtn);
			return driver;
			
		}
}
