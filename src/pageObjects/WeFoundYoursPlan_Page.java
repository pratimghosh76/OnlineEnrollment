package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

public class WeFoundYoursPlan_Page extends BaseClass  {
	private static WebElement element;
	public static String sProductName;
	public static String sProductPrice;
 public WeFoundYoursPlan_Page(WebDriver driver){
	super(driver);
	}
 
 
 
 public static WebElement btn_Continue(){
	 element = null;
   	try{
     	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
   		//element= driver.findElement(By.xpath("/html/body/div[2]/div[1]/main/div[1]/div[1]/div/form/div/div[2]/input"));
   		element= driver.findElement(By.xpath(".//*[@id='btnContinueSelectPlan']"));
   		Log.info("Continue button is found on the Check Out Page");
   	}catch (Exception e){
   		Log.error("Continue button on Check Out page is not found");
   		throw(e);
   		}
   	return element;
    }
}
