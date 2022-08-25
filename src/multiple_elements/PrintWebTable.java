package multiple_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintWebTable 
{
	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver",
				   "C:\\Users\\vaibhav\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
	
		WebDriver driver=new ChromeDriver();
		
		driver.get("C://Users//vaibhav//OneDrive//Desktop//Screenshot//HTML%20Programming//Table.html");
		
		driver.manage().window().maximize();
		
		List<WebElement> headers = driver.findElements(By.xpath("/html/body/table/tbody/tr/th"));
		
		int Size = headers.size();
		
		System.out.println(Size);
		
		for(WebElement op:headers)
		{
			System.out.print(op.getText());
		}
		
	}
	
}
