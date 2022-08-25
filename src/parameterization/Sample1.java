package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Sample1 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
	
		
		FileInputStream file=new FileInputStream("C:\\Users\\vaibhav\\OneDrive\\Desktop\\Screenshot\\April1.xlsx");
		
		String xlfile = WorkbookFactory.create(file).getSheet("April").getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(xlfile);
		
	 
		
	}
	
}
