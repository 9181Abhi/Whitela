package test.classes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pom.classes.Category_pomclass;
import pom.classes.Registerpomclass;
import pom.classes.Testbaseclass;
import utility.ckasses.screenshot_class;

public class Verify_Allgamecategory 	extends Testbaseclass
{

	
	@Test(enabled = false)
	public void Allgamecategory() throws InterruptedException
	{
		Category_pomclass category=new Category_pomclass(driver);
		Thread.sleep(1500);
		category.clickcategory();
		Thread.sleep(1500);
		
		List<WebElement>dropdownItems =driver.findElements(By.xpath("//div[@class='dropdown-content']"));
		List<String>categoryItems = new ArrayList<>();
		
		for (WebElement item : dropdownItems) {
	        categoryItems.add(item.getText().trim().replaceAll("\\s+", " "));
	    }
		
		Thread.sleep(1500);
		System.out.println("Categories Dropdown Items:");
	    for (String category1 : categoryItems) {
	        System.out.println(category1);
	        Thread.sleep(1500);
		
	        
	        String Allcategories="Slots Arcades Live Casino Sportsbook Card Games Togel Dingdong Crash Game Fishing"; 
	    	if(category1.equalsIgnoreCase(Allcategories))	
	    		{
	    			System.out.println("All Categories are shown and no more category Addded");
	    		}
	    	else
	    	{
	    		System.out.println("All Categories are not shown or New category Added");
	    	}
	    	Thread.sleep(1000);
	    	  
	    		  
	        
	}
	    
	    category.clickcategory();
	    driver.close();
}
	
