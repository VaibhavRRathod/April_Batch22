package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 
{

	public static void main(String[] args) throws InterruptedException
	{
	
		
		System.setProperty("webdriver.chrome.driver",
				   "C:\\Users\\vaibhav\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		WebElement act = driver.findElement(By.xpath("//h2[@class='_8eso']"));
		
		System.out.println(act.getText());  
		
		String act1 = act.getText();
		
		String exp="Facebook helps you connect and share with the people in your life.";
		
		if(act1.equals(exp))
		{
			System.out.println("pass");
		}
		else
		{
		System.out.println("fail");	
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
