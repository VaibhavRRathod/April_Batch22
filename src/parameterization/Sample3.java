package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Sample3 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	
		FileInputStream file=new FileInputStream("C:\\Users\\vaibhav\\OneDrive\\Desktop\\Screenshot\\April1.xlsx");
		
		//to open excel we need to use of create method which is present inside a woorkbookfactory 
		
		Sheet sheet = WorkbookFactory.create(file).getSheet("Basic");
		
		String data1 = sheet.getRow(0).getCell(0).getStringCellValue();  //String value 
		
		double data2 = sheet.getRow(1).getCell(0).getNumericCellValue();
		
		boolean data3 = sheet.getRow(2).getCell(0).getBooleanCellValue();
		
		
		System.out.println("String value from excel sheet ="+data1);
		
		System.out.println("Numeric value from excel sheet ="+data2);
		
		System.out.println("Boolean value from excel sheet ="+data3);
		
		
		
		
	}
}
