package test.classes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pom.classes.Adminbaseclass;
import pom.classes.registeradminpomclass;
import utility.ckasses.excelsheet_class;

public class AdminRegisterTest extends Adminbaseclass
{

	@Test
	public void createuser() throws InterruptedException
	{
		
		Thread.sleep(5000);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		   WebElement player=driver.findElement(By.xpath("//span[text()='Player']"));
		   player.click();
		   Thread.sleep(1000);
		   
		   WebElement createplayer=driver.findElement(By.xpath("//a[text()='Create Player']"));
		   createplayer.click();
		   Thread.sleep(1000);
		   
		   excelsheet_class reader =new excelsheet_class("C:\\Drivers\\Excels\\8774BA10.xlsx");
		   registeradminpomclass registerPage = new registeradminpomclass(driver);

	        int rowCount = reader.getRowCount("Sheet1");
	        
	        for (int i = 1; i <= rowCount; i++)
	        {
	        	 String username = reader.getCellData("Sheet1", i, 0);
	        	 String password = reader.getCellData("Sheet1", i, 1);
	        	 String confirmpass = reader.getCellData("Sheet1", i, 2);
	        	 String email = reader.getCellData("Sheet1", i, 3);
	        	 String contact = reader.getCellData("Sheet1", i, 4);
	        	 //String bank = reader.getCellData("Sheet1", i, 5);
	        	 Thread.sleep(2000);
	        	 WebElement bank=driver.findElement(By.xpath("//div[text()='Select Bank']"));
	        	 bank.click();
	        	 Thread.sleep(5000);
	        	 String Accname = reader.getCellData("Sheet1", i, 5);
	        	 String Accnumber = reader.getCellData("Sheet1", i, 6);
	        	 
	        	
	        	
	        	 
	        	 Thread.sleep(5000);
	        	 registerPage.registeruser(username, password, confirmpass, email, contact, Accname, Accnumber);
	        	 registerPage.registerbtn();
	        }
	        driver.close();		   	
	}
	  
}
