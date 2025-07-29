package test.classes;

import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pom.classes.Login_userpomclass;
import pom.classes.Registerpomclass;
import pom.classes.Testbaseclass;
import pom.classes.referaallink;

public class Verify_Refferallink extends Testbaseclass
{

	@Test
	public void referallinkmenthod() throws InterruptedException, HeadlessException, UnsupportedFlavorException, IOException
	{
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		Registerpomclass register= new Registerpomclass(driver);
		register.languagebtn();
		Thread.sleep(2000);
		register.englishlangbtn();
		
		Login_userpomclass login= new Login_userpomclass(driver);
		
		login.login_btn();
		login.inputusername();
		login.inputpassword();
		login.internalloginbtn();
		Thread.sleep(2000);
		
		Registerpomclass pin= new Registerpomclass(driver);
		Thread.sleep(1000);
		pin.click_New_Pin();
		pin.click_Pin1();
		pin.click_Pin2();
		pin.click_Okay();
		Thread.sleep(5000);
		
		 try {
	         
	            WebElement popupCloseButton = driver.findElement(By.xpath("(//span[@class='close'])[2]")); 
	                    
	            popupCloseButton.click();
	            
	        } 	catch (TimeoutException e) {
	            System.out.println("Popup not displayed. Proceeding to the next step...");
	        } 	catch (NoSuchElementException e) {
	            System.out.println("Popup close button not found. Proceeding to the next step...");
	        }
		
		referaallink referral=new referaallink(driver);
		referral.click_referral();
		referral.click_inforeferral();
		referral.click_copylink();
		 Thread.sleep(5000);
		 String copiedLink = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
		 
		 System.out.println(copiedLink);
		 
		 
		 Thread.sleep(5000);
		referral.click_closepopup();
		((JavascriptExecutor) driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1)); 
        driver.get(copiedLink); 
        System.out.println("Navigated to referral link in new tab.");
        Thread.sleep(10000);
		
			
		
	}
	
			
	
	
	
}
