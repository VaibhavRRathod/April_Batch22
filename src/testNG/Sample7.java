package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample7 
{

	
	//verification
	
	@Test
	public void test1()
	{
		//Hard Assert 
		
		
		String text1=null;
		Assert.assertNotNull(text1,"Text field is not null");
		
		
		
		Assert.fail("Test 1 is fail");
		
		String text=null;
		Assert.assertNotNull(text,"Text field is not null");
		
//		
		
//		String text="aaa";
//		
//		Assert.assertNull(text,"Text field is not null");
//		
//		
		
		
//		boolean login=true;
//		
//		
//		Assert.assertFalse(login,"Result is true");
//		
		
//		boolean login =true;
//		
//		Assert.assertTrue(login,"result is not true");
//		
		
		
//		String act="Dishaa";
//		String exp="Dishaa";
//		
//		
//		Assert.assertNotEquals(act, exp,"act & exp are matching");  
//		
	//	Assert.assertEquals(act, exp,"act & exp values are not matching");
		
		System.out.println("Test 1 is pass");
		
		
		
	}
	
	
}
