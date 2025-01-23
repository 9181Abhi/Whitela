package test.classes;

import java.io.IOException;
import java.time.Duration;


import org.testng.annotations.Test;

import pom.classes.Login_userpomclass;
import pom.classes.Registerpomclass;
import pom.classes.Testbaseclass;
import utility.ckasses.screenshot_class;

public class Login_user extends Testbaseclass 
{
	
	@Test
	public void login() throws InterruptedException, IOException
	{
		
		Registerpomclass register = new Registerpomclass(driver);
		register.languagebtn();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		Login_userpomclass user= new Login_userpomclass(driver);
		
		user.login_btn();
		user.inputusername();
		user.inputpassword();
		user.internalloginbtn();
		screenshot_class.ScreenShot(driver, "UserLogin");
		Thread.sleep(3000);
		driver.close();
		
		
		
		
	}

}
