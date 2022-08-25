package pom_with_DDF;

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
	
	@FindBy(xpath="//a[text()='Create New Account']") private WebElement createaccount;
	
	
	//Step 2 Initialize within constructor with access level public
	
	public Facebook_login_page(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	
	
	//Step 3 Utilize within a method with access level public 
	
	
	public  void setUN(String Username) //dishaa
	{
		UN.sendKeys(Username);
	}
	
	public void SetPass(String password)
	{
		Pass.sendKeys(password);
	}
	
	public void ClickBtn()
	{
		btn.click();
	}
	
	public void ClickOnCreateAccount()
	{
		createaccount.click();
	}
}
