package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample3 
{
	
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver",
			       "C:\\Users\\vaibhav\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("C:/Users/vaibhav/OneDrive/Desktop/Screenshot/HTML%20Programming/dummyUI.html");
	
			System.out.println(driver.getTitle());
	

}
	
	
}