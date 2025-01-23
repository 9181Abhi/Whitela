package test.classes;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pom.classes.Loginpomclass;
import pom.classes.Logout_Pomclass;
import pom.classes.Registerpomclass;
import pom.classes.Testbaseclass;
import utility.ckasses.screenshot_class;

public class Verify_Logoutfunctionailty extends Testbaseclass{
	
	
	@Test
	public void logoutfunctionailty() throws InterruptedException, IOException
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
		Thread.sleep(5000);
		System.out.println("Login sucessfully");
		
		Logout_Pomclass logout=new Logout_Pomclass(driver);
		
		logout.clickprofile();
		Thread.sleep(1000);
		logout.clickLogout();
		Thread.sleep(2000);
		
		String Actualtitle=driver.getTitle();
		String ExpectedTitle="Home title";
		
		
		Assert.assertEquals(Actualtitle, ExpectedTitle, "Logout not sucessfully");
		System.out.println("Logout sucessfully");
		screenshot_class.ScreenShot(driver, "Logoutsucessfully");
		
		Thread.sleep(2000);
		driver.close();
		
		
		
	}

}
