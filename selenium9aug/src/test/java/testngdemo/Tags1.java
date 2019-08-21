package testngdemo;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tags1 {
	WebDriver driver;
 
@Test
public void sTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\training_h2a.06.15\\Desktop\\Selenium Workspace\\SeleniumBroDrivers\\chromedriver.exe\\");
	  driver = new ChromeDriver();
	  driver.get("http://demowebshop.tricentis.com/");

System.out.println(driver.getTitle());
driver.manage().window().maximize();

List<WebElement> lnkcoll=driver.findElements(By .tagName("a"));
System.out.println(lnkcoll.size());
for(int i=0;i<=lnkcoll.size()-1;i++) {
	String lnkname=lnkcoll.get(i).getText();
	System.out.println(lnkname);
	if(lnkname.equals("Log in")) {
		 lnkcoll.get(i).click();
		break;
	}
}
}
}


