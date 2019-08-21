package testngdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Table1 {
	WebDriver driver;
 @Test
 public void sTest1() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\training_h2a.06.15\\Desktop\\Selenium Workspace\\SeleniumBroDrivers\\chromedriver.exe\\");
	  driver = new ChromeDriver();
	  driver.get("http://newtours.demoaut.com/mercurycruise.php?osCsid=b2b1efc7684849091f2782e71c71b0ba");

System.out.println(driver.getTitle());
driver.manage().window().maximize();



WebElement x=driver.findElement(By .xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/th/table"));
List<WebElement> lnkcoll=x.findElements(By .tagName("tr"));
System.out.println(lnkcoll.size());

for(int i=0;i<=lnkcoll.size()-1;i++) {
	String lnkname=lnkcoll.get(i).getText();
	System.out.println(lnkname);
	
	
	if(lnkname.equals("Log")) {
		 lnkcoll.get(i).click();
		break;
  }
}
}
}