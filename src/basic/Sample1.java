package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 
{

	public static void main(String[]args)
	{
		
		//url open
		//command => browser
		//path
		
		System.setProperty("webdriver.chrome.driver",
		       "C:\\Users\\vaibhav\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//url get
		
		driver.get("https://www.flipkart.com/");
		
	}
	
}
