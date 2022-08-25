package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Droup 
{
	public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver",
				   "C:\\Users\\vaibhav\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		WebElement source = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		
		WebElement dest = driver.findElement(By.xpath("(//div[@class='ui-widget-content'])[2]"));
		
		WebElement source2 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		
		WebElement dest2 = driver.findElement(By.xpath("(//div[@class='ui-widget-content'])[3]"));
		
		Actions act =new Actions(driver);
		
		//act.moveToElement(source).clickAndHold().moveToElement(dest).release().build().perform();		
		
		
		//1.moveToElement(source)=> cursor move to  source location
		//2.clickAndHold()=>then we click on that element & hold it 
		//3.moveToElement(dest)=>then again we moved our cursor to dest location
		//4.release()=>then we just release the element 
		
		act.dragAndDrop(source, dest).perform();
		act.dragAndDrop(source2, dest2).perform();
		
		
		
		
		
	}
	
}
