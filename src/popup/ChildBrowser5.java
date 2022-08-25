package popup;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser5 
{
	public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver",
				   "C:\\Users\\vaibhav\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(2000);
		driver.get("https://skpatro.github.io/demo/links/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@class='btn'])[3]")).click();
		Thread.sleep(1000);
		
		Set<String> id = driver.getWindowHandles();
		
		ArrayList<String> windows=new ArrayList<String>(id);
		String HomePage = windows.get(0);
		String NewWindow = windows.get(1);
		
		driver.switchTo().window(NewWindow);
		driver.manage().window().maximize();
		
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text()='Home']")).click();
		Thread.sleep(2000);
		
		driver.switchTo().window(HomePage);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@class='btn'])[1]")).click();
		
		Thread.sleep(2000);
	
		
		driver.quit();
		
	}
	
}
