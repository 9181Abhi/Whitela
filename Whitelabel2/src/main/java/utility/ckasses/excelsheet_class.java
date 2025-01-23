package utility.ckasses;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class excelsheet_class {

	
	public static String testData(WebDriver driver,int a, int b) throws IOException
	{
		String path = "C:\\Drivers\\Excels\\LoginAdmin.xlsx";
		FileInputStream file= new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet st = wb.getSheet("Sheet1");
		XSSFRow rw = st.getRow(a);
		XSSFCell cl = rw.getCell(b);
		return cl.getStringCellValue();		
	}
	
	
	public static String testData1(WebDriver driver,int a, int b) throws IOException
	{
		String path = "C:\\Drivers\\Excels\\LoginAdmin.xlsx";
		FileInputStream file= new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet st = wb.getSheet("Sheet2");
		XSSFRow rw = st.getRow(a);
		XSSFCell cl = rw.getCell(b);
		return cl.getStringCellValue();		
	}
	
	public static String testData2(WebDriver driver,int a, int b) throws IOException
	{
		String path = "C:\\Drivers\\Excels\\LoginAdmin.xlsx";
		FileInputStream file= new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet st = wb.getSheet("Sheet3");
		XSSFRow rw = st.getRow(a);
		XSSFCell cl = rw.getCell(b);
		return cl.getStringCellValue();		
	}
	
	
		
	
	
	
	
	
	
	
	
}
