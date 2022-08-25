package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name 
{
	
	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver",
				   "C:\\Users\\vaibhav\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement UN = driver.findElement(By.name("email"));
		
		UN.sendKeys("abc");
		
		driver.findElement(By.name("pass")).sendKeys("1223333");
		
		driver.findElement(By.name("login")).click();
		
		
	}
	

}
