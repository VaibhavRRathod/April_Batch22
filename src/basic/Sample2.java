package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 
{

	public static void main(String[]args)
	{
		
	//URL 
	//URL browser close
		
	//Step 1=> Set path 
		
	System.setProperty("webdriver.chrome.driver",
		   "C:\\Users\\vaibhav\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	//Step 2 create object of chromedriver class with ref of webdriver interface 
	
	WebDriver driver=new ChromeDriver();
	
	//Step 3 call get method to open browser 
	
	driver.get("https://www.flipkart.com/");
	
	//Step 4 call close/quite method 
	
	driver.close();
	
	
	}
	
}
