package listbox;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample8 
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
		
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		
		Select s=new Select(year);
		
		List<WebElement> option = s.getOptions();
		
		TreeSet tr=new TreeSet();
		
		ArrayList ar=new ArrayList();
		
		for(WebElement op:option)
		{
			String text = op.getText();
			System.out.println(text);
			tr.add(text);
			ar.add(text);
		}
		
		System.out.println("====================================");
		
		for(Object op1:tr)
		{
			System.out.println(op1);
		}
		
		System.out.println("===================================");
		
		for(Object op:ar)
		{
			System.out.println(op);
		}
		
		
	}
}
