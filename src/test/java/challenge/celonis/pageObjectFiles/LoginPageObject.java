package challenge.celonis.pageObjectFiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObject {

	WebDriver driver;

	public LoginPageObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	//	waithelper = new WaitHelper(driver);
	}

	// x-path for email
	@FindBy(xpath = "//input[@id='ce-input-0']")
	public  WebElement loginEmail;

	// x-path for password
	@FindBy(xpath = "//input[@id='ce-input-1']")
	public  WebElement loginPassword;

	// x-path for sign in button
	@FindBy(xpath = "//button[@class='btn btn-flat btn--default btn--transition']")
	public  WebElement signInButton;

}
