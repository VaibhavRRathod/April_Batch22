package pom_with_DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Class 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException
	{
		//test data external source maintain 
		
		FileInputStream file =new FileInputStream("C:\\Users\\vaibhav\\OneDrive\\Desktop\\Screenshot\\April1.xlsx");
		
		Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet1");
		
		System.setProperty("webdriver.chrome.driver",
				   "C:\\Users\\vaibhav\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Facebook_login_page login=new Facebook_login_page(driver);
		FacebookSignupPage signup=new FacebookSignupPage(driver);
		Thread.sleep(2000);
		
		String UN = sheet.getRow(0).getCell(0).getStringCellValue(); //dishaa
		System.out.println(UN);
		String pass = sheet.getRow(0).getCell(1).getStringCellValue(); //institute
		System.out.println(pass);
		
		String Fname = sheet.getRow(1).getCell(0).getStringCellValue();
		//String Lname = sheet.getRow(1).getCell(1).getStringCellValue();
		
		login.setUN(UN);
		
		Thread.sleep(2000);
		
		login.SetPass(pass);
		
		Thread.sleep(2000);
		login.ClickOnCreateAccount();
		
		Thread.sleep(2000);
		signup.SetFName(Fname);
		
		Thread.sleep(2000);
		
		signup.SetLName(sheet.getRow(1).getCell(1).getStringCellValue());
		
		
		driver.close();
		
		
		
	}
}
