package testngdemo;



import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;



public class TestScreenshot {
	
	WebDriver driver;
	@Test
	public void testActions() throws Exception{
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\suman.palle\\Downloads\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_h2a.06.15\\Desktop\\Selenium Workspace\\SeleniumBroDrivers\\chromedriver.exe\\");

			driver=new ChromeDriver();
			/*driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			WebDriverWait w=new WebDriverWait(driver,20);
			w.until(ExpectedConditions.presenceOfElementLocated(By .name("password")));*/
			driver.get("http://www.newtours.demoaut.com/");	
			//takes the screenshot
			File file=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			//Saving the screenshot file
			FileUtils.copyFile(file, new File("C:\\Users\\training_h2a.06.15\\Desktop\\sravya\\hi.jpg"));
			
			


}
}
