package pom.classes;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Registerpomclass {
	
	private WebDriver driver;
	
	public Registerpomclass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//span[@class='text-danger error-msg']")
	private WebElement errormessageclick;
	public void erromessage()
	{
		String errormsg=errormessageclick.getText();
		System.out.println(errormsg);
	}
	
	public boolean isErrorMessagePresent() {
	    try {
	    	
	    	
	        return errormessageclick.isDisplayed(); 
	    } catch (NoSuchElementException e) {
	        return false; 
	    }
	}
	
	
	
	@FindBy(xpath="(//img[@class='me-1 flag-img'])[1]")
	private WebElement language;
	public void languagebtn()
	{
		language.click();
	}
	
	
	@FindBy(xpath="(//img[@class='me-1 flag-img'])[2]")
	private WebElement englishlang;
	public void englishlangbtn()
	{
		englishlang.click();
	}
	
	
	@FindBy(xpath="(//img[@class='me-1 flag-img'])[3]")
	private WebElement Indolang;
	public void Indolangbtn()
	{
		Indolang.click();
	}
	
	
	@FindBy(xpath="//a[@class='register text_button-register border-register']")
	private WebElement register;
	public void registerbtn()
	{
		register.click();
	}
	
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement user;
	public void user1()
	{
		user.sendKeys("Test2099");
	}
	
	
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement pass;
	public void pass1()
	{
		pass.sendKeys("Test@123");
	}
	
	
	
	@FindBy(xpath="//input[@name='password_confirmation']")
	private WebElement confirmpass;
	public void confirmpass1()
	{
		confirmpass.sendKeys("Test@123");
	}
	
	
	@FindBy(xpath="//input[@name='contact']")
	private WebElement phno;
	public void Click_phonenumber()
	{
		phno.sendKeys("03214088010");
	}
	
	
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement Email;
	public void Click_Email1()
	{
		Email.sendKeys("test2098@gmail.com");
	}
	
	@FindBy(xpath="//div[@class='css-1xc3v61-indicatorContainer']")
	private WebElement dropdown;
	public void click_bank()
	{
		dropdown.click();
	}
	
	public void enterbank(String bank)
	{
		Actions action = new Actions(driver);
		action.sendKeys(dropdown,bank).perform();
		action.sendKeys(Keys.ENTER).perform();
	}
	
	
	@FindBy(xpath="//input[@name='account_name']")
	private WebElement Accname;
	public void Click_Accname1()
	{
		Accname.sendKeys("Test2098");
	}
	
	@FindBy(xpath="//input[@name='account_number']")
	private WebElement Accno;
	public void Click_Accno1()
	{
		Accno.sendKeys("012161260243");
	}
	
	@FindBy(xpath="//button[@class='btn register-loader reg-sub loaderButton']")
	private WebElement InnerRegister;
	public void Click_InnerRegisterbtn()
	{
		InnerRegister.click();
	}
	
//	@FindBy(xpath="//button[@class='btn register-loader reg-sub loaderButton']")
//	private WebElement registerotherinfo;
//	public void registerotherinfoclick()
//	{
//		String text=registerotherinfo.getText();
//		System.out.println(text);
//		
//	}
	
	@FindBy(xpath="//input[@type='password']")
	private List <WebElement> pin;
	
	public void click_New_Pin()
	{
		pin.get(0).click();
	}	
	public void click_Confirm_Pin()
	{
		pin.get(1).click();
	}
	//input[@type='password']
	@FindBy(xpath="//span[@id='1']")
	private WebElement pin_1;
	@FindBy(xpath="//span[@id='2']")
	private WebElement pin_2;
	
	public void click_Pin1()
	{
		pin_1.click();
	}
	public void click_Pin2()
	{
		for(int i=1;i<=5;i++)
		{
			pin_2.click();
		}
	}
	
	@FindBy(xpath="//button[@class='okay']")
	private WebElement okay;
	@FindBy(xpath="//button[@class='btn-okay security-ok text_button-pin_ok border-pin_okey loaderButton']")
	private WebElement ok_auth;
	public void click_Okay()
	{
		okay.click();
	}
	public void click_Ok_Authentication()
	{
		ok_auth.click();
	}
	
	@FindBy(xpath="//button[@class='login-pin-process loaderButton']")
	private WebElement process;
	
	public void click_Process_Button()
	{ 
		process.click();
	}
	
	@FindBy(xpath="//div[@class='text-center depo-okbtn']")
	private WebElement Popupclose;
	
	public void click_Popupclose()
	{
		Popupclose.click();
	}
	
	
	
	
	
	
	
	

}
