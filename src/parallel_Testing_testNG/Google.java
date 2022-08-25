package parallel_Testing_testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Google 
{
	@Test
	public void OpenChrome()
	{

		System.setProperty("webdriver.chrome.driver",
				   "C:\\Users\\vaibhav\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.close();
		
	}
}
