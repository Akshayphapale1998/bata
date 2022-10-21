package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


import pom.BataLoginPage;

public class BataLoginPageTest {
	
	WebDriver driver;
	
	@Test(priority=-1) 
	public void Browser() {
		driver=pojo.Browser.OpenChromeBrowser();
	}
	
	@Test(priority=1)
	public void validateBataLoginPageTest() {
		
		BataLoginPage bataLoginPage = new BataLoginPage(driver);
		bataLoginPage.enterEmailId("akshayphapale1998@gmail.com");
		bataLoginPage.enterpassword("Bata@1234");
		bataLoginPage.clickOnSignIn();
		
		WebElement Men=driver.findElement(By.xpath("(//a[@class='cc-main-navigation-link '])[3]"));
		Actions actions= new Actions(driver);
		actions.moveToElement(Men);
		actions.perform();		
		
		driver.findElement(By.xpath("//a[@id='IN_Men_Accessories_Bags']")).click();		
	}
	
	
}