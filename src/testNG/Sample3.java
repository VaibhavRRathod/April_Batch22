package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample3 
{
	//int a=1;
	
    //        -6 -5 -4 -3 -2 -1  0  1 2 3 4 5 6 

@Test(priority=5)
public void Test1()   //10
{
	
	Reporter.log("Test1 is running",true);
	
}

@Test(priority=-6)
public void Test2()   //10
{
	
	Reporter.log("Test2 is running",true);
	
}

@Test(priority=1)
public void Test3()   //10
{
	
	Reporter.log("Test3 is running",true);
	
}
   
@Test(priority=3)
public void Test4()   //10
{
	
	Reporter.log("Test4 is running",true);
	
}

@Test(priority=1)
public void Test5()   //10
{
	
	Reporter.log("Test5 is running",true);
	
}

@Test(priority=2)
public void Test6()   //10
{
	
	Reporter.log("Test6 is running",true);
	
}




//@Test(invocationCount=100)
//public void Test1()   //10
//{
//	
//	Reporter.log("Test1 is running",true);
//	
//}



}
