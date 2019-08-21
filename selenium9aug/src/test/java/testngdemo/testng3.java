package testngdemo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testng3 {
  @Test
  public void login() {
	  System.out.println("login");
  }
  
  
  @BeforeMethod
  public void bmethod() {
  	System.out.println("bmethod");
  }
  
  
  @AfterMethod
  public void amethod() {
  	System.out.println("amethod");
  }
}
