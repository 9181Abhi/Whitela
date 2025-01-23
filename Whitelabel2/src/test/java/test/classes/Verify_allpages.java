package test.classes;
import java.awt.Dimension;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import pom.classes.Allpages_Pomclass;
import pom.classes.Loginpomclass;
import pom.classes.Registerpomclass;
import pom.classes.Testbaseclass;
import utility.ckasses.Scrolling_class;
import utility.ckasses.screenshot_class;

public class Verify_allpages  extends Testbaseclass
{

	
	@Test
	public void clickallpages() throws InterruptedException, IOException
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
		
		Allpages_Pomclass allpages= new Allpages_Pomclass(driver);
		allpages.clickallgames();
			String actualUrl=driver.getCurrentUrl();
			String expectedurl="https://wl2-test-user.dev-diamondteam.com/all-games";
	
			Assert.assertEquals(expectedurl, actualUrl, "Allgames page not open");
			System.out.println("Allgames page open sucesfully");
		Thread.sleep(10000);
		screenshot_class.ScreenShot(driver, "Allgamespage");
			
		allpages.clickReferral();
			String actualUrl1=driver.getCurrentUrl();
			String expectedurl1="https://wl2-test-user.dev-diamondteam.com/referral";

		Assert.assertEquals(expectedurl1, actualUrl1, "Referral page not open");
		System.out.println("Referral page  open sucessfully");
		Thread.sleep(7000);
		screenshot_class.ScreenShot(driver, "Reerralpage");
			
		allpages.clickPromotion();
			String actualUrl2=driver.getCurrentUrl();
			String expectedurl2="https://wl2-test-user.dev-diamondteam.com/promotion";

		Assert.assertEquals(expectedurl2, actualUrl2, "promotion page not open");
		System.out.println("promotion page  open sucessfully"); 
		Thread.sleep(7000);
		screenshot_class.ScreenShot(driver, "Promotionpage");
			
		allpages.clickdeposit();
			String actualUrl3=driver.getCurrentUrl();
			String expectedurl3="https://wl2-test-user.dev-diamondteam.com/deposit";

		Assert.assertEquals(expectedurl3, actualUrl3, "Deposit page not open");
		System.out.println("Deposit page  open sucessfully"); 
		Thread.sleep(7000);
		screenshot_class.ScreenShot(driver, "Depositpage");
			
		allpages.clickWithdraw();
			String actualUrl4=driver.getCurrentUrl();
			String expectedurl4="https://wl2-test-user.dev-diamondteam.com/withdraw";

		Assert.assertEquals(expectedurl4, actualUrl4, "Withdraw page not open");
		System.out.println("Withdraw page  open sucessfully");
		Thread.sleep(7000);
		screenshot_class.ScreenShot(driver, "Withdrawpage");
		
		Thread.sleep(2000);
		
		
		
		allpages.clickBlog();
		String actualUrl5=driver.getCurrentUrl();
		String expectedurl5="https://wl2-test-user.dev-diamondteam.com/blogs";

		Assert.assertEquals(expectedurl5, actualUrl5, "Blog page not open");
		System.out.println("Blog page  open sucessfully");
		Thread.sleep(7000);
		screenshot_class.ScreenShot(driver, "BlogPage");
		
		allpages.clickAboutus();
		String actualUrl6=driver.getCurrentUrl();
		String expectedurl6="https://wl2-test-user.dev-diamondteam.com/about-us";

		Assert.assertEquals(expectedurl6, actualUrl6, "Aboutus page not open");
		System.out.println("Aboutus page  open sucessfully");
		Thread.sleep(7000);
		screenshot_class.ScreenShot(driver, "AboutusPage");

		allpages.clickHelp();
		String actualUrl7=driver.getCurrentUrl();
		String expectedurl7="https://wl2-test-user.dev-diamondteam.com/help";

		Assert.assertEquals(actualUrl7, expectedurl7, "Help page not open");
		System.out.println("Help page  open sucessfully");
		Thread.sleep(7000);
		screenshot_class.ScreenShot(driver, "HelpPage");

		allpages.clickTerms();
		String actualUrl8=driver.getCurrentUrl();
		String expectedurl8="https://wl2-test-user.dev-diamondteam.com/terms-and-conditions";

		Assert.assertEquals(actualUrl8, expectedurl8, "Terms&Condition page not open");
		System.out.println("Terms&Condition page  open sucessfully");
		Thread.sleep(7000);
		screenshot_class.ScreenShot(driver, "Terms&Condition");
		
		
		allpages.clickHome();
		Thread.sleep(3000);
		
		allpages.clickAllprovider();
		String actualUrl9=driver.getCurrentUrl();
		String expectedurl9="https://wl2-test-user.dev-diamondteam.com/game-provider";

		Assert.assertEquals(actualUrl9, expectedurl9, "Allprovider page not open");
		System.out.println("Allprovider page  open sucessfully");
		Thread.sleep(7000);
		screenshot_class.ScreenShot(driver, "Allprovider");
		
		
		
		
		Thread.sleep(2000);
		driver.close();
		
		
		
		
		 
	}
}
