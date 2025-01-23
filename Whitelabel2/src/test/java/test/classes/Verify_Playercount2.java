package test.classes;

import java.io.IOException;
import java.time.Duration;

import org.testng.annotations.Test;

import pom.classes.Adminbaseclass;
import pom.classes.LoginAdminpomclass;
import utility.ckasses.Scrolling_class;

public class Verify_Playercount2 extends Adminbaseclass {

	
	@Test
	public void playercount() throws InterruptedException, IOException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		LoginAdminpomclass count= new LoginAdminpomclass(driver);
		count.Admin_usern();
		count.Admin_pass();
		Thread.sleep(2000);
		count.Admin_login1();
		count.playerclick();
		count.playerlistclick();
		
		Thread.sleep(3000);
		Scrolling_class.scrollDown(driver);
		Thread.sleep(3000);
		count.selectdropdownclick();
		
		Thread.sleep(10000);
		Scrolling_class.scrollDown1(driver);
		Thread.sleep(3000);
	count.Navigateclick();
	Thread.sleep(5000);
		Scrolling_class.scrollDown1(driver);
		count.countclick();
		
	Thread.sleep(1000);
		driver.close();
	}
}
