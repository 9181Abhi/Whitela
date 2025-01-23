package pom.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LightandDarkmodepomclass {
	
	private WebDriver driver;
	public LightandDarkmodepomclass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	
	
	@FindBy(xpath="//div[@class='sub-header']")
	private WebElement Gameprovider;
	public void clickGameprovider()
	{
		Gameprovider.click();
	}
	
}
