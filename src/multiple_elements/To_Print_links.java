package multiple_elements;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class To_Print_links 
{
	{
		
		System.setProperty("webdriver.chrome.driver",
				   "C:\\Users\\vaibhav\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		
		int Size = links.size();
		
		System.out.println(Size);
	
		
		for(WebElement op:links)
		{
			System.out.println(op.getText());
		}
		
		
		
		
	}
	
}
