package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample2 
{

	
	//Before class=> if we want to call some fn at single time ex opening any browser 
	
	//before Method =>it will execute with test case we can say that we will include pre-condition in before method
	
	//After class=> if we want to call some fn at single time ex Closing any browser 
	
	//After Method=> after test class will use this method for to give any kind of condition after test
	
	//Test=> Test Method is use to cover all test cases 
	
	
	
	
	public String expResult;
	
	public WebDriver driver;
	
	@BeforeClass
	public void OpenBrowser()
	{
		System.setProperty("webdriver.chrome.driver",
				   "C:\\Users\\vaibhav\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  //
		
		
	}
	
	@BeforeMethod
	public void login()
	{
		
		driver.get("https://www.Flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
	}
	@Test
	public void Test()
	{
		
	WebElement actResult = driver.findElement(By.xpath("//span[@class='z3ht-w']"));
	String act = actResult.getText();
	expResult="© 2007-2022 Flipkart.com";
	
	//Assert.assertEquals(act, expResult);
	
	if(act.equals(expResult))
	{
		Reporter.log("Test Case is Pass",true);
	}
	else
	{
		Reporter.log("Test case is fail",true);
	}
		
	}
	

	@AfterMethod
	public void logout()
	{
		driver.navigate().refresh();
		
	}
	@AfterClass
	public void quite()
	{
		
		driver.close();
	}
	
}
