package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.Log;

public class LetsStartPlan_Page extends BaseClass {
	private static WebElement element = null;
	//private static WebElement element;
	public static String sProductName;
	public static String sProductPrice;
	public static String sAccessCode;
	public static String sSSN;
	public static String sFirstName;
	public static String sLastName;
	public static String sDOB;
 public LetsStartPlan_Page(WebDriver driver){
	super(driver);
	}
 

 public static WebElement txtbox_AccessCode(){
	 element = null;
   	try{
   		System.out.print("trying for the ACCESSCODE");
   		driver.manage().window().maximize();
   		element= driver.findElement(By.xpath("//input[@name='AccessCode']"));
   		   		Log.info("Access Code text box is found");
   		System.out.print("element done");
   	}catch (Exception e){
   		System.out.print("exception");
   		Log.error("access code text box was not found");
   		throw(e);
   		}
   	return element;
    }
 
 public static WebElement txtbox_SSN(){
	 element = null;
   	try{
   		System.out.print("trying for the SSN");
   		driver.manage().window().maximize();
   		element= driver.findElement(By.xpath("//*[@id='ssnInput']"));
   		   		Log.info("Access Code text box is found");
   		System.out.print("element done");
   	}catch (Exception e){
   		System.out.print("exception");
   		Log.error("access code text box was not found");
   		throw(e);
   		}
   	return element;
    }
 
 public static WebElement txtbox_FirstName(){
	 element = null;
   	try{
   		System.out.print("trying for the firstname");
   		driver.manage().window().maximize();
   		element= driver.findElement(By.xpath("//*[@id='firstNameInput']"));
   		   		Log.info("Access Code text box is found");
   		System.out.print("element done");
   	}catch (Exception e){
   		System.out.print("exception");
   		Log.error("access code text box was not found");
   		throw(e);
   		}
   	return element;
    }
 
 public static WebElement txtbox_LastName(){
	 element = null;
   	try{
   		System.out.print("trying for the last name");
   		driver.manage().window().maximize();
   		element= driver.findElement(By.name("LastName"));
   		   		Log.info("Access Code text box is found");
   		System.out.print("element done");
   	}catch (Exception e){
   		System.out.print("exception");
   		Log.error("access code text box was not found");
   		throw(e);
   		}
   	return element;
    }
 
 public static WebElement txtbox_DOB(){
	 element = null;
   	try{
   		System.out.print("trying for the DOB");
   		driver.manage().window().maximize();
   		element= driver.findElement(By.name("DateOfBirth"));
   		   		Log.info("Access Code text box is found");
   		System.out.print("element done");
   	}catch (Exception e){
   		System.out.print("exception");
   		Log.error("access code text box was not found");
   		throw(e);
   		}
   	return element;
    }
 
 public static WebElement btn_FindPlan(){
	 element = null;
   	try{
   		WebDriverWait wait=new WebDriverWait(driver, 20);
   		System.out.print("trying for the FIND PLAN");
   		String title=driver.getTitle();
   		System.out.println(title);
   		   	element= driver.findElement(By.xpath(".//*[@id='findPlanForm']/div/div[3]/input"));
   		element.click();
   	// Execute the Java Script for the element which we find out
   		
   	
   		//Actions actions = new Actions(driver);
   		//actions.moveToElement(element);
   		//actions.perform();
   		
   		Log.info("Continue button is found on the Check Out Page");
   	}catch (Exception e){
   		Log.error("Continue button on Check Out page is not found");
   		throw(e);
   		}
   	return element;
    }
}
