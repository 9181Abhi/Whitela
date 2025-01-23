package test.classes;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pom.classes.Allpages_Pomclass;
import pom.classes.Loginpomclass;
import pom.classes.Registerpomclass;
import pom.classes.Testbaseclass;
import pom.classes.searchgame_pomclass;
import utility.ckasses.Scrolling_class;
import utility.ckasses.screenshot_class;


public class Verify_gamesearch extends Testbaseclass{

	@Test(priority=0)
	public void beforelogingamesearch() throws IOException, InterruptedException
	{
		Scrolling_class.scrollDown1(driver);
	
		Thread.sleep(2000);
		searchgame_pomclass searchgame=new searchgame_pomclass(driver);
		searchgame.clicksearchgame();
		
		Thread.sleep(1000);
		
		
		try {
			
			
		    WebElement serachgame1 = driver.findElement(By.xpath("//div[@class='findgames games']"));

		    String title = serachgame1.getText().trim().replaceAll("\\s+", " ");
		   
		    String ActualTitle = "Meow Janken Habanero";
		    String ExpectedTitle = title;

		    if (ActualTitle.equals(ExpectedTitle)) {
		        System.out.println("Game is found in home beforelogin");
		        screenshot_class.ScreenShot(driver, "Homepagegamefoundbeforelogin");
				
		    }
		    else {
		        System.out.println("Game is not found");
		    }
		   
		       

		} 
		catch (NoSuchElementException e) {
			Thread.sleep(1000);
		    System.out.println("Game is not found found");
		    //driver.close();
		}
		 catch (Exception e) {
			    System.out.println("An unexpected error occurred: " + e.getMessage());
			}
		
		
		
	}	
	
	
	
	
	@Test(priority=1)
	public void beforelogin() throws InterruptedException, IOException
	{
		
		Allpages_Pomclass allgame=new Allpages_Pomclass(driver);
		allgame.clickallgames();
		Thread.sleep(2000);
	
		searchgame_pomclass searchgame1=new searchgame_pomclass(driver);
		searchgame1.clicksearchgame();
		
		Thread.sleep(5000);

		try {
			
			
		    WebElement serachgame1 = driver.findElement(By.xpath("(//div[@class='container'])[4]"));

		    String title = serachgame1.getText().trim().replaceAll("\\s+", " ");
		    
		    
		    String ActualTitle = "Meow Janken Habanero";
		    String ExpectedTitle = title;
		    

		    if (ActualTitle.equals(ExpectedTitle)) {
		        System.out.println("Game is found in All games beforlogin");
		        screenshot_class.ScreenShot(driver, "Allgamegamefoundbeforelogin");
		    } else {
		        System.out.println("Game is not foallgamessearchund");
		       
		    }
		   
		       

		} 
		catch (NoSuchElementException e) {
			Thread.sleep(1000);
		    System.out.println("Game is not found found");
		    driver.close();
		}
		 catch (Exception e) {
			    System.out.println("An unexpected error occurred: " + e.getMessage());
			    
			}
		
		
	}
		
		
		  @ Test(priority=2)
		  public void afterloginhomepage() throws InterruptedException, IOException
		  {
			  
			  Registerpomclass register = new Registerpomclass(driver);
				register.languagebtn();
				register.englishlangbtn();
				Thread.sleep(2000);
				
				Loginpomclass login= new Loginpomclass(driver);
				login.loginbtnclick();
				Thread.sleep(1000);
				login.username1();
				Thread.sleep(1000);
				login.password1();
				Thread.sleep(1000);
				login.Innerloginbtn1();
				Thread.sleep(3000);
				
				Thread.sleep(2000);
				
				Registerpomclass register1 = new Registerpomclass(driver);
				register1.click_New_Pin();
				register1.click_Pin1();
				register1.click_Pin2();
				register1.click_Ok_Authentication();
				Thread.sleep(10000);
				
				Scrolling_class.scrollDown(driver);
				searchgame_pomclass searchgame=new searchgame_pomclass(driver);
				searchgame.clicksearchgame();
				
				Thread.sleep(1000);
				
				try {
					
					
				    WebElement serachgame1 = driver.findElement(By.xpath("//div[@class='findgames games']"));

				    String title = serachgame1.getText().trim().replaceAll("\\s+", " ");
				    
				    String ActualTitle = "Meow Janken Habanero";
				    String ExpectedTitle = title;

				    if (ActualTitle.equals(ExpectedTitle)) {
				        System.out.println("Game is found in  Homepage Afterlogin");
				        screenshot_class.ScreenShot(driver, "Homepagegamefoundafterlogin");
				    } else {
				        System.out.println("Game is not found");
				    }
				    
				       

				} 
				catch (NoSuchElementException e) {
					Thread.sleep(1000);
				    System.out.println("Game is not found found");
				    driver.close();
				}
				 catch (Exception e) {
					    System.out.println("An unexpected error occurred: " + e.getMessage());
					}
			  
				
		  
		 
		  }
		  
		  
		  @Test(priority=3)
		  public void afterloginallgamessearch() throws InterruptedException, IOException
		  {
			  Registerpomclass register = new Registerpomclass(driver);
				register.languagebtn();
				register.englishlangbtn();
				Thread.sleep(2000);
				
				Loginpomclass login= new Loginpomclass(driver);
				login.loginbtnclick();
				Thread.sleep(1000);
				login.username1();
				Thread.sleep(1000);
				login.password1();
				Thread.sleep(1000);
				login.Innerloginbtn1();
				Thread.sleep(3000);
				
				Thread.sleep(2000);
				
				Registerpomclass register1 = new Registerpomclass(driver);
				register1.click_New_Pin();
				register1.click_Pin1();
				register1.click_Pin2();
				register1.click_Ok_Authentication();
				Thread.sleep(10000);
				
				
				Allpages_Pomclass allgame=new Allpages_Pomclass(driver);
				allgame.clickallgames();
				Thread.sleep(2000);
				
				searchgame_pomclass searchgame=new searchgame_pomclass(driver);
				searchgame.clicksearchgame();
				
				Thread.sleep(2000);
				
				try {
					
					
				    WebElement serachgame1 = driver.findElement(By.xpath("(//div[@class='container'])[4]"));

				    String title = serachgame1.getText().trim().replaceAll("\\s+", " ");
				    
				   
				    String ActualTitle = "Meow Janken Habanero";
				    String ExpectedTitle = title;
				    

				    if (ActualTitle.equals(ExpectedTitle)) {
				        System.out.println("Game is found in All games Afterlogin");
				        screenshot_class.ScreenShot(driver, "Allgamepagegamefoundafterlogin");
				    } else {
				        System.out.println("Game is not found");
				        driver.close();
				    }
				   
				       

				} 
				catch (NoSuchElementException e) {
					Thread.sleep(1000);
				    System.out.println("Game is not found found");
				   
				}
				 catch (Exception e) {
					    System.out.println("An unexpected error occurred: " + e.getMessage());
					   
					}
				
			  
		  }
	
}
	
