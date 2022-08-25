package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample2 
{
	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver",
				   "C:\\Users\\vaibhav\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.Flipkart.com/");
	
		Thread.sleep(2000);
		
		//Step 1
		WebElement login = driver.findElement(By.xpath("//button[contains(@class,'_2HKlqd _3A')]"));
		
		//Step 2
		Actions act=new Actions(driver);
		
		
		act.moveToElement(login).contextClick().build().perform();
		
		
	}
}
