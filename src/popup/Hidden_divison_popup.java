package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_divison_popup 
{

	public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver",
				   "C:\\Users\\vaibhav\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		

		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(2000);
		
		WebElement Un = driver.findElement(By.xpath("(//input[contains(@class,'_2IX_2-')])[1]"));
		WebElement Pass = driver.findElement(By.xpath("(//input[contains(@class,'_2IX_2-')])[2]"));
		
		Un.sendKeys("abc");
		Pass.sendKeys("xyz");
		
		driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l ')]")).click();
		
		
		
	}
	
}
