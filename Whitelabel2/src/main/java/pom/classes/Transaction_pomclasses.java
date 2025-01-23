package pom.classes;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Transaction_pomclasses {
	
	
	private WebDriver driver;
	public Transaction_pomclasses(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[@class=' deposit-btn-bg dropdown-item text_button-deposit border-deposit background-deposit_button']")
	private WebElement deposit;
	public void depositbtn()
	{
		deposit.click();
	}
	
	@FindBy(xpath="//input[@name='entered_amount']")
	private WebElement depositamount;
	public void depositamountinput()
	{
		depositamount.sendKeys("5000");
	}
	
	@FindBy(xpath="//input[@name='entered_remark']")
	private WebElement reamark;
	public void remarkinput()
	{
		reamark.sendKeys("Deposit");
	}
	
	@FindBy(xpath="//button[@class='cus-process loaderButton']")
	private WebElement process;
	public void processbtn()
	{
		process.click();
	}
	
	@FindBy(xpath="//span[text()='Transaction']")
	private WebElement transaction;
	public void transactionbtn()
	{
		transaction.click();
	}
	
	
	@FindBy(xpath="//input[@name='description']")
	private WebElement desacriptation;
	@FindBy(xpath="//p[text()='No Data Found']")
	private WebElement nodata;
	public void inputdesacriptation() 
	{
	
     
           desacriptation.click();       
       
	}
	
	
	public void inputdnodata() throws InterruptedException 
	{
	
		String ele=nodata.getText();
		
		
		if(ele !="No Data Found")
		{
			Thread.sleep(1000);
			driver.close();
			System.out.println("driver close");
		}
        
	}
	


	
	public void enterdescription(String description)
	{
		Actions action = new Actions(driver);
		action.sendKeys(desacriptation,description).perform();
		action.sendKeys(Keys.ENTER).perform();
	}
	
	
	@FindBy(xpath="(//button[text()='Accept'])[2]")
	private WebElement depositeaccept;
	public void depositacceptebtn()
	{
		depositeaccept.click();
	}
	
	
	@FindBy(xpath="(//button[text()='Reject'])[2]")
	private WebElement depositereject;
	public void depositerejectbtn()
	{
		depositereject.click();
	}
	

}
