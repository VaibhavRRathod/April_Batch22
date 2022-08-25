package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample3 
{
	public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver",
				   "C:\\Users\\vaibhav\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/iframe");
		
		driver.switchTo().frame("mce_0_ifr");
		
		Thread.sleep(2000);
		
		WebElement text = driver.findElement(By.xpath("//body[@id='tinymce']"));
		
		text.sendKeys("Hi class");
		//to switch selenium focus from frame to main page we have two  methods=>1. default content & 2. parent frame 
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//button[contains(@class,'tox-mbtn tox-mbtn--select')]")).click();
		
	}
}
