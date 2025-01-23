package pom.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Allpages_Pomclass {
	
	private WebDriver driver;
	public Allpages_Pomclass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="(//span[@class='sm-f'])[1]")
	private WebElement Home;
	public void clickHome()
	{
		Home.click();
	}
	
	
	@FindBy(xpath="(//span[@class='sm-f'])[2]")
	private WebElement Allgames;
	public void clickallgames()
	{
		Allgames.click();
	}
	
	
	@FindBy(xpath="(//span[@class='sm-f'])[3]")
	private WebElement Referral;
	public void clickReferral()
	{
		Referral.click();
	}
	
	
	@FindBy(xpath="(//span[@class='sm-f'])[4]")
	private WebElement Promotion;
	public void clickPromotion()
	{
		Promotion.click();
	}
	
	
	@FindBy(xpath="//a[@class=' header-btn dropdown-item text_button-withdraw border-withdraw background-login_button']")
	private WebElement Withdraw;
	public void clickWithdraw()
	{
		Withdraw.click();
	}
	
	
	@FindBy(xpath="//a[@class=' deposit-btn-bg dropdown-item text_button-deposit border-deposit background-deposit_button']")
	private WebElement deposit;
	public void clickdeposit()
	{
		deposit.click();
	}
	
	
	@FindBy(xpath="//div[@class='sub-header']")
	private WebElement Allprovider;
	public void clickAllprovider()
	{
		Allprovider.click();
	}

	
	@FindBy(css = "a[href='/blogs']")
	private WebElement Blog;
	public void clickBlog()
	{
		Blog.click();
	}

	
	@FindBy(css = "a[href='/help']")
	private WebElement Help;
	public void clickHelp()
	{
		Help.click();
	}

	
	@FindBy(css = "a[href='/about-us']")
	private WebElement Aboutus;
	public void clickAboutus()
	{
		Aboutus.click();
	}

	
	@FindBy(css = "a[href='/terms-and-conditions']")
	private WebElement Terms;
	public void clickTerms()
	{
		Terms.click();
	}
	
	
	
	
	
	
	
	
	

}
