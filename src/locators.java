import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators 
{
	
	public static void main(String[] args) throws InterruptedException
	{
	

		System.setProperty("webdriver.chrome.driver",
				   "C:\\Users\\vaibhav\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		//1. get =>it is use to pass URL
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc");
		
		Thread.sleep(1000);
		
		WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
		
		pass.sendKeys("123");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
	
		
		driver.quit();
		
	}
	
	
	
}
