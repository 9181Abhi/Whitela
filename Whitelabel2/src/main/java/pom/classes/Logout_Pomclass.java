package pom.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout_Pomclass {

	
	private WebDriver driver;
	public Logout_Pomclass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}	
	
	@FindBy(xpath="(//*[name()='svg'][@class='arrow down-arrow'])[1]")
	private WebElement profile;
	public void clickprofile()
	{
		profile.click();
	}
	
	
	@FindBy(xpath="//span[text()='Log Out']")
	private WebElement Logout;
	public void clickLogout()
	{
		Logout.click();
	}
	
	
}
