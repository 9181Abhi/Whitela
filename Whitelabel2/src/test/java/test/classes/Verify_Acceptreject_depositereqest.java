package test.classes;

import java.io.IOException;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pom.classes.Adminbaseclass;
import pom.classes.LoginAdminpomclass;
import pom.classes.Transaction_pomclasses;
import utility.ckasses.screenshot_class;

public class Verify_Acceptreject_depositereqest extends Adminbaseclass 
{

	
	@Test(enabled = false, threadPoolSize = 2)
	public  void depositeacceptrequest() throws InterruptedException, IOException
	{
		LoginAdminpomclass Admin= new LoginAdminpomclass(driver);
		Admin.Admin_usern();
		Admin.Admin_pass();
		Thread.sleep(2000);
		Admin.Admin_login1();
		
		Transaction_pomclasses depositeaccept= new Transaction_pomclasses(driver);
		depositeaccept.transactionbtn();
		Thread.sleep(3000);
		depositeaccept.inputdesacriptation();
		Thread.sleep(3000);
		depositeaccept.enterdescription("Accept");
	
		depositeaccept.depositacceptebtn();
		
		 WebElement toaster = driver.findElement(By.xpath("//div[@class='toast-message']"));
		   String actualtoastermeassge = toaster.getText();
		 
		   
		   String Expectedtoastermeassge="api_messages.massDepositAccept";
		   
		 
		   Assert.assertEquals(actualtoastermeassge, Expectedtoastermeassge,"Depsoite request not Accepted");
		   System.out.println("Depsoite request  Accepted");
		   
		
		screenshot_class.ScreenShot(driver, "Depsoite request accept");
		driver.close();
		
	}
	
		@Test(enabled=true )
		public void depositerejectrequest() throws InterruptedException, IOException
		{
			LoginAdminpomclass Admin= new LoginAdminpomclass(driver);

			Admin.Admin_usern();
			Admin.Admin_pass();
			Thread.sleep(2000);
			Admin.Admin_login1();
			
			Transaction_pomclasses depositereject = new Transaction_pomclasses(driver);
			depositereject.transactionbtn();
			Thread.sleep(3000);
			
			
			//Thread.sleep(3000);	
			
			try {
				depositereject.inputdesacriptation();
				
				depositereject.enterdescription("Reject");
				System.out.println("In catch");
			}
			
//			catch(NoSuchElementException e)
//			{
//				System.out.println("In try");
//				driver.close();
//				
//		}
			catch (Exception e) {
		        // Catch any other exception that might occur
		        System.out.println("An unexpected error occurred:");
		        driver.close(); // Close the browser in case of an error
		    }
			
			
			
			
			depositereject.depositerejectbtn();
			
			 WebElement toaster = driver.findElement(By.xpath("//div[@class='toast-message']"));
			   String actualtoastermeassge = toaster.getText();
			 
			   
			   String Expectedtoastermeassge="api_messages.massDepositReject";
			   
			 
			   Assert.assertEquals(actualtoastermeassge, Expectedtoastermeassge,"Depsoite request not Rejected");
			   System.out.println("Depsoite request  Rejected");
			   
			
			screenshot_class.ScreenShot(driver, "Depsoite request Rejected");
			driver.close();
			
			
		}
	
}
