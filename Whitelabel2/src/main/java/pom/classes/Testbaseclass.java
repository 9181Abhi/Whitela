package pom.classes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Testbaseclass {
	public WebDriver driver;
	@BeforeClass
	public void setup() throws InterruptedException
	{
	   WebDriverManager.chromedriver().setup();
	   driver= new ChromeDriver();
	   driver.get("https://wl2-test-user.dev-diamondteam.com/");
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	   driver.manage().window().maximize();
	   Thread.sleep(10000);
	   

	   
	   
	}
	
//	@AfterClass
//	public void teardown()
//	{
//		driver.quit();
//		System.out.println("Browser is closed");
//
//
//	}
}

