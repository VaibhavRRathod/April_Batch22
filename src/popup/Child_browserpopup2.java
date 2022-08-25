package popup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_browserpopup2 
{
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver",
				   "C:\\Users\\vaibhav\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();

		driver.get("https://skpatro.github.io/demo/links/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@class='btn'])[2]")).click();

		
		Thread.sleep(10000);
		
		Set<String> id = driver.getWindowHandles();
		
		ArrayList<String> WebPageid=new ArrayList<String>(id);  //Order of insertion is maintain
		
		String FirstWebPage = WebPageid.get(0);
		String SecondWebPage = WebPageid.get(1);
		
		System.out.println("Id of first web page is "+FirstWebPage);
		System.out.println("Id of Second web page is "+SecondWebPage);
		
		driver.switchTo().window(SecondWebPage);
		
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
	
		
	}
	
	
	
}
