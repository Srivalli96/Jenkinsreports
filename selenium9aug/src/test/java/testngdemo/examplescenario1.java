package testngdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class examplescenario1 {



	WebDriver driver;
@Test
public void testActions() throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\training_h2a.06.15\\Desktop\\Selenium Workspace\\SeleniumBroDrivers\\chromedriver.exe\\");

		driver=new ChromeDriver();
		
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		
		
		Actions a=new Actions(driver);
		
		//mouser hovering
		a.moveToElement(driver.findElement(By .xpath("//*[@id=\"menu3\"]/li[3]/a/span")))
		.moveToElement(driver.findElement(By .xpath("//*[@id=\"menu3\"]/li[3]/ul/li/a/span")))
		.moveToElement(driver.findElement(By .xpath("//*[@id=\"menu3\"]/li[3]/ul/li/ul/li[1]/a/span")))
		.click().build().perform();
		
			
		
}


}

