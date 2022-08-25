package pom_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook_login_page 
{

	//Step 1  Declare D.M Globally With an access level private 
	
	@FindBy(xpath="//input[@id='email']") private WebElement UN;
	
	@FindBy(xpath="//input[@id='pass']") private WebElement Pass;
	
	@FindBy(xpath="//button[text()='Log In']") private WebElement btn;
	
	@FindBy(xpath="//a[text()='Create New Account']") private WebElement creataccount;
	
	
	//Step 2 Initialize within constructor with access level public
	
	public Facebook_login_page(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	
	
	//Step 3 Utilize within a method with access level public 
	
	
	public  void setUN()
	{
		UN.sendKeys("abc");
	}
	
	public void SetPass()
	{
		Pass.sendKeys("aaaaaaaaaaaaaa");
	}
	
	public void ClickBtn()
	{
		btn.click();
	}
	
	public void ClickOnCreateAccount()
	{
		creataccount.click();
	}
	
}
