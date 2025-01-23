package test.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pom.classes.LightandDarkmodepomclass;
import pom.classes.Registerpomclass;
import pom.classes.Testbaseclass;
import utility.ckasses.Scrolling_class;
import utility.ckasses.screenshot_class;

public class Verify_Darkandlightmode extends Testbaseclass {
	
	
	@Test(priority=0)
	public void darklightmodeprovider() throws InterruptedException
	{
		
		Registerpomclass register=new Registerpomclass(driver);
		 Thread.sleep(1000);
		register.languagebtn();
		 Thread.sleep(1000);
		register.englishlangbtn();
		
		
		try {
		LightandDarkmodepomclass mode=new LightandDarkmodepomclass(driver);
		mode.clickGameprovider();
		Thread.sleep(2000);
		
		
		 WebElement Dark= driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)"));
		 Thread.sleep(1500);
		 
		 System.out.println("Get on dark mode game icon");
		 String dark=Dark.getCssValue("Darkmode");
		 System.out.println(dark);
		 Thread.sleep(2500);
		 
		 WebElement toggle=driver.findElement(By.xpath("//div[@id='text-m']//*[name()='svg']"));
		 toggle.click();
		 Thread.sleep(2500);  
		 
		 WebElement Light=driver.findElement(By.cssSelector("img[alt='Nextspin']"));
		 System.out.println("Get on light mode game icon");
		 String light=Light.getCssValue("Lightmode");
		 System.out.println(light);
		 Thread.sleep(2500);
		 
		 
		 if(dark.equals(light))
		 {
			 System.out.println("Theme change sucessfully");
		 }
		 else
		 {
			 System.out.println("Theme not change sucessfully");
		 }	 
		
		 Thread.sleep(2000);

		 
		 
		 

		}
		catch(Exception e) {
            e.printStackTrace();
			
		}
            finally 
            {
            	driver.close();
			
		}
		
        

}
	
	
	@Test(priority=1)
	public void darklightjackpot() throws InterruptedException
	{
		
		
		try {
			
		
		Scrolling_class.scrollDown(driver);
		WebElement jackpotdark =driver.findElement(By.cssSelector("img[alt='vghvg']"));
		String darkjackpot=	jackpotdark.getCssValue("Darkmodejackpot");
		System.out.println(darkjackpot);
		Thread.sleep(2000);
		
		
		WebElement toggle=driver.findElement(By.xpath("//div[@id='text-m']//*[name()='svg']"));
		toggle.click();
		Thread.sleep(2500);
		
		WebElement jackpotlight =driver.findElement(By.cssSelector("img[alt='2']"));
		String lightjackpot=	jackpotlight.getCssValue("lightmodejackpot");
		System.out.println(lightjackpot);
		Thread.sleep(2000);
		
		 if(darkjackpot.equals(lightjackpot))
		 {
			 System.out.println("jackpot Theme change sucessfully");
		 }
		 else
		 {
			 System.out.println("jackpotTheme not change sucessfully");
		 }	 
		
		 Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		finally
		{
			driver.close();
		}
		
		
		
		
		
		
	}
	
	
	
}
