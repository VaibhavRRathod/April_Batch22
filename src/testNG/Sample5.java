package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample5 
{
	@Test
	public void test1()
	{
		Reporter.log("Test 1 is pass",true);
	}
	
	
	@Test(timeOut=1900)   // ms 
	public void test2() throws InterruptedException
	{
		Thread.sleep(2000);
		Reporter.log("Test 2 is pass",true);
	}
	
	@Test
	public void test3()
	{
		Reporter.log("Test 3 is pass",true);
	}
	
	
	//load 
	//open => 10ms 1sec 
	//validate 

}
