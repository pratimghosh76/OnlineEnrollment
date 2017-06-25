package pageObjects;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

public class UserAgreement_Page extends BaseClass  {
	private static WebElement element;
	public static String sProductName;
	public static String sProductPrice;
 public UserAgreement_Page(WebDriver driver){
	super(driver);
	}
 

 public static WebElement txtbox_AccessCode(){
	 element = null;
   	try{
   		System.out.print("trying for the element");
   	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
   		driver.manage().window().maximize();
   		
   		//element= driver.findElement(By.xpath("/html/body/div[2]/div[1]/main/div[1]/div[1]/div/form/div/div[1]/div/input"));
   		element= driver.findElement(By.xpath(".//*[@id='accessCode']"));
   		
   		Log.info("Access Code text box is found");
   		System.out.print("element done");
   	}catch (Exception e){
   		System.out.print("exception");
   		Log.error("access code text box was not found");
   		throw(e);
   		}
   	return element;
    }
 
 
 public static WebElement btn_Continue(){
	 element = null;
   	try{
   		//element= driver.findElement(By.xpath("/html/body/div[2]/div[1]/main/div[1]/div[1]/div/form/div/div[2]/input"));
   		element= driver.findElement(By.xpath("//input[@value='Continue']"));
   		Log.info("Continue button is found on the Check Out Page");
   	}catch (Exception e){
   		Log.error("Continue button on Check Out page is not found");
   		throw(e);
   		}
   	return element;
 }
 

 public static WebElement btn_CompleteEnrollment(){
	 element = null;
   	try{
   		//element= driver.findElement(By.xpath("/html/body/div[2]/div[1]/main/div[1]/div[1]/div/form/div/div[2]/input"));
   		element=  driver.findElement(By.xpath("//input[@id='btnCompleteEnrollment']"));
   		Log.info("Continue button is found on the Check Out Page");
   	}catch (Exception e){
   		Log.error("Continue button on Check Out page is not found");
   		throw(e);
   		}
   	return element;
 }
}
