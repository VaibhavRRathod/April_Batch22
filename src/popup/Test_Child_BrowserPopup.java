package popup;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Child_BrowserPopup 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver",
				   "C:\\Users\\vaibhav\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://meesho.com/");
		
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Download the Meesho App']")).click();
		Thread.sleep(2000);
		
		Set<String> app = driver.getWindowHandles();
		
		ArrayList<String> windows = new ArrayList<String>(app);
		
		Iterator<String> it = windows.iterator();
		
		String parentwindowid = it.next();
		
		System.out.println("your home page window id:" +parentwindowid);
		
		String childwindowid = it.next();
		
		System.out.println("your child windo id:" +childwindowid);
		
		driver.switchTo().window(childwindowid);
		
		String title1 = driver.getTitle();
		
		System.out.println(title1);
		
		
		Thread.sleep(3000);
		
		driver.switchTo().window(parentwindowid);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Become a Supplier']")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
		
	}
}
