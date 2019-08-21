package testngdemo;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class Softassertion {
	@Test
	public void smethod1() {
		SoftAssert sa=new SoftAssert();
		System.out.println("Checking 1st validation");
		sa.assertEquals(10,11);
		System.out.println("Checking 2nd validation");
		sa.assertEquals("Hello","Hi");
		sa.assertAll();
	}
}