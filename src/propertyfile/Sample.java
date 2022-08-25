package propertyfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Sample 
{
	public static void main(String[] args) throws IOException
	{
	
		Properties obj =new Properties();
		
		FileInputStream openbrowser=new FileInputStream("C:\\Users\\vaibhav\\eclipse-workspace\\Selenium\\propertyfile\\Selenium_1.properties");
		
		obj.load(openbrowser);
		
		String property = obj.getProperty("April");
		
		System.out.println(property);
		
		//Step1   right click on folder ==> select file ==>enter filename .proerties 
		//Step2   Create object of properties 
		//Step3   Store property file path in a ref variable
		//Step4   load property file  by using function obj.load(openbrowser);
		//Ster5   to fetch any key value we have to use obj.getProperty("April");
		
		
		
	}
	
}
