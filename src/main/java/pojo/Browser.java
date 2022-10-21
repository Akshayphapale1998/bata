package pojo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	
	public static WebDriver OpenChromeBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32 (4)\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.bata.in/login");

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
		
		return driver;
	}

}
