package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert3 
{
	public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver",
				   "C:\\Users\\vaibhav\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://skpatro.github.io/demo/alerts/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@class='btn'])[4]")).click();
		Thread.sleep(1000);
		Alert alt = driver.switchTo().alert();
		
		String text = alt.getText();
		System.out.println(text);
		alt.accept();
		
		Thread.sleep(2000);
	
		
		driver.findElement(By.xpath("(//input[@class='btn'])[1]")).click();
		
		
	}
	
}
