package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample1 
{
	@BeforeClass
	public void OpenBrowser()
	{
		Reporter.log("chrome is open",true);
	
	}
	
	@BeforeMethod
	public void login()
	{
		
		Reporter.log("We enter valid credential & sucessfully login to s/w",true);
		
	}
	
	@Test
	public void Test()
	{
		Reporter.log("Test 1 is pass",true);
		
	}
	
	@Test
	public void Test2()
	{
		Reporter.log("Test 2 is pass",true);
	}
	
	@AfterMethod
	public void logout()
	{
		Reporter.log("Logout from s/w",true);
		
	}
	@AfterClass
	public void quite()
	{
		
		Reporter.log("chrome is close",true);
	}
	

}

