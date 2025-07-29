package pom.classes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Adminbaseclass {
	public WebDriver driver;
	@BeforeClass
	public void setup() throws InterruptedException
	{
	   WebDriverManager.chromedriver().setup();
	   driver= new ChromeDriver();
	   driver.get("https://admin2-test-wl2.api-victory.com/go/demo7");
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	   driver.manage().window().maximize();
	   Thread.sleep(10000);

	   
	   WebElement username=driver.findElement(By.name("username"));
	   username.sendKeys("Abhishek");
	   Thread.sleep(1000);
	   
	   
	   WebElement password=driver.findElement(By.name("password"));
	   password.sendKeys("V8@xZ#rL92!fTbqW");
	   Thread.sleep(1000);
	   
	   
	   WebElement captch=driver.findElement(By.name("captcha"));
	   captch.sendKeys("fgh");
	   Thread.sleep(2000);
	   
	   WebElement submitbtn=driver.findElement(By.xpath("//input[@class='btn btn-primary btn-block']"));
	   submitbtn.click();
	   Thread.sleep(10000);
}
}
