package test.classes;

import java.io.IOException;

import org.testng.annotations.Test;

import pom.classes.Loginpomclass;
import pom.classes.Testbaseclass;
import utility.ckasses.excelsheet_class;

public class Login_admin extends Testbaseclass {
	@Test
	public void username() throws IOException
	{
		
		Loginpomclass login= new Loginpomclass(driver);
		
		String username=excelsheet_class.testData(null, 1, 0);
		
		//System.out.println(a);
		
		String password=excelsheet_class.testData(null, 1, 1);
		//System.out.println(b);
	}
	

}
