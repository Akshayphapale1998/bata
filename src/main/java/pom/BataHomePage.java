package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class BataHomePage {
	
	@FindBy (xpath ="//a[@class='cc-main-navigation-link cc-highlight']")private WebElement sneakerstudio;
	@FindBy (xpath ="(//a[@class='cc-main-navigation-link '])[1]")private WebElement New;
	@FindBy (xpath ="(//a[@class='cc-main-navigation-link '])[2]")private WebElement women;
	@FindBy (xpath ="(//a[@class='cc-main-navigation-link '])[3]")private WebElement men;
	@FindBy (xpath ="(//a[@class='cc-main-navigation-link '])[4]")private WebElement kids;
	@FindBy (xpath ="(//a[@class='cc-main-navigation-link '])[5]")private WebElement sale;
	@FindBy (xpath ="(//a[@class='cc-main-navigation-link '])[6]")private WebElement brands;
	
	
//	public BataHomePage(WebDriver driver) {
//		PageFactory.initElements(driver, this);
//	}
	
	public void clickOnMen(WebDriver driver) {
		Actions actions= new Actions(driver);
		actions.moveToElement(men);
		actions.perform();
	}
	
}
