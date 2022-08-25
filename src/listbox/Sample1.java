package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample1 
{
	
	public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver",
			       "C:\\Users\\vaibhav\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(2000);
		
		//Step 1= save list box in ref variable 
		
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		
		//Step 2= create object of select class 
		
		Select s=new Select(day);
		
		
		//step 3 =use methods of select 
		
		//s.selectByIndex(25);   
		
		//s.selectByVisibleText("15");
		
		s.selectByValue("7");
		
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
	}
	


}
