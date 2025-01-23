package pom.classes;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.ckasses.excelsheet_class;

public class Loginpomclass {
	
	private WebDriver driver;
		
	public Loginpomclass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	
	@FindBy(xpath="//a[@class='login-wrapbtn text_button-login border-login']")
	private WebElement loginbtn;
	public void loginbtnclick()
	{
		loginbtn.click();
	}
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement Username1;
	public void username1() throws IOException
	{
		//username.sendKeys("Test50");
		String username=excelsheet_class.testData(null, 1, 0);
		Username1.sendKeys(username);

	}
	
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement Password;
	public void password1() throws IOException
	{
		//Password.sendKeys("Test@123");
		String password=excelsheet_class.testData(null, 1, 1);
		Password.sendKeys(password);
	}
	
	@FindBy(xpath="//button[@class='login-loader  text_button-login border-login loaderButton']")
	private WebElement Innerloginbtn;
	public void Innerloginbtn1()
	{
		Innerloginbtn.click();
	}
	
	
	
	@FindBy(xpath="//div[@class='cg-pin']")
	private WebElement pinbtn;
	public void pinbtn1()
	{
		pinbtn.click();
	}
	
	@FindBy(xpath="/html/body/div[1]/div/div[1]/div/header/div/div/div[3]/div/div/span/svg")
	private WebElement Popup;
	public void closepopup()
	{
		Popup.click();
	}
	
	
	
	@FindBy(xpath="(//span[@class='sm-f'])[2]")
	private WebElement Allgame;
	public void clickallgame()
	{
		Allgame.click();
	}
	
	
	
	
	
	
}
