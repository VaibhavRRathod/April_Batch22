package dynamic_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 
{
	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver",
				   "C:\\Users\\vaibhav\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.Flipkart.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("mi mobile");
		
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		Thread.sleep(2000);
		WebElement review = driver.findElement(By.xpath("((//span[@class='_2_R_DZ'])[1]//span)[4]"));
		
		
		System.out.println("Review for Mi 9A="+review.getText());
		
	}
}
