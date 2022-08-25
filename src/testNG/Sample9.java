package testNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Sample9 
{

	@Test
	public static void test()  //test    
	{
		
		String  str="Dishaa";
		
		String str1="Disha";
		
		SoftAssert soft=new SoftAssert();
		
		soft.assertEquals(str, str1,"act & exp are not matching");   //10=>100
		
		//Assert.assertEquals(str, str1,"both are not matching");  //fail
		
		Reporter.log("fail",true);   //testing 
		
		
		soft.assertTrue(false,"getting false result");
		soft.assertFalse(true,"getting true result");
		soft.assertNull("shbahsf","textfield is not null");
		soft.assertNotEquals("abs", "abs","exp & act are matching");
		
		
		//Assert.assertTrue(false,"getting false result");
		
		soft.assertAll();
		
		
		
		
	}
	
}
