package test.classes;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pom.classes.LightandDarkmodepomclass;
import pom.classes.Registerpomclass;
import pom.classes.Testbaseclass;

public class Verify_Allprovider  extends Testbaseclass{

	@Test
	public void allprovider() throws InterruptedException
	{
		Registerpomclass register= new Registerpomclass(driver);
		Thread.sleep(2000);
		register.languagebtn();
		Thread.sleep(1000);
		register.englishlangbtn();
		Thread.sleep(2500);
		
		
		LightandDarkmodepomclass provider= new LightandDarkmodepomclass(driver);
		provider.clickGameprovider();
		
		List<WebElement>Allprovider=driver.findElements(By.xpath("//div[@class='under-games']"));
		int providercount=Allprovider.size();
		Thread.sleep(5000);
		System.out.println("All provider count: "+ providercount);
		Thread.sleep(1000);
		
		int provideractualcount=58;
		
		if (providercount == provideractualcount) {
            System.out.println("No changes: No new providers added or disabled.");
            
        } 
		else if (providercount > provideractualcount) 
		{
            int addedCount = providercount - provideractualcount;
            System.out.println("New providers added count: " + addedCount);
        } 
		else
		{
            int disabledCount = provideractualcount - providercount;
            System.out.println("Providers disabled count: " + disabledCount);
        }
		driver.close();
		
		
	}
	
}
