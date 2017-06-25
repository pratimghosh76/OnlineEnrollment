package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	public  static WebDriver driver;
	public static boolean bResult;
	public  BaseClass(WebDriver driver){
		//System.setProperty("webdriver.gecko.driver","C://OnlineStore//software//geckodriver-v0.15.0-win64//geckodriver.exe");
		// driver = new FirefoxDriver();
		BaseClass.driver = driver;
		BaseClass.bResult = true;
	}

}
