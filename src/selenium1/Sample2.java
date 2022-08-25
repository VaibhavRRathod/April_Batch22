//Assignment 2

package selenium1;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 
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
		
		//3. Get title => use to get title of current web page
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		driver.get("https://www.facebook.com/login");
		
		//4.Navigate= backword
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		//5.Set Size => use to change the size of the browser 
		
		Dimension d=new Dimension(200, 400);
		
		driver.manage().window().setSize(d);
		Thread.sleep(3000);
		

		//6.Set Position=> use to set the position
		
		Point p=new Point(100,500);
		
		driver.manage().window().setPosition(p);
		Thread.sleep(2000);
		
		//7.maximize---> use to maximize the browser size
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//8.Navigate= backword
		
		driver.navigate().forward();
		Thread.sleep(2000);
		
		//9.Navigate= Refresh the webpage
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		//10.Quite=>use to close the browser
		driver.quit();
		
		
	
	}	
}
