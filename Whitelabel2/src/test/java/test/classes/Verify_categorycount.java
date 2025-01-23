package test.classes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pom.classes.Categorycount_Pomclass;
import pom.classes.Registerpomclass;
import pom.classes.Testbaseclass;

public class Verify_categorycount extends Testbaseclass
{

	@Test
	public void category() throws InterruptedException
	{
		Registerpomclass register = new Registerpomclass(driver);
		register.languagebtn();
		Thread.sleep(2000);
		register.englishlangbtn();
		Thread.sleep(2000);
		
		
		
		WebElement countarcade=driver.findElement(By.xpath("//p[@class='gc-sub-title text-categories_game_count']"));
		String arcadecount=countarcade.getText();
		
		System.out.println("print");
		System.out.println(arcadecount);
		
		Thread.sleep(3000);
		 
		
		String arcadetotal="ARcade 392";
		
		
		if(arcadecount==arcadetotal)
		{
			System.out.println("No any game disable for arcade category");
		}
		else 
		{
			System.out.println("some games are disable!");
		}
			
		
			
		driver.close();
		
	
		
		
	}
	
}
