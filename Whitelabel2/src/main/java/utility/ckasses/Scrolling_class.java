package utility.ckasses;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Scrolling_class {
	public static void scrollDown(WebDriver driver)
	{
		JavascriptExecutor js  = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,800);");
	}
	
	public static void scrollup(WebDriver driver)
	{
		JavascriptExecutor js  = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
	}
	
	public static void scrollDown1(WebDriver driver)
	{
		JavascriptExecutor js  = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600);");
	}
}


