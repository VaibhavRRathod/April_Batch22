package pom_with_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookSignupPage 
{
@FindBy(xpath="//input[@name='firstname']") private WebElement FName;
	
	@FindBy(xpath="//input[@name='lastname']") private WebElement LName;
	
	
	
	public FacebookSignupPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void SetFName(String firstname)
	{
		FName.sendKeys(firstname);
	}
	
	public void SetLName(String lastname)
	{
		LName.sendKeys(lastname);
	}
	

	
}
