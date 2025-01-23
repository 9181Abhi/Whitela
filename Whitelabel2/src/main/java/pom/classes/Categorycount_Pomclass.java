package pom.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Categorycount_Pomclass 
{
	
	private WebDriver driver;
	public Categorycount_Pomclass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//div[@class='category-text'])[9]")
	private WebElement slot;
	public void countslot()
	{
		String slot1=slot.getText().trim().replaceAll("\\s+", " ");
		System.out.println(slot1);
	}
	
	
	
}
