package testngdemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoAlert {
	WebDriver driver;
	@Test
	  public void f() {
		//path of  the chrome browser
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\training_h2a.06.15\\Desktop\\Selenium Workspace\\SeleniumBroDrivers\\chromedriver.exe\\");
		  //init browser
		  driver=new ChromeDriver();
		  //opening of the URL
		  driver.get("http://demowebshop.tricentis.com/");
		  //to get the title of the page
		  System.out.println("1."+driver.getTitle());
		  driver.findElement(By .xpath("/html/body/div[4]/div[1]/div[1]/div[3]/form/input[2]")).click();
		  //pop-up window handler
		  Alert a=driver.switchTo().alert();
		  a.accept();
		  
		  driver.findElement(By .name("q")).sendKeys("Com");
		  
	  }
	}