	@Test(priority = 1)
	public void clickallcategorysearch() throws InterruptedException, IOException
	{
		
		Registerpomclass register=new Registerpomclass(driver);
		register.languagebtn();
		Thread.sleep(1000);
		register.englishlangbtn();
		Thread.sleep(2500);
		
		Category_pomclass category=new Category_pomclass(driver);
		Thread.sleep(1500);
		category.clickcategory();
		
		Thread.sleep(1000);
		category.clickslot();
		Thread.sleep(3000);
		
		category.clicksearchslot();
		Thread.sleep(4000);
		
		WebElement slotgame=driver.findElement(By.xpath("//div[@class='menu-items-hover']"));
		String slottitle=slotgame.getText().trim().replaceAll("\\s+", " ");
		Thread.sleep(2000);
		System.out.print(slottitle);
		Thread.sleep(2000);
		
		String slotgametitle="Sea Orchestra Saba Slot";
		String sloterrortile="No Game Found";
		
		if(slottitle.equalsIgnoreCase(slotgametitle))
		{
			System.out.println("--Slot Game is found");
			screenshot_class.ScreenShot(driver, "Slotgamefound");
		}
		else if(slottitle.equalsIgnoreCase(sloterrortile))
		{

			System.out.println("--Slot Game is Not found ");
			screenshot_class.ScreenShot(driver, "Slotgamenotfound");
			
		}
		
		
		
		
		
		category.clickgameclose();
		Thread.sleep(10000);
		category.clickcategory();
		Thread.sleep(2000);
		category.clickLivecasino();
		Thread.sleep(2000);
		category.clicksearlivecasino();
		Thread.sleep(4000);
		
		WebElement Livecasinogame=driver.findElement(By.xpath("//div[@class='menu-items-hover']"));
		String Livecasinoitle=Livecasinogame.getText().trim().replaceAll("\\s+", " ");
		Thread.sleep(2000);
		System.out.print(Livecasinoitle);
		Thread.sleep(3000);
		
		String Livecasinogametitle="SG Casino Saba";
		String Livecasinoerrortile="No Game Found";
		
		Thread.sleep(1000);
		if(Livecasinoitle.equalsIgnoreCase(Livecasinogametitle))
		{
			System.out.println("--Live-casino Game is found");
			screenshot_class.ScreenShot(driver, "Livegamefound");
		}
		else if(Livecasinoitle.equalsIgnoreCase(Livecasinoerrortile))
		{

			System.out.println("--Live-casino Game is Not found ");
			screenshot_class.ScreenShot(driver, "Livecasinogamenotfound");
		}
		
		
		
		category.clickgameclose();
		Thread.sleep(10000);
		category.clickcategory();
		Thread.sleep(2000);
		category.clickArcades();
		Thread.sleep(2000);
		category.clicksearcharcade();
		Thread.sleep(4000);
		
		WebElement arcadegame=driver.findElement(By.xpath("//div[@class='menu-items-hover']"));
		String arcadeititle=arcadegame.getText().trim().replaceAll("\\s+", " ");
		Thread.sleep(2000);
		System.out.print(arcadeititle);
		Thread.sleep(3000);
		
		String arcadegametitle="Fast Blackjack Saba Slot";
		String arcadeerrortile="No Game Found";
		
		Thread.sleep(1000);
		if(arcadeititle.equalsIgnoreCase(arcadegametitle))
		{
			System.out.println("--Arcade Game is found");
			screenshot_class.ScreenShot(driver, "Arcadegamefound");
		}
		else if(arcadeititle.equalsIgnoreCase(arcadeerrortile))
		{

			System.out.println("--Arcade Game is Not found ");
			screenshot_class.ScreenShot(driver, "Arcadegamenotfound");
			
		}
		
		
		category.clickgameclose();
		Thread.sleep(10000);
		category.clickcategory();
		Thread.sleep(2000);
		category.clicksportbooks();
		Thread.sleep(2000);
		category.clicksearchsportsbook();
		Thread.sleep(4000);
		
		WebElement sportsbookgame=driver.findElement(By.xpath("//div[@class='menu-items-hover']"));
		String sportbookititle=sportsbookgame.getText().trim().replaceAll("\\s+", " ");
		Thread.sleep(2000);
		System.out.print(sportbookititle);
		Thread.sleep(3000);
		
		String sportbookgametitle="Mixed Martial Arts Sbobet Sportsbook";
		String sportbookerrortile="No Game Found";
		
		Thread.sleep(1000);
		if(sportbookititle.equalsIgnoreCase(sportbookgametitle))
		{
			System.out.println("--Sportbook Game is found");
			screenshot_class.ScreenShot(driver, "Sportbookgamefound");
		}
		else if(sportbookititle.equalsIgnoreCase(sportbookerrortile))
		{

			System.out.println("--Sportbook Game is Not found ");
			screenshot_class.ScreenShot(driver, "Sportbookgamenotfound");
			
		}
		
		
		
		
		category.clickgameclose();		
		Thread.sleep(10000);
		category.clickcategory();
		Thread.sleep(2000);
		category.clickcardgames();
		Thread.sleep(2000);
		category.clicksearchcardgame();
		Thread.sleep(4000);
		
		WebElement cardgame=driver.findElement(By.xpath("//div[@class='menu-items-hover']"));
		String cardgameititle=cardgame.getText().trim().replaceAll("\\s+", " ");
		Thread.sleep(2000);
		System.out.print(cardgameititle);
		Thread.sleep(3000);
		
		String carddgametitle="Three Kings HKB Gaming";
		String carddgameerrortile="No Game Found";
		
		Thread.sleep(1000);
		if(cardgameititle.equalsIgnoreCase(carddgametitle))
		{
			System.out.println("--Card Game is found");
			screenshot_class.ScreenShot(driver, "Cardgame gamefound");
		}
		else if(cardgameititle.equalsIgnoreCase(carddgameerrortile))
		{

			System.out.println("--Card Game is Not found ");
			screenshot_class.ScreenShot(driver, "Cardgame gamenotfound");
			
		}
		
		
		
		
		
		
		category.clickgameclose();
		Thread.sleep(10000);
		category.clickcategory();
		Thread.sleep(2000);
		category.clickcrashgame();
		Thread.sleep(2000);
		category.clicksearchcrashgame();
		Thread.sleep(4000);
		
		WebElement Crashgame=driver.findElement(By.xpath("//div[@class='menu-items-hover']"));
		String Crastitle=Crashgame.getText().trim().replaceAll("\\s+", " ");
		Thread.sleep(2000);
		System.out.print(Crastitle);
		Thread.sleep(3000);
		
		String Crashgametitle="Electric Crash PopOK Gaming";
		String Crashgameerrortile="No Game Found";
		
		Thread.sleep(1000);
		if(Crastitle.equalsIgnoreCase(Crashgametitle))
		{
			System.out.println("--Crash Game is found");
			screenshot_class.ScreenShot(driver, "Crashgame gamefound");
		}
		else if(Crastitle.equalsIgnoreCase(Crashgameerrortile))
		{

			System.out.println("--Crash Game is Not found ");
			screenshot_class.ScreenShot(driver, "Crashgame gamenotfound");
			
		}
		
		
		
		category.clickgameclose();	
		Thread.sleep(10000);
		category.clickcategory();
		Thread.sleep(2000);
		category.clicklootery();
		Thread.sleep(2000);
		category.clicksearchlotterygame();
		Thread.sleep(4000);
		
		WebElement Lotterygame=driver.findElement(By.xpath("//div[@class='menu-items-hover']"));
		String Lotteryititle=Lotterygame.getText().trim().replaceAll("\\s+", " ");
		Thread.sleep(2000);
		System.out.print(Lotteryititle);
		Thread.sleep(3000);
		
		String Lotterygametitle="Sydney HKB Gaming";
		String Lotterygameerrortile="No Game Found";
		
		Thread.sleep(1000);
		if(Lotteryititle.equalsIgnoreCase(Lotterygametitle))
		{
			System.out.println("--Lottery Game is found");
			screenshot_class.ScreenShot(driver, "Lotterygamefound");
		}
		else if(Lotteryititle.equalsIgnoreCase(Lotterygameerrortile))
		{

			System.out.println("--Lottery Game is Not found ");
			screenshot_class.ScreenShot(driver, "Lotterygamenotfound");
			
		}
		
		
		
		

		category.clickgameclose();	
		Thread.sleep(10000);
		category.clickcategory();
		Thread.sleep(2000);
		category.clickFishing();
		Thread.sleep(2000);
		category.clicksearchFishinggame();
		Thread.sleep(4000);
		
		WebElement Fishinggame=driver.findElement(By.xpath("//div[@class='menu-items-hover']"));
		String Fishingititle=Fishinggame.getText().trim().replaceAll("\\s+", " ");
		Thread.sleep(2000);
		System.out.print(Fishingititle);
		Thread.sleep(3000);
		
		String Fishinggametitle="Fish Hunter Haiba Joker Gaming";

		String Fishinggameerrortile="No Game Found";
		
		Thread.sleep(1000);
		if(Fishingititle.equalsIgnoreCase(Fishinggametitle))
		{
			System.out.println("--Fishing Game is found");
			screenshot_class.ScreenShot(driver, "Fishinggamefound");
		}
		else if(Fishingititle.equalsIgnoreCase(Fishinggameerrortile))
		{

			System.out.println("--Fishing Game is Not found ");
			screenshot_class.ScreenShot(driver, "Fishinggamenotfound");
			
		}
		
		

		
		
		//category.clickgameclose();	
		Thread.sleep(10000);
		category.clickcategory();
		Thread.sleep(2000);
		category.clickDingdong();
		Thread.sleep(3000);
		category.clicksearchDingdonggame();
		Thread.sleep(6000);
		
		WebElement Dingonggame=driver.findElement(By.xpath("//div[@class='menu-items-hover']"));
		String Dingdongititle=Dingonggame.getText().trim().replaceAll("\\s+", " ");
		Thread.sleep(2000);
		System.out.print(Dingdongititle);
		Thread.sleep(3000);
		
		String Dingdonggametitle="Dingdong 48D HKB Gaming"; 
		String Dingdonggameerrortile="No Game Found";
		
		Thread.sleep(1000);
		if(Dingdongititle.equalsIgnoreCase(Dingdonggametitle))
		{
			System.out.println("--Dingdong Game is found");
			screenshot_class.ScreenShot(driver, "Dingdonggamefound");
		}
		else if(Dingdongititle.equalsIgnoreCase(Dingdonggameerrortile))
		{

			System.out.println("--Dingdong Game is Not found ");
			screenshot_class.ScreenShot(driver, "Dingdonggamenotfound");
			
		}

		
		driver.close();
		
		
	}
	
	
	
	
	
}
