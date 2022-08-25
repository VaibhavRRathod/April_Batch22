package listbox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample7 
{
	public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver",
			       "C:\\Users\\vaibhav\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		

		Thread.sleep(2000);
		
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		
		Select s=new Select(day);
		
		List<WebElement> options = s.getOptions();
		
		for(int i=0;i<=options.size()-1;i++)
		{
			
			WebElement text = options.get(i);
			
			System.out.println(text.getText());
			
		}
		
		
		
		
		
		
	}
}
