package parallel_Testing_testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CT 
{

	@Parameters("BrowserName")
	@Test
	public void test(String BrowserName) throws InterruptedException
	{
	
		
		WebDriver driver=null;  //CT 
		
		if(BrowserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",
					   "C:\\Users\\vaibhav\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			driver=new ChromeDriver();
		}
		
		else if(BrowserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
			
			driver=new FirefoxDriver();
		}
		
		
		
		
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Thread.sleep(2000);
		driver.get("http://www.facebook.com/");
		String actual = driver.findElement(By.xpath("//a[text()='Create New Account']")).getText();
		
		String Expected="Create New Account";
		
		SoftAssert soft =new SoftAssert();
		
		soft.assertEquals(actual, Expected,"Test case 001 is fail");
		soft.assertAll();
		Thread.sleep(2000);
		driver.close();
		
		
	}
	
	
	
}
