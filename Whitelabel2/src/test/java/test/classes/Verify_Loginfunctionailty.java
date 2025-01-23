package test.classes;

import java.io.IOException;

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
		Thread.sleep(3000);
		
		Thread.sleep(2000);
		
		Registerpomclass register1 = new Registerpomclass(driver);
		register1.click_New_Pin();
		register1.click_Pin1();
		register1.click_Pin2();
		register1.click_Ok_Authentication();
		Thread.sleep(10000);
		
		
		

		
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		
		String expectedtitle="Home title";

	Assert.assertEquals(expectedtitle, actualtitle, "Login not Sucessfully");
		 System.out.println("Login Sucessfully");
		 screenshot_class.ScreenShot(driver, "User app login sucessfully");
			
		driver.close();
		
		
	}

}
