package demo;


import java.util.Set;

import org.testng.IClass;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;


public class Sample1 implements ITestListener
{
	@Override
	public void onStart(ITestContext context) 
	{
		System.out.println("Test case is started "+context.getName());
	}
	
	
	@Override
	public void onTestSkipped(ITestResult result) 
	{
		System.out.println("Test case is Skipped");
	}
	
	
	@Override
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("Test case is pass "+result.getName());
	}
	
	@Override
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Test case is fail");
		System.out.println("We are Running ITest Listener");
	}
	
	
	@Override
	public void onFinish(ITestContext context)
	{
		System.out.println("Test case sucessfully completed");
	}

	
}
