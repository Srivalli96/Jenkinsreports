package testngdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestActionsKeyboard {
	
WebDriver driver;
@Test
public void testActions() throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\training_h2a.06.15\\Desktop\\Selenium Workspace\\SeleniumBroDrivers\\chromedriver.exe\\");

		driver=new ChromeDriver();
		/*driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebDriverWait w=new WebDriverWait(driver,20);
		w.until(ExpectedConditions.presenceOfElementLocated(By .name("password")));*/
		driver.get("http://www.newtours.demoaut.com/");
		Actions a=new Actions(driver);
		driver.findElement(By .name("userName")).sendKeys(Keys.SHIFT,"Demo");
		a.sendKeys(Keys.TAB).perform();
		driver.findElement(By .name("password")).sendKeys("demo");
		a.sendKeys(Keys.TAB).perform();
		a.sendKeys(Keys.ENTER).perform();	

}
}


