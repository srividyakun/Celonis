package challenge.celonis.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;


public class Hooks extends TestBase {
	
	public static Scenario scenario;
	
	/**
	 * This method takes screen shots when test case failed
	 * @param scenario
	 * @throws Throwable
	 */
	@After
	public void embedScreenshot(Scenario scenario) throws Throwable {
		File f;
		// Reporting execution status in New relic
		if (scenario.isFailed()) {
			f = new File("./screenshots/" + scenario.getSourceTagNames() + ".png");
			FileOutputStream out = new FileOutputStream(f);
			out.write(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES));
			out.close();
		} else {

			f = new File("./screenshots/" + scenario.getSourceTagNames() + ".png");
			f.delete();
			System.out.println(scenario.getSourceTagNames() + ".png" + " file  was deleted as it passed!!");
		}
	}

	/**
	 * The function is used to destroy all the open instances of the browser
	 * 
	 * @throws IOException
	 * @throws CustomException
	 */
	@After
	public void destroyDriver() throws IOException {
		if (!driver.equals(null)) {
			driver.quit();
			driver = null;
		}
	}
}
