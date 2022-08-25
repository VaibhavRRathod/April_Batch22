import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				   "C:\\Users\\vaibhav\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement tab = driver.findElement(By.xpath("//a[text()='Click Here']"));
		
		
		
		tab.click();

	//	String text = driver.findElement(By.xpath("//body//h3")).getText(); //Opening a new window

		
		//driver.switchTo().window(al.get(0));
		
		String text1 = driver.findElement(By.xpath("//body//h3")).getText();  //Opening a new window
		tab.click();
		tab.click();
		
		
		Set<String> windows = driver.getWindowHandles();
		
		ArrayList<String> al=new ArrayList<String>(windows);
		
		System.out.println(al.get(0));
		System.out.println(al.get(1));
		System.out.println(al.get(2));
		System.out.println(al.get(3));
		
		driver.switchTo().window(al.get(1));
		String newtab = driver.findElement(By.xpath("//h3[text()='New Window']")).getText();
		
		
		System.out.println("Page 1"+newtab);
		Thread.sleep(1000);
		
		driver.switchTo().window(al.get(0));
		
		System.out.println("Page 0"+text1);
		Thread.sleep(1000);
		
		driver.switchTo().window(al.get(2));
		
		System.out.println("Page 2"+newtab);
		Thread.sleep(1000);
		
//		driver.switchTo().window(al.get(0));
//		
//		System.out.println("Page 0"+text1);
//		Thread.sleep(1000);
		
		driver.switchTo().window(al.get(3));
		
		System.out.println("Page 3"+newtab);
		Thread.sleep(1000);
		driver.quit();
	
		
	}
	

}
