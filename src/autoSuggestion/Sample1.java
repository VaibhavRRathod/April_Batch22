package autoSuggestion;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 
{

	public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver",
				   "C:\\Users\\vaibhav\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[contains(@class,'gLFy')]")).sendKeys("One Plus");
		
		Thread.sleep(2000);
		
		List<WebElement> suggetions = driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		
		for( WebElement op:suggetions)
		{
			System.out.println(op.getText());
		}
		
		
	}
}
