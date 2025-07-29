package utility.ckasses;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.apache.poi.ss.usermodel.*;
import org.openqa.selenium.WebDriver;
import java.io.File;

public class excelsheet_class {
	Workbook workbook;
	
//	public static String testData(WebDriver driver,int a, int b) throws IOException
//	{
//		String path = "C:\\Drivers\\Excels\\LoginAdmin.xlsx";
//		FileInputStream file= new FileInputStream(path);
//		XSSFWorkbook wb = new XSSFWorkbook(file);
//		XSSFSheet st = wb.getSheet("Sheet1");
//		XSSFRow rw = st.getRow(a);
//		XSSFCell cl = rw.getCell(b);
//		return cl.getStringCellValue();		
//	}
//	
//	
//	public static String testData1(WebDriver driver,int a, int b) throws IOException
//	{
//		String path = "C:\\Drivers\\Excels\\LoginAdmin.xlsx";
//		FileInputStream file= new FileInputStream(path);
//		XSSFWorkbook wb = new XSSFWorkbook(file);
//		XSSFSheet st = wb.getSheet("Sheet2");
//		XSSFRow rw = st.getRow(a);
//		XSSFCell cl = rw.getCell(b);
//		return cl.getStringCellValue();		
//	}
//	
//	public static String testData2(WebDriver driver,int a, int b) throws IOException
//	{
//		String path = "C:\\Drivers\\Excels\\LoginAdmin.xlsx";
//		FileInputStream file= new FileInputStream(path);
//		XSSFWorkbook wb = new XSSFWorkbook(file);
//		XSSFSheet st = wb.getSheet("Sheet3");
//		XSSFRow rw = st.getRow(a);
//		XSSFCell cl = rw.getCell(b);
//		return cl.getStringCellValue();		
//	}
//	
//	
//	public static String testData4(WebDriver driver,int a, int b) throws IOException
//	{
//		String path = "C:\\Drivers\\Excels\\registeruser.xlsx";
//		FileInputStream file= new FileInputStream(path);
//		XSSFWorkbook wb = new XSSFWorkbook(file);
//		XSSFSheet st = wb.getSheet("Sheet1");
//		XSSFRow rw = st.getRow(a);
//		XSSFCell cl = rw.getCell(b);
//		return cl.getStringCellValue();		
//	}
	
	public  excelsheet_class(String filePath) 
	{
        try {
            FileInputStream fis = new FileInputStream(new File(filePath));
            workbook = new XSSFWorkbook(fis);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getCellData(String sheetName, int row, int col) {
    	Sheet sheet = workbook.getSheet(sheetName);
        Row r = sheet.getRow(row);
        Cell cell = r.getCell(col);
        if (cell.getCellType() == CellType.NUMERIC) {
            DataFormatter formatter = new DataFormatter();
            return formatter.formatCellValue(cell);  
        }

        return cell.toString();
        
    }

    public int getRowCount(String sheetName) {
        return workbook.getSheet(sheetName).getLastRowNum();
    }
	
	
	
	
	
	
	
}
