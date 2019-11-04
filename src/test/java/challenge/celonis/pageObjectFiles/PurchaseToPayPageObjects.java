package challenge.celonis.pageObjectFiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchaseToPayPageObjects {
	WebDriver driver;

	public PurchaseToPayPageObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// x-path for PTPTab
	@FindBy(xpath = "//span[contains(text(),'Purchase to Pay')]")
	public WebElement purchaseToPayTab;

	// x-path button for PTP explorer view
	@FindBy(xpath = "//a[@class='ce-tile__link ng-star-inserted']")
	public WebElement purchaseToPayOverviewBtn;

}
