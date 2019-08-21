package testngdemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions1 {
	
	
	
	@Test
	public void TestMethod1() {
		Assert.assertTrue(20>18);
	}
 @Test
 public void testMethod2() {
	 Assert.assertTrue("Hello".equals("Hi"));
 }

}
