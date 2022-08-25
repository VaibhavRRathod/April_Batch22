package screenshot;

import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Sample1 
{
	public static void main(String[] args) throws InterruptedException, IOException
	{
	

		System.setProperty("webdriver.chrome.driver",
			       "C:\\Users\\vaibhav\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		//1. get =>it is use to pass URL
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		
		File dest=new File("C:\\Users\\vaibhav\\OneDrive\\Desktop\\Screenshot\\Facebook_signin.jpg");
		
		FileHandler.copy(source, dest);
		
		
		
		
		
		
	}
}
