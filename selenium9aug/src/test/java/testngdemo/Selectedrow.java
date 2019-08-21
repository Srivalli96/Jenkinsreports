package testngdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selectedrow {
	WebDriver driver;
 @Test
 public void sTest1() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\training_h2a.06.15\\Desktop\\Selenium Workspace\\SeleniumBroDrivers\\chromedriver.exe\\");
	  driver = new ChromeDriver();
	  driver.get("http://newtours.demoaut.com/mercurycruise.php?osCsid=b2b1efc7684849091f2782e71c71b0ba");

System.out.println(driver.getTitle());
driver.manage().window().maximize();



WebElement ele=driver.findElement(By .xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/th/table"));
List<WebElement> trows=ele.findElements(By .tagName("tr"));

for(WebElement row:trows) {
	List<WebElement> tcols=row.findElements(By .tagName("td"));
	
for(int c=0;c<tcols.size()-1;c++) {
	String tdata=tcols.get(c).getText();



if(tdata.equals("Inside Passage")) {
	 System.out.println(tcols.get(0).getText());

}
	
	
		
  }
}
 }
}

