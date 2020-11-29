package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftHardAssertions {
SoftAssert SoftAssert = new SoftAssert();
	
	@Test
	public void assertions(){
		System.out.println("open browser");
		
	
		System.out.println("enter uname");
		//Assert.assertEquals(true, false);//Hard Assertions
		
		System.out.println("enter pw");
		SoftAssert.assertEquals(true, false);//soft Assertions
		
		System.out.println("sign in");
		SoftAssert.assertEquals(true, false);
		System.out.println("Homepage");
		System.out.println("Deals page");
		System.out.println("create a deal");
		SoftAssert.assertAll();
		
	}
}
