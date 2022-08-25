package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample6 
{
	@Test(timeOut=100)
	public void test1() throws InterruptedException
	{
		Thread.sleep(2000);
		Reporter.log("Test 1 is pass",true);
	}
	
	
	@Test
	public void test2()
	{
		Reporter.log("Test 2 is pass",true);
	}
	
	@Test(dependsOnMethods= {"test1","test2","test6"})
	public void test3()
	{
		Reporter.log("Test 3 is pass",true);
	}
	
	@Test
	public void test4()
	{
		Reporter.log("Test 4 is pass",true);
	}
	
	@Test
	public void test5()
	{
		Reporter.log("Test 5 is pass",true);
	}
	
	@Test
	public void test6()
	{
		Reporter.log("Test 6 is pass",true);
	}
	
}
