package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample4 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException
	{
		
		String exp;
		
		FileInputStream file=new FileInputStream("C:\\Users\\vaibhav\\OneDrive\\Desktop\\Screenshot\\April1.xlsx");
		
		Sheet sheet = WorkbookFactory.create(file).getSheet("Kite");
		
	
		System.setProperty("webdriver.chrome.driver",
				   "C:\\Users\\vaibhav\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();

		driver.get("https://kite.zerodha.com/");
		
		
		Thread.sleep(2000);
		
		WebElement UN = driver.findElement(By.xpath("//input[@id='userid']"));
		
		String Un1 = sheet.getRow(0).getCell(0).getStringCellValue();
		
		UN.sendKeys(Un1);
		
		WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
		
		String pass1 = sheet.getRow(0).getCell(1).getStringCellValue();
		
		pass.sendKeys(pass1);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
		
		System.out.println(Un1);
		
		Thread.sleep(2000);
		
		WebElement pin = driver.findElement(By.xpath("//input[@id='pin']"));
	
		String pin1 = sheet.getRow(0).getCell(2).getStringCellValue();
		
		pin.sendKeys(pin1);
		
		driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
		
		Thread.sleep(2000);
		WebElement act = driver.findElement(By.xpath("//span[@class='user-id']"));
		
		String actual = act.getText();
		exp=Un1;
		
		
		if(actual.equals(exp))
		{
			System.out.println("test case 001 is pass");
		}
		else 
		{
			System.out.println("test case 001 is fail");
		}
		
		
		
	}
}
