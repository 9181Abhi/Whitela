package test.classes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import pom.classes.Category_pomclass;
import pom.classes.Categorycount_Pomclass;
import pom.classes.Registerpomclass;
import pom.classes.Testbaseclass;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;


import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;
public class Verify_categorycount extends Testbaseclass
{

	@Test
	public void category() throws InterruptedException, IOException
	{
		Registerpomclass register = new Registerpomclass(driver);
		register.languagebtn();
		Thread.sleep(2000);
		register.englishlangbtn();
		Thread.sleep(4000);
	
		
		Category_pomclass category= new  Category_pomclass(driver);
		category.clickcategory();
		Thread.sleep(1000);
		category.clickslot();
		Thread.sleep(1000);
		int slotcount=AllCategory_Count.getCategoryTotalGames("slots");
		int allslotgames=6809;
		
		if(slotcount == allslotgames)
		{
			System.out.println("no any  games are disable  for slot category");
		}
		
		else if(allslotgames> slotcount)
		{
			int disableslotcount=allslotgames -slotcount ;
			System.out.println(disableslotcount+"- Games are disable for slot category");
			System.out.println();
		}
		Thread.sleep(1000);
		
	
		
		category.clickcategory();
		Thread.sleep(1000);
		category.clickArcades();
		Thread.sleep(1000);
		int arcadecount =AllCategory_Count.getCategoryTotalGames("arcades");
		int allarcadegames=388;
		
		if(arcadecount == allarcadegames)
		{
			System.out.println("no any games are disable for arcade category");
		}
		
		else if(allarcadegames>arcadecount)
		{
			int disablearcadecount=allarcadegames - arcadecount;
			System.out.println(disablearcadecount+"- Games are disable for arcade category");
			System.out.println();
		}
		
		
		Thread.sleep(1000);
		
		
		category.clickcategory();
		Thread.sleep(1000);
		category.clickLivecasino();
		Thread.sleep(1000);
		int livecasinocount=AllCategory_Count.getCategoryTotalGames("live-casino");
		int alllivecasinogames=673;
		
		if(livecasinocount==alllivecasinogames)
		{
			System.out.println("no any games are disable for Live casino category ");
		}
		
		else if(alllivecasinogames > livecasinocount)
		{
			int disbablelivecasinocount=alllivecasinogames - livecasinocount;
			System.out.println(disbablelivecasinocount+"- Games are disble for Live casino category");
			System.out.println();
		}
		Thread.sleep(1000);
		
		
		
		category.clickcategory();
		Thread.sleep(1000);
		category.clicksportbooks();
		Thread.sleep(1000);
		int sportbookcount=AllCategory_Count.getCategoryTotalGames("sportsbook");
		int allsportbookgames=351;
		
		if(sportbookcount==allsportbookgames)
		{
			System.out.println("no any games are disable for sportbook category");
		}
		
		else if(allsportbookgames > sportbookcount)
		{
			int disablesportsbook=allsportbookgames- sportbookcount;
			System.out.println(disablesportsbook+"- Games are disble for sportbook category ");
			System.out.println();
		}
		Thread.sleep(1000);
		
		
		category.clickcategory();
		Thread.sleep(1000);
		category.clickcrashgame();
		Thread.sleep(1000);
		int crashgamecount=AllCategory_Count.getCategoryTotalGames("crash-game");
		int allcrashgamecount=62;
		
		if(crashgamecount==allcrashgamecount)
		{
			System.out.println("no any games are disable for Crash game category");
		}
		
		else if(allcrashgamecount > crashgamecount)
		{
			int disablcrashgame=allcrashgamecount-crashgamecount;
			System.out.println(disablcrashgame+"- Games are disble for Crash game category");
		}
		Thread.sleep(1000);
		
		
		category.clickcategory();
		Thread.sleep(1000);
		category.clicklootery();
		Thread.sleep(1000);
		int lotterycount=AllCategory_Count.getCategoryTotalGames("lottery");
		int alllotterycount=19;
		
		if(lotterycount==alllotterycount)
		{
			System.out.println("no any games are disable for lottery category");
		}
		
		else if(alllotterycount>lotterycount)
		{
			int disablelottery=alllotterycount-lotterycount;
			System.out.println(disablelottery+"-Games are disble for lottery category");
			System.out.println();
		}
		Thread.sleep(1000);
		
		
		category.clickcategory();
		Thread.sleep(1000);
		category.clickcardgames();
		Thread.sleep(1000);
		int cardgamecount=AllCategory_Count.getCategoryTotalGames("card-games");
		int allcardgamecount=46;
		
		if(cardgamecount==allcardgamecount)
		{
			System.out.println("no any games are disable for Card game category");
		}
		
		else if(allcardgamecount>cardgamecount)
		{
			int disblecardgame=allcardgamecount-cardgamecount;
			System.out.println(disblecardgame+"-Games are disble for card game category");
			System.out.println();
		}
		Thread.sleep(1000);
		
		
		category.clickcategory();
		Thread.sleep(1000);
		category.clickArcades();
		Thread.sleep(1000);
		int dingdongcount=AllCategory_Count.getCategoryTotalGames("dingdong");
		int alldingdonggamecount=15;
		
		if(dingdongcount==alldingdonggamecount)
		{
			System.out.println("no any games are disable for Dingdong category");
		}
		
		else if(alldingdonggamecount>dingdongcount)
		{
			int disbledingdong=alldingdonggamecount-dingdongcount;
			System.out.println(disbledingdong+"-Games are disble for Dingdong category");
			System.out.println();
		}
		Thread.sleep(1000);
		
		
		category.clickcategory();
		Thread.sleep(1000);
		category.clickFishing();
		Thread.sleep(1000);
		int fishingcount=AllCategory_Count.getCategoryTotalGames("fishing");
		int allfishingcount=79;
		
		if(fishingcount==allfishingcount)
		{
			System.out.println("no any games are disable for Fishing category");
		}
		
		else if(allfishingcount>fishingcount)
		{
			int disblefishing=allfishingcount-fishingcount;
			System.out.println(disblefishing+"-Games are disble for Fishing category");
			System.out.println();
		}
		Thread.sleep(1000);
		
		
		driver.close();		
	

	
	
}

}

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
