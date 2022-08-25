package frame;

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
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		
		Thread.sleep(2000);
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));

		driver.switchTo().frame(iframe);
		
		WebElement frame = driver.findElement(By.xpath("//button[contains(text(),'Click me t')]"));	
		
	

		Thread.sleep(2000);
		frame.click();
		
		
	}
	
}
