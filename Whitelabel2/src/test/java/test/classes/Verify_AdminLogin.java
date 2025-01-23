package test.classes;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import pom.classes.Adminbaseclass;
import pom.classes.LoginAdminpomclass;
import utility.ckasses.screenshot_class;



public class Verify_AdminLogin extends Adminbaseclass {

	
	@Test(priority = 0)
	public void adminlogin() throws InterruptedException, IOException
	{
		LoginAdminpomclass Admin= new LoginAdminpomclass(driver);
		Admin.Admin_usern();
		Admin.Admin_pass();
		Thread.sleep(3000);
		
		Admin.Admin_login1();
		
		String title= driver.getTitle();
		if(title.equals("Signin | WhiteLabel"))
		{
			System.out.println("Admin Login sucessfully");
			
		}
		else {
			System.out.println("Invalid credential");
			
		}
		
		Thread.sleep(1000);
		screenshot_class.ScreenShot(driver,"Admin login sucessfully");
			
		Admin.Player_click();
		Thread.sleep(2000);
		Admin.Validation_click();
		Admin.check_click();
		Thread.sleep(1000);
		Admin.Validation_Accept_click();
		Thread.sleep(1000);
		Admin.popup_Accept_click();
       // System.out.println("Player validate Sucessfully");
		 
		
    WebElement toaster = driver.findElement(By.xpath("//div[@class='toast-message']"));
   String actualtoastermeassge = toaster.getText();
 //  System.out.println(actualtoastermeassge);
   
   String Expectedtoastermeassge="Player validated.";
   
 
   Assert.assertEquals(actualtoastermeassge, Expectedtoastermeassge,"Player Validate not sucessfully");
   System.out.println("Player Validate sucessfully");
   
   screenshot_class.ScreenShot(driver,"Validate Player");
   
   Thread.sleep(1000);
		driver.close();
		
	}

	
	}


	

