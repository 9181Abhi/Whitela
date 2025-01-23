package pom.classes;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Adminbaseclass {
	public WebDriver driver;
	@BeforeMethod
	public void setup() throws InterruptedException
	{
	   WebDriverManager.chromedriver().setup();
	   driver= new ChromeDriver();
	   driver.get("https://wl2-uat-admin.dev-diamondteam.com/go/WLS");
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	   driver.manage().window().maximize();
	   Thread.sleep(10000);

}
}
