package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample2 
{
	public static void main(String[] args) throws InterruptedException
	{
		

		System.setProperty("webdriver.chrome.driver",
			       "C:\\Users\\vaibhav\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		//Step 1
		Thread.sleep(2000);
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Thread.sleep(2000);
		//Step 2
		
		//System.out.println(month.getSize());
		
		Select s=new Select(month);
		
		// 3 by index, by visible text,by value 
		
		s.selectByIndex(0);
		
		Thread.sleep(2000);
		
		s.selectByIndex(2);
		
		Thread.sleep(2000);
		s.selectByVisibleText("Dec");
		
		Thread.sleep(2000);
		s.selectByVisibleText("Mar");
		
		Thread.sleep(2000);
		s.selectByValue("1");
		
		
		}
	
}
