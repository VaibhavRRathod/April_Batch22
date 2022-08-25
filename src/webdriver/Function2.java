package webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Function2 
{

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver",
				   "C:\\Users\\vaibhav\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		
		//1. get =>it is use to pass URL
		
		driver.get("https://www.facebook.com/");
		
		
		//2 Set Size => use to change the size of the browser 
		
		Dimension d=new Dimension(10, 10);
		
		driver.manage().window().setSize(d);
		
		
		//3.Set Position=> use to set the position
		
		
		Point p=new Point(-200, 300);
		
		driver.manage().window().setPosition(p);
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
