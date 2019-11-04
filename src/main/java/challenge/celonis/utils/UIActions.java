package challenge.celonis.utils;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UIActions {

	private WebDriver driver;
	private static final Logger logger = Logger.getLogger(UIActions.class);

	public UIActions(WebDriver driver) {
		this.driver = driver;
	}

	/*
	 * This wrapper method will validate the element on the page and will enter the
	 * value in the textbox
	 */
	public void fn_inputVal(WebElement we, String value) {
		if (we.isDisplayed()) {
			if (we.isEnabled()) {
				we.clear();
				we.sendKeys(value);
			} else {
				System.out.println(TestBase.scenario.getName() + " -> " + "WebElement " + we
						+ "is not enabled and text can't be entered ");
			}
		} else {
			System.out.println(TestBase.scenario.getName() + " -> " + "WebElement " + we + "is not displayed");
		}
	}

	/**
	 * @param we
	 * @throws Exception
	 */
	public void fn_click(WebElement we) throws Exception {
		fn_wait(we, 20);
		if (we.isDisplayed() == true) {
			if (we.isEnabled()) {
				we.click();
				fn_waitForPageLoad();
			} else {
				throw new Exception(TestBase.scenario.getName() + " -> " + "WebElement " + we
						+ "is not enabled and can't be clicked");
			}
		}

	}

	public void fn_wait(WebElement element, long timeOutInSeconds) {
		logger.info("waiting for element visibilityOf..");
		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
		wait.until(ExpectedConditions.visibilityOf(element));
		logger.info("element is visible..");
	}

	/**
	 * This method is to wait till page loads
	 */
	public void fn_waitForPageLoad() {
		ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return ((JavascriptExecutor) driver).executeScript("return document.readyState").toString()
						.equals("complete");
			}
		};
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30, 5);
			wait.until(expectation);
		} catch (Throwable error) {
			logger.error("Wait for Page Load" + " -> " + error);
		}
	}
}
