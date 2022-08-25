package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				   "C:\\Users\\vaibhav\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();

		driver.get("https://demoqa.com/alerts");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		
		
		org.openqa.selenium.Alert alt =driver.switchTo().alert();
		//handle the popup
		
		System.out.println(alt.getText());
		alt.accept();
		
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Browser Windows']")).click();
		
		
		
		
	}
}
