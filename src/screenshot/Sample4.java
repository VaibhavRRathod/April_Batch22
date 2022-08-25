package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Sample4 
{
	public static void main(String[] args) throws InterruptedException, IOException
	{
	
		System.setProperty("webdriver.chrome.driver",
			       "C:\\Users\\vaibhav\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		

		
		driver.get("https://www.paytm.com/");

		Thread.sleep(2000);
		
		
		
		String Rstring = RandomString.make(5);
		
		//System.out.println(Rstring);
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		
		File dest=new File("C:\\Users\\vaibhav\\OneDrive\\Desktop\\Screenshot\\Fkart"+Rstring+".jpg");
		
		FileHandler.copy(source, dest);
		
		driver.quit();
		
		
		
	}
}
