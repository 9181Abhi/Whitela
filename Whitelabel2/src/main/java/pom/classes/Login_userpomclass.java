package pom.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_userpomclass {
	
	
	private WebDriver driver;
	public Login_userpomclass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="login-wrapbtn text_button-login border-login")
	private WebElement Login;
	public void login_btn()
	{
		Login.click();;
	}
	
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement user_username;
	public void inputusername()
	{
		user_username.sendKeys("Akugale39");
	}
	
	
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement user_Password;
	public void inputpassword()
	{
		user_Password.sendKeys("Test@123");
	}
	
	@FindBy(xpath="//button[@class='login-loader loaderButton']")
	private WebElement internallogin;
	public void internalloginbtn()
	{
		internallogin.click();
	}
	
	
}
