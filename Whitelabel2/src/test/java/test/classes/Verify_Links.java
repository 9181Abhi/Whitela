package test.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pom.classes.Login_userpomclass;
import pom.classes.Testbaseclass;

public class Verify_Links extends Testbaseclass 
{
	@Test
	public void presentlinks() throws InterruptedException
	{
		Login_userpomclass login= new Login_userpomclass(driver);
		Thread.sleep(10000);
		login.login_btn();
		login.inputusername();
		login.inputpassword();
		login.internalloginbtn();
		Thread.sleep(10000);
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement header =driver.findElement(By.xpath("//ul[@class='navbar-main']"));
		System.out.println(header.findElements(By.tagName("a")).size());
		
		
		  
		 WebElement popupclosebtn= driver.findElement(By.xpath("//span[@class='close']"));
	     popupclosebtn.click();
		 Thread.sleep(10000);
		   
		   
		   
		   		
	} 


}
  