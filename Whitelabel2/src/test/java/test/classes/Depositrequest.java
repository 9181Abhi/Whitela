package test.classes;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pom.classes.Login_userpomclass;
import pom.classes.Testbaseclass;
import pom.classes.Transaction_pomclasses;
import utility.ckasses.screenshot_class;

public class Depositrequest extends Testbaseclass{

	@Test
	public void depositrequest() throws InterruptedException, IOException
	{
		Login_userpomclass login= new Login_userpomclass(driver);
		login.login_btn();
		login.inputusername();
		login.inputpassword();
		login.internalloginbtn();
		Thread.sleep(3000);
		
		
		Transaction_pomclasses deposit= new Transaction_pomclasses(driver);
		deposit.depositbtn();
		deposit.depositamountinput();
		deposit.remarkinput();
		deposit.processbtn();
		Thread.sleep(25000);
		deposit.processbtn();
		
		
		
		
		
		WebElement depaccepttext=driver.findElement(By.xpath("//h3[text()='We Have Received Your Deposit Request']"));
		String text=depaccepttext.getText();
		
		if(text.equals("We Have Received Your Deposit Request:"))
		{
			System.out.println("Deposit request place sucessfully");
			Thread.sleep(2000);
			driver.close();
		}
		else
		{
			System.out.println("Deposit request not place sucessfully");
		}
		
	       screenshot_class.ScreenShot(driver, "Deposit Request");
		
		
	
		
		
	}
}
