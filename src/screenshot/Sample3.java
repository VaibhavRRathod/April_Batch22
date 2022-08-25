package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Sample3 
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
	
		System.setProperty("webdriver.chrome.driver",
			       "C:\\Users\\vaibhav\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.google.com/");
		
		Thread.sleep(2000);
		
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String Rstring = RandomString.make(2);  //10
		
		File dest=new File("C:\\Users\\vaibhav\\OneDrive\\Desktop\\Screenshot\\Google_"+Rstring+".png");         //Google_random number
		
		FileHandler.copy(source, dest);
		
		driver.quit();
		
		
	}
	
}
