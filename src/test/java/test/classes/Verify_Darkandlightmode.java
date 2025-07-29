package test.classes;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


import pom.classes.LightandDarkmodepomclass;
import pom.classes.Registerpomclass;
import pom.classes.Testbaseclass;
import utility.ckasses.screenshot_class;

public class Verify_Darkandlightmode extends Testbaseclass {
	
	
	@Test()
	public void darklightmodeprovider() throws InterruptedException, IOException
	{
		
		Registerpomclass register=new Registerpomclass(driver);	
		 Thread.sleep(1000);
		register.languagebtn();
		 Thread.sleep(1000);
		register.englishlangbtn();
		
		
		
		LightandDarkmodepomclass mode=new LightandDarkmodepomclass(driver);
		mode.clickGameprovider();
		Thread.sleep(2000);
		
			
		
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		 WebElement Dark= driver.findElement(By.cssSelector(".img-fluid[loading='lazy'][src='https://s3-uat.api-hkbgaming88.com/WLS/UserAppMedia/67addf90651c6.webp']"));
		 Thread.sleep(1500);
 
		 String dark=Dark.getCssValue("Darkmode");
		 System.out.println(dark);
		 Thread.sleep(2500);
		 
		 WebElement toggle=driver.findElement(By.xpath("//div[@id='text-m']//*[name()='svg']"));
		 toggle.click();
		 Thread.sleep(2500);  
		 
		 WebElement Light=driver.findElement(By.xpath("//a[@href='/habanero']//div[@class='item']//img[@class='img-fluid']"));
		 String light=Light.getCssValue("Lightmode");
		 
		
		 
		 
		 if(dark.equals(light))	
		 {
			 System.out.println("Theme change sucessfully");
		 }
		 else
		 {
			 System.out.println("Theme not change sucessfully");
		 }	 
		 screenshot_class.ScreenShot(driver, "ThemeChnage");
		 Thread.sleep(2500);
		
			
	}
			
			

}
	
	
	
	
		
		
	

	


