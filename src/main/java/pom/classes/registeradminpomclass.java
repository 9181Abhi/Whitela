package pom.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class registeradminpomclass {

	
	
	
	private WebDriver driver;
	public registeradminpomclass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(name="username") WebElement userinput;	
	@FindBy(name="password") WebElement passwordinput;
	@FindBy(name="password_confirmation") WebElement confirmPasswordInput;
	@FindBy(name="email") WebElement emailinput;
	@FindBy(name="contact") WebElement contactinput;
	@FindBy(name="account_name") WebElement accountnameinput;
	@FindBy(name="account_number") WebElement accountnumberinput;
//	@FindBy(id="react-select-27-placeholde") WebElement bankinput;
	@FindBy(xpath = "//button[text()='Submit']") WebElement submitbtn;
	
	
	
	
	
	public void registeruser(String username, String password, String confirmpass, String email, String contact, String Accname, String Accnumber)
	
	{
		userinput.clear();
		userinput.sendKeys(username);
		
		passwordinput.clear();
		passwordinput.sendKeys(password);
		
		confirmPasswordInput.clear();
		confirmPasswordInput.sendKeys(confirmpass);
		
		emailinput.clear();
		emailinput.sendKeys(email);
		
		contactinput.clear();
		contactinput.sendKeys(contact);
		
//		bankinput.clear();
//		bankinput.click();
		//bankinput.sendKeys(bank);
		
		accountnameinput.clear();
		accountnameinput.sendKeys(Accname);
		
		accountnumberinput.clear();
		accountnumberinput.sendKeys(Accnumber);
		
	}
	
	public void registerbtn()
	{
		submitbtn.click();
	}
}

