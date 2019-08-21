package testngdemo;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions2 {
	@Test
	public void method1() {
		int actual=20;
		int expected=20;
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void method2() {
		int actual=20;
		int expected=18;
		Assert.assertEquals(actual, expected);
	}
	

}
