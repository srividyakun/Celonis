package challenge.celonis.pageObjectFiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ServiceNowPageObjects {
	WebDriver driver;

	public ServiceNowPageObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// x-path for serviceNow Tab
	@FindBy(xpath = "//span[contains(text(),'ServiceNow Ticketing')]")
	public WebElement serviceNowTab;

	// x-path button for PTP explorer view
	@FindBy(xpath = "//a[@class='ce-tile__link ng-star-inserted']")
	public WebElement serviceNowOverviewBtn;

}
