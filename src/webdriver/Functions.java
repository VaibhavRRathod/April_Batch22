package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Functions 
{
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver",
				   "C:\\Users\\vaibhav\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		//1. get =>it is use to pass URL
		
		driver.get("https://www.facebook.com/");
		
		//2. Get title => use to get title of current web page
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		//3. Get current url=> use to get current url of the page
		
		String url = driver.getCurrentUrl();	
		
		System.out.println(url);
		
		//4. maxmise=>use to maximize the size of browser
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//5. Navigate = 1. forward 2. backword 3 refresh 
		
		driver.navigate().refresh();
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().forward();
		
		
		//Url pass to
		
		driver.navigate().to("https://www.google.com/");
		
		driver.navigate().back();
		
		
		
		//6. Quite=>use to close the browser
		driver.quit();

		
		//7. Close=>use to close current tab of browser 
		
		//driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
