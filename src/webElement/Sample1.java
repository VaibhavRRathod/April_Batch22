package webElement;

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
		
		
		
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		WebElement UN = driver.findElement(By.id("email"));
		
		WebElement click = driver.findElement(By.xpath("//button[contains(@id,'u_0_')]"));
		    
		WebElement createacc = driver.findElement(By.xpath("//a[contains(@id,'u_0_2')]"));
		
		
                                                                    		
		                                                                  
	 //1. Send keys=>this method is use to enter value in the i/p field 
		
		UN.sendKeys("abcdef");
		
	//2. clear=> this method is use to clear value in the text field 
		
		Thread.sleep(2000);
		
		UN.clear();
		
		
	//3. click=>this method is use to click on btn/icon etc
		
		//click.click();
		
		
	//4. is enable=> this method is use to verify the element is enable or disable  return type boolean
		
		boolean un1 = UN.isEnabled();
		
		boolean btn = click.isEnabled();
		
		System.out.println("Result of username tab=>"+un1);
		
		System.out.println("Result of button =>"+btn);
		
		
		
		createacc.click();
		
		Thread.sleep(2000);
		
	//5. is selected=> use to verify radiobutton's or checkbox return type=boolean
		
		WebElement radiobtn = driver.findElement(By.xpath("(//input[contains(@class,'8esa')])[1]"));  //xpath by index
		radiobtn.click();
		
		boolean btn1 = radiobtn.isSelected();
		
		System.out.println("Result of radio btn1 =>"+btn1);
		
		driver.findElement(By.xpath("//img[contains(@class,'_8idr img')]")).click();
		//driver.navigate().back();
		
		Thread.sleep(2000);
		
	//6. is display=> it is use to verify the element is present or not return type is boolean
		//if condition is fails it will return an exception 
		
		
		WebElement img = driver.findElement(By.xpath("//img[contains(@class,'fb_logo _8ilh img')]"));
		
		boolean img1 = img.isDisplayed();
		
		System.out.println("Result of img=>"+img1);
		
		
	//7 get text =>use to print the text of web element ,return type is string
		
		String text = createacc.getText();
		
		System.out.println(text);
		
		WebElement text1 = driver.findElement(By.xpath("//h2[@class='_8eso']"));
		
		System.out.println("facebook text="+text1.getText());
		
		String exp="Facebook helps you connect and share with the people in your life.";
		
		if(exp.equals(text1.getText()))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail text is not available properly");
		}
		
		
		
		
		
	}
	

	
	
	
}
