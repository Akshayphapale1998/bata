package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import pojo.Browser;

public class Screenshot {
	
	public void takeScreenshot(WebDriver driver,String name) throws IOException
	{
		 driver=Browser.OpenChromeBrowser();
		
		File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File Destination = new File("C:\\Users\\aksha\\eclipse-workspace\\Bata\\Screenshot"+name+".png");
		
		FileHandler.copy(source, Destination);
	
	}

}
