package testngdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;
import org.testng.annotations.Test;

public class Examplescenario2 {
	WebDriver driver;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\training_h2a.06.15\\Desktop\\Selenium Workspace\\SeleniumBroDrivers\\chromedriver.exe\\");
	  driver=new ChromeDriver();
	  //opening of the URL
	  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	  driver.findElement(By .name("products")).sendKeys("bag");
	  Actions a=new Actions(driver);
	 /* a.moveToElement(driver.findElement(By .xpath("//*[@id=\"myInputautocomplete-list\"]/div[2]"))).click().build().perform();*/
  
	  a.sendKeys(Keys.TAB).perform();
		a.sendKeys(Keys.ENTER).perform();	
  }
  
  
}
