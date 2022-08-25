package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample9 
{
	public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver",
			       "C:\\Users\\vaibhav\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://testpages.herokuapp.com/basic_html_form.html");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement Multiselectected_listbox = driver.findElement(By.xpath("//select[@name='multipleselect[]']"));
		
		
		Select s=new Select(Multiselectected_listbox);
//		
//		s.selectByIndex(0);
//		s.selectByIndex(1);
		s.deselectByIndex(3);
		
		
		
		List<WebElement> op = s.getAllSelectedOptions();

		System.out.println(op.size());
		
		for(WebElement op1:op)
		{
			System.out.println(op1.getText());
		}
		
		Thread.sleep(2000);
		driver.quit();
		
	}
	
}
