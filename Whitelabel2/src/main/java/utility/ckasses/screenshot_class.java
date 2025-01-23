package utility.ckasses;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot_class {
	

	public static void ScreenShot(WebDriver driver,String a) throws IOException
	{
		
		Date d= new Date();
		DateFormat d1= new SimpleDateFormat("MM-dd-yy & HH-mm-ss");
		String date= d1.format(d);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File("C:\\Users\\hkb-dev-91-local\\eclipse-workspace\\Whitelabel2\\Screenshot\\Allpages"+ a+date+".jpg");
		FileHandler.copy(source, target);		
	}
	
}
