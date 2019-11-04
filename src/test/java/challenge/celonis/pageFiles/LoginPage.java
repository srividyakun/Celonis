package challenge.celonis.pageFiles;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import challenge.celonis.pageObjectFiles.LoginPageObject;
import challenge.celonis.pageObjectFiles.OrderToCashPageObjects;
import challenge.celonis.utils.DataManagement;
import challenge.celonis.utils.TestBase;
import challenge.celonis.utils.UIActions;

public class LoginPage extends TestBase {

	private static final Logger logger = Logger.getLogger(LoginPage.class);
	private DataManagement dataManagemant;

	
	public WebDriver openUrl() throws Exception {
		UIActions uiactions = new UIActions(driver);
		driver = createNewBrowserInstance();
		dataManagemant = new DataManagement(driver);
		logger.debug("Inside openUrl [{}]");
		driver.get(dataManagemant.loadProperties("url"));
		uiactions.fn_waitForPageLoad();
		PageFactory.initElements(driver, LoginPageObject.class);
		return driver;
	}

	/**
	 * this method will login to clenois cloud application suing email and password
	 * 
	 * @return
	 * 
	 * @throws Exception
	 */
	public WebDriver loginCloud() throws Exception {
		LoginPageObject loginPageObject = new LoginPageObject(driver);
		UIActions uiactions = new UIActions(driver);
		String loginEmail = dataManagemant.loadProperties("username");
		String loginPassword = dataManagemant.loadProperties("password");
		uiactions.fn_wait(loginPageObject.loginEmail, 10);
		uiactions.fn_inputVal(loginPageObject.loginEmail, loginEmail);
		logger.info("Entered Email");
		uiactions.fn_inputVal(loginPageObject.loginPassword, loginPassword);
		logger.info("Entered Password");
		uiactions.fn_click(loginPageObject.signInButton);
		logger.info("logged in");
		PageFactory.initElements(driver, LoginPageObject.class);
		PageFactory.initElements(driver, OrderToCashPageObjects.class);
		return driver;
	}

}
