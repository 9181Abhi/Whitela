package pom.classes;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utility.ckasses.excelsheet_class;

public class LoginAdminpomclass {
	
	private WebDriver driver;
	public LoginAdminpomclass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement Admin_username;
	public void Admin_usern() throws IOException
	{
		String a=excelsheet_class.testData(null, 0, 0);
		
		Admin_username.sendKeys(a);
	}
	
	@FindBy(xpath="//input[@name='password']")  		
	private WebElement Admin_password;
	public void Admin_pass()
	{
		Admin_password.sendKeys("Test@123");
	}
	
	
	@FindBy(xpath="//input[@class='btn btn-primary btn-block']")
	private WebElement Admin_login;
	public void Admin_login1()
	{
		Admin_login.click();;
	}
	
	
	@FindBy(xpath="//span[text()='Player']")
	private WebElement Player;
	public void Player_click()
	{
		Player.click();;
	}
	
	@FindBy(xpath="//a[text()='Validation']")
	private WebElement Validation;
	public void Validation_click()
	{
		Validation.click();;
	}
	
	@FindBy(xpath="//input[@name='checkbor_arr']")
	private WebElement checkbox;
	public void check_click()
	{
		 boolean isSelected = checkbox.isSelected();
		 
		 if(!isSelected) 
		 {
			 checkbox.click();
			 System.out.println("");
		 }
		 else {
			 System.out.println("Checkbox is already selected");
		 }
	}
	
	
	@FindBy(xpath="//button[@class='btn btn-success']")
	private WebElement Validation_Accept;
	public void Validation_Accept_click()
	{
		Validation_Accept.click();
	}
	
	@FindBy(xpath="//button[text()='Submit']")
	private WebElement popup_Accept;
	public void popup_Accept_click()
	{
		popup_Accept.click();
	}
	
	@FindBy(xpath="//span[text()='Player']")
	private WebElement player;
	public void playerclick()
	{
		player.click();
	}
	
	@FindBy(xpath="//a[text()='Player List']")
	private WebElement playerlist;
	public void playerlistclick()
	{
		playerlist.click();
	}
	
	@FindBy(xpath="(//select[@class='form-select'])[3]")
	private WebElement selectdropdown;
	public void selectdropdownclick()
	{
		 Select dropdown = new Select(selectdropdown);
		 dropdown.selectByValue("500");
				
	}
	
	
	
	
	
	@FindBy(xpath="(//button[@class='btn btn-primary'])[3]")
	private WebElement Navigate;
	public void Navigateclick()
	{
		Navigate.click();
	}
	
	@FindBy(xpath="//tr[last()]/td[1]")
	private WebElement playercount1;
	public void countclick()
	{
		String lastSerialNumber = playercount1.getText().replaceAll(" &nbsp;&nbsp;","").trim();
		System.out.println(lastSerialNumber);
		
		
	}
	
	@FindBy(xpath="//tr[last()]/td[1]")
	private WebElement playercount2;
	public void countclick1()
	{
		String lastSerialNumber = playercount1.getText().replaceAll(" &nbsp;&nbsp;","").trim();
		System.out.println(lastSerialNumber);
		
		
	}
	
	
	

}
