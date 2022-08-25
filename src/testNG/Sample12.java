package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample12 
{

	@Test(groups="Login")
	public void test8()
	{
		
		Reporter.log("Test 8 is pass",true);
	}
	
	@Test(groups="Login")
	public void test9()
	{
		
		Reporter.log("Test 9 is pass",true);
	}
	
	@Test(groups="Order")
	public void test10()
	{
		
		Reporter.log("Test 10 is pass",true);
	}
	
	@Test(groups="Home")
	public void test11()
	{
		
		Reporter.log("Test 11 is pass",true);
	}
	
	@Test(groups="Order")
	public void test12()
	{
		
		Reporter.log("Test 12 is pass",true);
	}
	
	@Test(groups="Home")
	public void test13()
	{
		
		Reporter.log("Test 13 is pass",true);
	}
	
	
}
