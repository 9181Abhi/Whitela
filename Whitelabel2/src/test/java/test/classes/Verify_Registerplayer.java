package test.classes;

import java.io.IOException;

import org.testng.annotations.Test;

import pom.classes.Registerpomclass;
import pom.classes.Testbaseclass;
import utility.ckasses.screenshot_class;

public class Verify_Registerplayer extends Testbaseclass {
	
	@Test
	public void registerplayer() throws InterruptedException, IOException
	{
		Registerpomclass Register= new Registerpomclass(driver);
		Register.registerbtn();
		Thread.sleep(1000);
		Register.user1();
		Thread.sleep(1000);
		Register.pass1();
		Thread.sleep(1000);
		Register.confirmpass1();
		Thread.sleep(1000);
//		Register.phno1();
//		Thread.sleep(1000);
//		Register.Email1();
//		Thread.sleep(1000);
//		Register.click_bank();
//		Thread.sleep(5000);
//		Register.enterbank("BCA");
//		System.out.println("Dropdown click sucessfully");
//		Register.Accname1();	
//		Thread.sleep(5000);
//		Register.Accno1();
//		Thread.sleep(2000);
//		Register.InnerRegisterbtn();
		Thread.sleep(10000);
		
		screenshot_class.ScreenShot(driver, "Player register sucessfully");
		driver.close();
		
	}
		
		
		
	
	

}
