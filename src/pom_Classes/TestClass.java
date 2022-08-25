package pom_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				   "C:\\Users\\vaibhav\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
	
		Facebook_login_page login =new Facebook_login_page(driver);
		
		Thread.sleep(2000);
		
		login.setUN();
		
		Thread.sleep(1000);
		
		login.SetPass();
		
		Thread.sleep(1000);
		
		login.ClickOnCreateAccount();
		Thread.sleep(1000);
		FacebookSignupPage signup=new FacebookSignupPage(driver);
		Thread.sleep(1000);
		signup.SetFName();
		Thread.sleep(1000);
		signup.SetLName();
		
		
		
		
	}
	
	
	
}
