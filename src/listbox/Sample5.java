package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample5 
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
	
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
	
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
	
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	
		Select s=new Select(day);
		Select s2=new Select(year);
		Select s3=new Select(month);
	
		List<WebElement> option = s.getOptions();
		List<WebElement> option1 = s2.getOptions();
		List<WebElement> option2 = s3.getOptions();
	
		//List==>Collection 
	
		int size = option.size();
		int size1 = option1.size();
		int size2 = option2.size();
	
	
	
		System.out.println("size of day dropdown="+size);
	
		System.out.println("size of year dropdown="+size1);
	
		System.out.println("size of month dropdown="+size2);
	
		Thread.sleep(2000);
	
		driver.close();
	
	
	
	}


}
