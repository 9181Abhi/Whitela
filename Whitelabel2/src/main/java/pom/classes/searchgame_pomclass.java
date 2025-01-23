package pom.classes;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.ckasses.excelsheet_class;

public class searchgame_pomclass {

	private WebDriver driver;
	public searchgame_pomclass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@class='search-input text-find_games background-findgame_search']")
	private WebElement searchgame;
	public void clicksearchgame() throws IOException
	{
		String searchgame1=excelsheet_class.testData1(null, 1, 0);
		searchgame.sendKeys(searchgame1);

	}
	
	
	
	
	
	
	
	
	
}
