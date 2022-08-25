package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class 
{
	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver",
				   "C:\\Users\\vaibhav\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("C:/Users/vaibhav/OneDrive/Desktop/Screenshot/HTML%20Programming/Signup%20Page.html");
		
		Thread.sleep(2000);
		
		WebElement UN = driver.findElement(By.className("abc"));
		
		UN.sendKeys("abc");
		
		WebElement pass = driver.findElement(By.className("abc"));
		
		pass.sendKeys("xyz");
		
		
	}
	
	
}
