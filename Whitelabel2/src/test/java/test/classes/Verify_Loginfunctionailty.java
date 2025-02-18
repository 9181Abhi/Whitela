package test.classes;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pom.classes.Loginpomclass;
import pom.classes.Registerpomclass;
import pom.classes.Testbaseclass;
import utility.ckasses.screenshot_class;

public class Verify_Loginfunctionailty extends Testbaseclass{
	@Test
	public void loginfunctionality() throws InterruptedException, IOException
	{
		
		Registerpomclass register = new Registerpomclass(driver);
		register.languagebtn();
		register.englishlangbtn();
		Thread.sleep(2000);
		
		Loginpomclass login= new Loginpomclass(driver);
		login.loginbtnclick();
		Thread.sleep(1000);
		login.username1();
		Thread.sleep(1000);
		login.password1();
		Thread.sleep(1000);
		login.Innerloginbtn1();
		Thread.sleep(4000);
		
	
		
		Registerpomclass register1 = new Registerpomclass(driver);
		register1.click_New_Pin();
		register1.click_Pin1();
		register1.click_Pin2();
		register1.click_Okay();
		Thread.sleep(10000);
		
		
		

		
		String actualtitle=driver.getTitle();
	
		
		String expectedtitle="Home title";

	Assert.assertEquals(expectedtitle, actualtitle, "Login not Sucessfully");
		 System.out.println("Login Sucessfully");
		 screenshot_class.ScreenShot(driver, "User app login sucessfully");
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			// Wait for popup for a short time
			Thread.sleep(2000); // Optional: Allow time for popup to appear

			while (true) {
			    List<WebElement> popupCloseButtons = driver.findElements(By.xpath("//div[@class='popup-box']//span[@class='close']//*[name()='svg']//*[name()='path' and contains(@fill,'none')]"));

			    if (!popupCloseButtons.isEmpty() && popupCloseButtons.get(0).isDisplayed()) {  
			        WebElement popupCloseButton = popupCloseButtons.get(0);
			        popupCloseButton.click();
			        System.out.println("Popup closed.");
			        Thread.sleep(1000); // Wait for the next popup to appear if any
			    } else {  
			        System.out.println("No more popups found. Proceeding to the next step...");
			        break; // Exit the loop when no popup is found
			    }
			}
			
		Thread.sleep(10000);
			
		driver.close();
		
		
	}

}
