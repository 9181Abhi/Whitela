package pom.classes;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.ckasses.excelsheet_class;

public class Category_pomclass {
	
	
	private WebDriver driver;
	public Category_pomclass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="(//*[name()='svg'][@class='down-arrow'])[1]")
	private WebElement category;
	public void clickcategory()
	{
		category.click();
	}
	
	
	@FindBy(xpath="(//a[text()='Categories']")
	private WebElement categories;
	public void clickcategories()
	{
		categories.click();
	}
	
	
	@FindBy(xpath="(//*[name()='svg'][@stroke='currentColor'])[5]")
	private WebElement gameclose;
	public void clickgameclose()
	{
		gameclose.click();
	}
	
	
	
	@FindBy(xpath="//span[text()='Slots']")
	private WebElement slot;
	public void clickslot()
	{
		slot.click();
	}
	
	
	@FindBy(xpath="//span[text()='Live Casino']")
	private WebElement Livecasino;
	public void clickLivecasino()
	{
		Livecasino.click();
	}
	
	@FindBy(xpath="//span[text()='Arcades']")
	private WebElement Arcades;
	public void clickArcades()
	{
		Arcades.click();
	}
	
	
	@FindBy(xpath="//span[text()='Sportsbook']")
	private WebElement Sportbooks;
	public void clicksportbooks()
	{
		Sportbooks.click();
	}
	
	
	@FindBy(xpath="//span[text()='Card Games']")
	private WebElement Cardgames;
	public void clickcardgames()
	{
		Cardgames.click();
	}
	
	
	@FindBy(xpath="//span[text()='Crash Game']")
	private WebElement crashgames;
	public void clickcrashgame()
	{
		crashgames.click();
	}
	
	
	@FindBy(xpath="//span[text()='Lottery']")
	private WebElement Lottery;
	public void clicklootery()
	{
		Lottery.click();
	}
	
	
	
	@FindBy(xpath="//span[text()='Fishing']")
	private WebElement Fishing;
	public void clickFishing()
	{
		Fishing.click();
	}
	
	
	@FindBy(xpath="//span[text()='Dingdong']")
	private WebElement Dingdong;
	public void clickDingdong()
	{
		Dingdong.click();
	}
	
	@FindBy(xpath="//input[@class='search-input text-find_games']")
	private WebElement searchslot;
	public void clicksearchslot() throws IOException
	{
		String searchslotgame=excelsheet_class.testData2(null, 1, 1);
		searchslot.sendKeys(searchslotgame);
		
	}
	
	@FindBy(xpath="//input[@class='search-input text-find_games']")
	private WebElement searchlivecasino;
	public void clicksearlivecasino() throws IOException
	{
		String searchlivecasinogame=excelsheet_class.testData2(null, 2, 1);
		searchlivecasino.sendKeys(searchlivecasinogame);
		
	}
	
	
	@FindBy(xpath="//input[@class='search-input text-find_games']")
	private WebElement searcharcade;
	public void clicksearcharcade() throws IOException
	{
		String searcharcadegame=excelsheet_class.testData2(null, 3, 1);
		searcharcade.sendKeys(searcharcadegame);
		
	}
	
	
	@FindBy(xpath="//input[@class='search-input text-find_games']")
	private WebElement searchsportsbook;
	public void clicksearchsportsbook() throws IOException
	{
		String searchsportbookgame=excelsheet_class.testData2(null, 4, 1);
		searchsportsbook.sendKeys(searchsportbookgame);
		
	}
	
	
	@FindBy(xpath="//input[@class='search-input text-find_games']")
	private WebElement searchcardgame;
	public void clicksearchcardgame() throws IOException
	{
		String searchcardggame=excelsheet_class.testData2(null, 5, 1);
		searchcardgame.sendKeys(searchcardggame);
		
	}
	
	
	@FindBy(xpath="//input[@class='search-input text-find_games']")
	private WebElement searchcrashgame;
	public void clicksearchcrashgame() throws IOException
	{
		String searchcrashggame=excelsheet_class.testData2(null, 6, 1);
		searchcrashgame.sendKeys(searchcrashggame);
		
	}
	
	
	@FindBy(xpath="//input[@class='search-input text-find_games']")
	private WebElement searchlottery;
	public void clicksearchlotterygame() throws IOException
	{
		String searchlotterygame=excelsheet_class.testData2(null, 7, 1);
		searchlottery.sendKeys(searchlotterygame);
		
	}
	
	
	@FindBy(xpath="//input[@class='search-input text-find_games']")
	private WebElement searchFishing;
	public void clicksearchFishinggame() throws IOException
	{
		String searchFishinggame=excelsheet_class.testData2(null, 8, 1);
		searchFishing.sendKeys(searchFishinggame);
		
	}
	
	
	@FindBy(xpath="//input[@class='search-input text-find_games']")
	private WebElement searchdingdong;
	public void clicksearchDingdonggame() throws IOException
	{
		String searchDingdonggame=excelsheet_class.testData2(null, 9, 1);
		searchdingdong.sendKeys(searchDingdonggame);
		
	}
	
	
	
	
	
	
	
	
	

}
