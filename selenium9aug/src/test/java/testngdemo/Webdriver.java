package testngdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Webdriver {
	WebDriver driver;
  @Test
  public void sTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\training_h2a.06.15\\Desktop\\Selenium Workspace\\SeleniumBroDrivers\\chromedriver.exe\\");
	  driver = new ChromeDriver();
	  driver.get("http://google.co.in/");
  
  System.out.println(driver.getTitle());
  driver.manage().window().maximize();
 /* driver.findElement(By .linkText("REGISTER")).click();
  String str=driver.findElement(By .linkText("REGISTER")).getText();
  System.out.println(str);
  driver.findElement(By .name("country")).sendKeys("TOGO");
  driver.findElement(By .name("email")).sendKeys("jim");
  driver.findElement(By .name("password")).sendKeys("kane");
  driver.findElement(By .name("confirmPassword")).sendKeys("kane");
  driver.findElement(By .name("register")).click();*/
  String reg=driver.findElement(By .xpath("//*[@id=\"fbar\"]/div/div/div/span")).getText();
  System.out.println(reg);
  
  }
}
