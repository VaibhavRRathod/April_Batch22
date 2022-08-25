package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample10 
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
		
//		s.deselectAll();
//		
//		s.selectByIndex(0);
		
		WebElement firstoption = s.getFirstSelectedOption();
		
		System.out.println(firstoption.getText());
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
		
		
		
		
		
	}
}
