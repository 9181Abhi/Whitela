package pom.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class referaallink {

	private WebDriver driver;
	public  referaallink(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//span[text()='Referral']")
	private WebElement referral;
	public void click_referral()
	{
		referral.click();
	}
	
	@FindBy(xpath="//a[@id='left-tabs-example-tab-second']")
	private WebElement inforeferral;
	public void click_inforeferral()
	{
		inforeferral.click();
	}
	
	@FindBy(xpath="(//div[@class='copy-id'])[2]")
	private WebElement copylink;
	public void click_copylink()
	{
		copylink.click();
	}
	
	@FindBy(xpath="//span[@class='close']//*[name()='svg']")
	private WebElement closepopup;
	public void click_closepopup()
	{
		closepopup.click();
	}
	
	
	
}



