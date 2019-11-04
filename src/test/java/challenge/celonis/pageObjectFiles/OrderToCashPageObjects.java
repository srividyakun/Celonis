package challenge.celonis.pageObjectFiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderToCashPageObjects {

	WebDriver driver;

	public OrderToCashPageObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// x-path for orderTocashTab
	@FindBy(xpath = "//span[contains(text(),'Order to Cash')]")
	public WebElement OrderTocashTab;

	// x-path button for OrdertoCash explorer view
	@FindBy(xpath = "//a[@class='ce-tile__link ng-star-inserted']")
	public WebElement OrderToCashOverviewBtn;

}
