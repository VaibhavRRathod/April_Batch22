package dynamic_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dyanamic_WebTable 
{
	public static void main(String[] args)
	{
	
		System.setProperty("webdriver.chrome.driver",
				   "C:\\Users\\vaibhav\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("C://Users//vaibhav//OneDrive//Desktop//Screenshot//HTML%20Programming//Table.html");
		
		// ((//table[@id='abc123']//tr)[1]//th)[1]              ->Headers
		// ((//table[@id='abc123']//tr)[2]//td)[1]			  ->Complete Table expect Headers 
		
		// //table[@id='abc123']//tr                          ->Complete table
		
		int tablesize = driver.findElements(By.xpath("//table[@id='abc123']//tr")).size();  //size of table
		
		
		for(int i=1; i<=tablesize;i++)  //2
		{
		
			int colsize=0;
			if(i==1)
			{
				colsize=driver.findElements(By.xpath("(//table[@id='abc123']//tr)["+i+"]//th")).size();
			}
			else
			{
				colsize=driver.findElements(By.xpath("(//table[@id='abc123']//tr)["+i+"]//td")).size();
			}
			
			
			for(int j=1;j<=colsize;j++)
			{
				String text="";
				if(i==1)
				{
					
					text=driver.findElement(By.xpath("((//table[@id='abc123']//tr)["+i+"]//th)["+j+"]")).getText();
				}
				else
				{
					text=driver.findElement(By.xpath("((//table[@id='abc123']//tr)["+i+"]//td)["+j+"]")).getText();
				}
				
				System.out.print(text+" ");      
				
			}
			System.out.println();
			
		}
		
	
	}
}
