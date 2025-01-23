package test.classes;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


import pom.classes.Loginpomclass;
import pom.classes.Registerpomclass;
import pom.classes.Testbaseclass;
import pom.classes.Transaction_pomclasses;

import utility.ckasses.screenshot_class;

public class Registration_page_changes extends Testbaseclass {

	
	@Test
	public void registratiopagechange() throws InterruptedException, IOException
	{
		Registerpomclass register = new Registerpomclass(driver);
		register.languagebtn();
		register.englishlangbtn();
		Thread.sleep(1000);
		
		register.registerbtn();
		register.user1();
		Thread.sleep(2000);
		register.pass1();
		register.confirmpass1();	
		register.Click_InnerRegisterbtn();
		Thread.sleep(20000);

		System.out.println("Here Start the sucesscondition");
		String ExpectURL="https://wl2-test-user.dev-diamondteam.com/login-pin";
		String actualUrl=driver.getCurrentUrl();
		if(ExpectURL.equalsIgnoreCase(actualUrl)) 
		{
			System.out.println("Primary registration complete");
			
		}
		
		else 
		{
			WebElement errorprimary = driver.findElement(By.xpath("//span[@class='text-danger error-msg']"));
			System.out.println("Validation found");
			if(errorprimary.isDisplayed()) 
	            {
	            	System.out.println("Validation Error Found: " + errorprimary.getText());
	            	//screenshot_class.ScreenShot(driver, "RegistrationValidation");
	            	System.out.println("Registration Validation Found");
	            	//screenshot_class.ScreenShot(driver, "Validationerror");
	            	driver.close(); 
	    }
			
		}
		
		
		
		register.click_New_Pin();
		register.click_Pin1();
		register.click_Pin2();
		register.click_Okay();
		Thread.sleep(1000);
		register.click_Confirm_Pin();
		register.click_Pin1();
		register.click_Pin2();
		register.click_Okay();
		Thread.sleep(1000);	
		register.click_Process_Button();

    //   screenshot_class.ScreenShot(driver,"Pin Authentication Page");
       
       Thread.sleep(10000);
       
        register.click_New_Pin();
        register.click_Pin1();
        register.click_Pin2();
        register.click_Ok_Authentication();
		Thread.sleep(10000);
		

		
		 
		
		 try {
	            //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5)); 
	            WebElement popupCloseButton = driver.findElement(By.xpath("//div[@class='text-center depo-okbtn']")); 
	                    
	            popupCloseButton.click();
	            System.out.println("Popup closed successfully.");
	        } 	catch (TimeoutException e) {
	            System.out.println("Popup not displayed. Proceeding to the next step...");
	        } 	catch (NoSuchElementException e) {
	            System.out.println("Popup close button not found. Proceeding to the next step...");
	        }
		
		
		
		
		Transaction_pomclasses transaction= new Transaction_pomclasses(driver);
				transaction.depositbtn();
				Thread.sleep(2000);
		

			Registerpomclass register1 = new Registerpomclass(driver);
				register1.Click_phonenumber();
				register1.Click_Email1();
				register1.click_bank(); 
				Thread.sleep(3000);
				register1.enterbank("BCA");
				register1.Click_Accname1();
				register1.Click_Accno1();
				Thread.sleep(1000);
				register1.Click_InnerRegisterbtn();
				System.out.println("Submit button click Sucessfully");
				Thread.sleep(5000);
			
            
			
			System.out.println("Here start the sucess condition");
			String Expectedurl="https://wl2-test-user.dev-diamondteam.com/deposit";
            String ActualURL=driver.getCurrentUrl();
           
            if(Expectedurl.equalsIgnoreCase(ActualURL))
            {
            	System.out.println("From fill sucessfully");
            	screenshot_class.ScreenShot(driver, "Suscessfullyregister");
            	driver.close();
            }
//            else if(Expectedurl!=ActualURL)
//            {
//            	System.out.println("URL is Not match");
//            	driver.close();            }
//			
            else {
			
			WebElement errormessages = driver.findElement(By.xpath("//span[@class='text-danger error-msg']")); 
				System.out.println("Validation found");
			if(errormessages.isDisplayed()) 
	            {
	            	System.out.println("Validation Error Found: " + errormessages.getText());
	            	screenshot_class.ScreenShot(driver, "Bankvalidation");
	            	System.out.println("Validation Found");
	            	screenshot_class.ScreenShot(driver, "Validationerror");
	            	driver.close(); 
	    }
            }
	
				} 
					}
			
			

			
	

