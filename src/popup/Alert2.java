package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert2
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				   "C:\\Users\\vaibhav\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();

		driver.get("https://demoqa.com/alerts");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		
		Thread.sleep(2000);
		
		 Alert alt = driver.switchTo().alert();
		 String text = alt.getText();  //get the text present in that popup

		// alt.accept();    			//click on OK button
		
		 alt.dismiss();           //Click on Cancel button
	
		
		System.out.println(text);
		
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[text()='Browser Windows']")).click();
		
		
		
	}
}
