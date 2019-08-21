package testngdemo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testng2 {
  
@Test
public void openApp() {
	  System.out.println("Inside openApp");
}


@Test
public void login() {
	  System.out.println("Inside login");
}




@Test
public void logout() {
	  System.out.println("Inside logout");
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
