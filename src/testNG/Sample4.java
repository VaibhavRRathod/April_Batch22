package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample4 
{
	@Test(enabled=false)
	public void test1()
	{
		Reporter.log("Test 1 is pass",true);
	}
	
	
	@Test
	public void test2()
	{
		Reporter.log("Test 2 is pass",true);
	}
	
	@Test
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
	
	@Test(enabled=false)
	public void test6()
	{
		Reporter.log("Test 6 is pass",true);
	}
	
	
	//6======>Rel 1.2  
	
	//4-->dev 
	//2-->move next rel 1.3
	
	// dishaatrainingcenter@gmail.com 
	// info@dishaaedtech.com
	
	
}
