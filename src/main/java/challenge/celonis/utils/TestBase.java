package challenge.celonis.utils;

import org.apache.log4j.PropertyConfigurator;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.Scenario;

public class TestBase {

	public static Scenario scenario;
	public static WebDriver driver;
	public static final Logger logger = null;
	String propFileName = "celonis.properties";

	public WebDriver createNewBrowserInstance() throws Exception {
		DataManagement dataManagemant = new DataManagement(driver);
		Dimension dimension = new Dimension(1920, 1080);
		String log4jPath = System.getProperty("user.dir") + "/log4j.properties";
		PropertyConfigurator.configure(log4jPath);
		if (dataManagemant.loadProperties("browser").equalsIgnoreCase("Chrome")) {
			getChromeDriver(dimension);
		}

		if (dataManagemant.loadProperties("browser").equalsIgnoreCase("firefox")) {
			getFirefoxDriver(dimension);
		}
		return driver;

	}

	/**
	 * @param dimension
	 */
	private WebDriver getChromeDriver(Dimension dimension) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "/src/main/resources/drivers/chromedriver");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--window-size=1920,1080");
		chromeOptions.setAcceptInsecureCerts(true);
		chromeOptions.addArguments("--ignore-certificate-errors");
		driver = new ChromeDriver();
		return driver;
	}

	/**
	 * @param dimension
	 */
	private WebDriver getFirefoxDriver(Dimension dimension) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/src/main/resources/drivers/geckodriver");
		driver = new FirefoxDriver();
		return driver;
	}
}
