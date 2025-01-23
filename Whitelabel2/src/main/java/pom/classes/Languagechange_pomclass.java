package pom.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Languagechange_pomclass {
	
	private WebDriver driver;
	public Languagechange_pomclass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="(//span[@class='sm-f'])[1]")
	private WebElement Home;
	public void clickHome()
	{
		Home.getText();
	}
	
	
	@FindBy(xpath="(//span[@class='sm-f'])[2]")
	private WebElement Allgames;
	public void clickallgames()
	{
		//Allgames.click();
		Allgames.getTagName();
	}
	
}
