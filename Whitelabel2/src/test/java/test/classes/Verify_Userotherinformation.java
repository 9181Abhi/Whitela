package test.classes;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pom.classes.Loginpomclass;
import pom.classes.Registerpomclass;
import pom.classes.Testbaseclass;
import pom.classes.Transaction_pomclasses;
import utility.ckasses.screenshot_class;

public class Verify_Userotherinformation extends Testbaseclass{
	
	@Test
	public void userotherinfomation() throws IOException
	{
		Loginpomclass login =new Loginpomclass(driver);
		login.closepopup();
		
		Transaction_pomclasses transaction= new Transaction_pomclasses(driver);
		transaction.depositbtn();
		
		WebElement registerinfo=driver.findElement(By.xpath("//h3[@class='title '] "));
		String Expectedresult=registerinfo.getText();
		String actualresult="Registration Account Bank";
		
		if(Expectedresult==actualresult)
		{
			screenshot_class.ScreenShot(driver, "registerbankdetail");
			
		}
		
		
		
		//Registerpomclass register = new Registerpomclass(driver);
		
	}

}
