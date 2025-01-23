package test.classes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pom.classes.Languagechange_pomclass;
import pom.classes.Registerpomclass;
import pom.classes.Testbaseclass;
import utility.ckasses.Scrolling_class;
import utility.ckasses.screenshot_class;

public class Verify_Languagechange extends Testbaseclass{
	
	@Test
	public void languagechange() throws InterruptedException, IOException
	{
		
		List<WebElement>Indomenuitems =driver.findElements(By.xpath("//div[@class='menu-dropdown']"));
		List<String>IndoheadermenuItems = new ArrayList<>();
		
		for (WebElement item : Indomenuitems)
		{
			IndoheadermenuItems.add(item.getText().trim());
	    }
		
		Thread.sleep(1500);
		System.out.println("Indonesia Header Items:");
		
	    for (String Header : IndoheadermenuItems)
	    {
	        System.out.println(Header);
	        Thread.sleep(1500);
	    }
	    
	  //  screenshot_class.ScreenShot(driver, "Indonessianlanguageheaders");
	    Thread.sleep(5000);
	    Registerpomclass register= new Registerpomclass(driver);
	    register.languagebtn();
	    register.englishlangbtn();
	    
	    Thread.sleep(5000);
	    
	    
	    List<WebElement>englishmenuitems =driver.findElements(By.xpath("//div[@class='menu-dropdown']"));
		List<String>englishheadermenuItems = new ArrayList<>();
		
		for (WebElement item : englishmenuitems)
		{
			englishheadermenuItems.add(item.getText().trim());
	    }
		
		Thread.sleep(1500);
		System.out.println();
		System.out.println();
		System.out.println("English Header Items:");
	    for (String Header : englishheadermenuItems)
	    {
	        System.out.println(Header);
	        Thread.sleep(1500);
	    }
	    
	   // screenshot_class.ScreenShot(driver, "Englishlanguageheaders");
	    Thread.sleep(5000);
	    
	   
	    System.out.println("Comparing english and Indonessian language");
	    	
	    if(IndoheadermenuItems==englishheadermenuItems)
	    {
	    	for(int i=0; i<IndoheadermenuItems.size();i++)
	    	{
	    		System.out.println("Indonessian"+ IndoheadermenuItems.get(i) + "| Engish" + englishheadermenuItems.get(i));
	    	}
	    }
	    else
	    {
	    	System.out.println("The number of indonessian headers and english header are not match");
	    	System.out.println();
	    }	
	   
	    
	    
	    Scrolling_class.scrollDown(driver);
	    Thread.sleep(2500);
	    
	    List<WebElement>Englishfootermenuitems =driver.findElements(By.xpath("(//div[@class='content'])[2]"));
		List<String>EnglishfooterItems = new ArrayList<>();
		
		for (WebElement item : Englishfootermenuitems)
		{
			EnglishfooterItems.add(item.getText().trim());
	    }
		
		Thread.sleep(1500);
		System.out.println();
		System.out.println();
		System.out.println("English Footer Items:");
		
	    for (String Header : EnglishfooterItems)
	    {
	        System.out.println(Header);
	        Thread.sleep(1500);
	    }
	   
	   // screenshot_class.ScreenShot(driver, "EnglishlanguageFooter");
	    
	    register.languagebtn();
	    Thread.sleep(1000);
	    register.Indolangbtn();
	    Thread.sleep(1500);
	    
	    
	    List<WebElement>Indofootermenuitems =driver.findElements(By.xpath("(//div[@class='content'])[2]"));
		List<String>IndofooterItems = new ArrayList<>();
		
		for (WebElement item : Indofootermenuitems)
		{
			IndofooterItems.add(item.getText().trim());
	    }
		
		Thread.sleep(1500);
		System.out.println();
		System.out.println();
		System.out.println("Indonesia Footer Items:");
		
	    for (String Header : IndofooterItems)
	    {
	        System.out.println(Header);
	        Thread.sleep(1500);
	    }
	   // screenshot_class.ScreenShot(driver, "Indonessianlanguageheaders");
	    Thread.sleep(2000);
	    driver.close();
		
	}

}
