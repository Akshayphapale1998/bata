package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BataLoginPage {
	
	@FindBy (xpath ="//input[@id='login-form-email']")private WebElement eMail;
	@FindBy (xpath ="//input[@id='login-form-password']")private WebElement password;
	@FindBy (xpath ="//button[@class='cc-button-type-1 js-analytics-loginButton']")private WebElement signIn;

	public BataLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void enterEmailId(String emaiID) {
		eMail.sendKeys();
	}
	
	public void enterpassword(String Pass) {
		password.sendKeys(Pass);
	}
	
	public void clickOnSignIn() {
		signIn.click();
	}
}
