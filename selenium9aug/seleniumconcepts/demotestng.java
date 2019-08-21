package seleniumconcepts;

import org.testng.annotations.Test;

public class demotestng {
  @Test(priority=1)
  public void openApp() {
	  System.out.println("Inside openApp");
  }
  
  
  @Test(priority=2)
  public void login() {
	  System.out.println("Inside login");
  }





@Test(priority=3)
public void logout() {
	  System.out.println("Inside logout");
}
}

