package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName 
{
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver",
				   "C:\\Users\\vaibhav\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		//1. get =>it is use to pass URL
		
		driver.get("C:/Users/vaibhav/OneDrive/Desktop/Screenshot/HTML%20Programming/Signup%20Page.html");
		
		driver.manage().window().maximize();
		
		WebElement Un = driver.findElement(By.tagName("input"));
		
		Un.sendKeys("Vaibhav");
		
		
		 WebElement pass = driver.findElement(By.tagName("input"));
		 
		 pass.sendKeys("Vaibhav11");
		 
		WebElement button = driver.findElement(By.tagName("input"));
		
		button.click();
		
		//if page contain more than one tagname then our element will only first one 
		
		
	}
	
	
}
