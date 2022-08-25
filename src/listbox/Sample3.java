package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample3 
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
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		
		//15 Aug 1947
		
		Select s1=new Select(day);
		Select s2=new Select(month);
		Select s3=new Select(year);
		
		s1.selectByVisibleText("15");
		Thread.sleep(2000);
		s2.selectByVisibleText("Aug");
		Thread.sleep(2000);
		s3.selectByValue("1947");
		
		s3.deselectByValue("1947");
		
		boolean verifylistbox1 = s1.isMultiple();
		
		boolean verifylistbox2 = s2.isMultiple();
		
		boolean verifylistbox3 = s3.isMultiple();
		
		
		System.out.println("List box 1 ="+verifylistbox1);
		System.out.println("List box 2 ="+verifylistbox2);
		System.out.println("List box 3 ="+verifylistbox3);
		
		
	}
	
	
	
}
