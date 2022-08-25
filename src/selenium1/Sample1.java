//Assignment 1

package selenium1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 
{

	public static void main(String[] args) throws InterruptedException
	
	{
	
		System.setProperty("webdriver.chrome.driver",
				   "C:\\Users\\vaibhav\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//1. get =>it is use to pass URL
		
		driver.get("https://www.google.com/");
		
		//2.maximize---> use to maximize the browser size
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//3.size---> use to change the size of the browser 
		
		Dimension d=new Dimension(20, 20);
		
		driver.manage().window().setSize(d);
		
		//4.Set Position=> use to set the position
		

		Point p=new Point(-400, 200);
		
		driver.manage().window().setPosition(p);
		
		//5. Quite=>use to close the browser
				driver.quit();
	
	}
	
	
	
	
}
