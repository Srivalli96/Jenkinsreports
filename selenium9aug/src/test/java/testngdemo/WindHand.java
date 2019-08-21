package testngdemo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindHand {
	
	WebDriver driver;
  @Test
  public void whand() {
	  
	  //path of  the chrome browser
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\training_h2a.06.15\\Desktop\\Selenium Workspace\\SeleniumBroDrivers\\chromedriver.exe\\");
	  //init browser
	  driver=new ChromeDriver();
	  //opening of the URL
	  driver.get("https://www.google.com/?hl=en");
	  //to get the title of the page
	  System.out.println("1."+driver.getTitle());
	  //to maximize the window
	  driver.manage().window().maximize();
	  driver.findElement(By .linkText("Gmail")).click();
	  System.out.println("2."+driver.getTitle());
	  driver.findElement(By .linkText("Terms")).click();
	  System.out.println("3."+driver.getTitle());
	  
	  Set<String> hand=driver.getWindowHandles();
	  System.out.println(hand.size());
	      Iterator<String> ita=  hand.iterator();
	       String str= ita.next().toString();
	       System.out.println(str);
	      String str1= ita.next().toString();
	      System.out.println(str1);
	      
	      //switch to window
	      driver.switchTo().window(str1);
	      
	      
	      System.out.println("3."+driver.getTitle());
	  driver.findElement(By .linkText("view archived versions")).click();
	  System.out.println("4."+driver.getTitle());
	  
	  
	  
	  
	  
	  
  }
}
