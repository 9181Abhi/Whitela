package pom.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class openreferrallink {
	
private WebDriver driver;
	
	public openreferrallink(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void openlink()
	{
		WebDriver driver=new ChromeDriver();
		
	}
	

}
