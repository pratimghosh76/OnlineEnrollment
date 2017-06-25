package pageObjects;

import java.util.concurrent.TimeUnit;

//import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.support.ui.Select;

import utility.Log;

public class AboutYou_Page extends BaseClass {
	private static WebElement element = null;
	//private static WebElement element;
	public static String sProductName;
	public static String sProductPrice;
	public static String sAccessCode;
	public static String sSSN;
	public static String sFirstName;
	public static String sLastName;
	public static String sDOB;

 public AboutYou_Page(WebDriver driver){
	super(driver);
	}
 

 public static WebElement dropdown_MaritalStat(){
	 element = null;
   	try{
   		System.out.print("trying for the ACCESSCODE");
   		driver.manage().window().maximize();
   		
   		element=driver.findElement(By.id("maritalStatus"));
   		WebElement element = driver.findElement(By.id("maritalStatus"));
   		element.sendKeys("MARRIED");
   		//Select oSelect = new Select(element);
   		//oSelect.selectByValue("MARRIED");
   		Log.info("Access Code text box is found");
   		System.out.print("element done");
   	}catch (Exception e){
   		System.out.print("exception");
   		Log.error("access code text box was not found");
   		throw(e);
   		}
   	return element;
    }
 
 public static WebElement Radio_Male(){

	 element = null;
   	try{
   		System.out.print("trying for the SSN");
   		driver.manage().window().maximize();
   		element= driver.findElement(By.id("male"));
   		   		Log.info("Access Code text box is found");
   		System.out.print("element done");
   	}catch (Exception e){
   		System.out.print("exception");
   		Log.error("access code text box was not found");
   		throw(e);
   		}
   	return element;
    }


 
 public static WebElement Radio_Email_Personal(){

	 element = null;
   	try{
   		System.out.print("trying for the SSN");
   		driver.manage().window().maximize();
   		element=  driver.findElement(By.xpath("//label[@for='otherEmailOption']"));
   		   		Log.info("Access Code text box is found");
   		System.out.print("element done");
   	}catch (Exception e){
   		System.out.print("exception");
   		Log.error("access code text box was not found");
   		throw(e);
   		}
   	return element;
    }

 public static WebElement Radio_Email_Personal_New(){

	 element = null;
   	try{
   		System.out.print("trying for the SSN");
   		driver.manage().window().maximize();
   		element=  driver.findElement(By.xpath("//label[@for='emailOther']"));
   		   		Log.info("Access Code text box is found");
   		System.out.print("element done");
   	}catch (Exception e){
   		System.out.print("exception");
   		Log.error("access code text box was not found");
   		throw(e);
   		}
   	return element;
    }
 public static WebElement Radio_PersonalPhone(){

	 element = null;
   	try{
   		System.out.print("trying for the SSN");
   		driver.manage().window().maximize();
   		element= driver.findElement(By.xpath("//label[@for='otherPhoneOption']"));
   		
   		   		Log.info("Access Code text box is found");
   		System.out.print("element done");
   	}catch (Exception e){
   		System.out.print("exception");
   		Log.error("access code text box was not found");
   		throw(e);
   		}
   	return element;
    }
 public static WebElement Radio_PersonalPhone_New(){

	 element = null;
   	try{
   		System.out.print("trying for the SSN");
   		driver.manage().window().maximize();
   		element= driver.findElement(By.xpath("//label[@for='personalPhoneOption']"));
   		
   		   		Log.info("Access Code text box is found");
   		System.out.print("element done");
   	}catch (Exception e){
   		System.out.print("exception");
   		Log.error("access code text box was not found");
   		throw(e);
   		}
   	return element;
    }
 public static WebElement txtBox_PersonalPhone(){

	 element = null;
   	try{
   		System.out.print("trying for the SSN");
   		driver.manage().window().maximize();
   		element= driver.findElement(By.xpath("//input[@id='contactPhone']"));
   	
   		   		Log.info("Access Code text box is found");
   		System.out.print("element done");
   	}catch (Exception e){
   		System.out.print("exception");
   		Log.error("access code text box was not found");
   		throw(e);
   		}
   	return element;
    }
 
 
 public static WebElement txtBox_PersonalPhone_NEW(){

	 element = null;
   	try{
   		System.out.print("trying for the SSN");
   		driver.manage().window().maximize();
   		element= driver.findElement(By.xpath("//input[@id='phoneNumber']"));
   	
   		   		Log.info("Access Code text box is found");
   		System.out.print("element done");
   	}catch (Exception e){
   		System.out.print("exception");
   		Log.error("access code text box was not found");
   		throw(e);
   		}
   	return element;
    }
 public static WebElement TxtBox_Email_Personal(){

	 element = null;
   	try{
   		System.out.print("trying for the SSN");
   		//driver.manage().window().maximize();
   		//element=  driver.findElement(By.xpath("//input[@id='contactEmail']"));
   	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
   		element=driver.findElement(By.xpath("//input[@type='email']"));
   		   		Log.info("Access Code text box is found");
   		System.out.print("element done");
   	}catch (Exception e){
   		System.out.print("exception");
   		Log.error("access code text box was not found");
   		throw(e);
   		}
   	return element;
    }
 
 public static WebElement txtbox_PhoneNumber(){
	 element = null;
   	try{
   		System.out.print("trying for the phone number");
   		//driver.manage().window().maximize();
   		element=driver.findElement(By.xpath("//input[@id='contactPhone']"));
   		   		Log.info("Access Code text box is found");
   		System.out.print("element done");
   	}catch (Exception e){
   		System.out.print("exception");
   		Log.error("access code text box was not found");
   		throw(e);
   		}
   	return element;
    }
 
 public static WebElement txtbox_HireDate(){
	 element = null;
   	try{
   		System.out.print("trying for the last name");
   		driver.manage().window().maximize();
   		element= driver.findElement(By.id("hireDate"));
   		   		Log.info("Access Code text box is found");
   		System.out.print("element done");
   	}catch (Exception e){
   		System.out.print("exception");
   		Log.error("access code text box was not found");
   		throw(e);
   		}
   	return element;
    }
 
 public static WebElement txtbox_AddressLine1(){
	 element = null;
   	try{
   		System.out.print("trying for the DOB");
   		driver.manage().window().maximize();
   		element= driver.findElement(By.id("addressLine1"));
   		   		Log.info("Access Code text box is found");
   		System.out.print("element done");
   	}catch (Exception e){
   		System.out.print("exception");
   		Log.error("access code text box was not found");
   		throw(e);
   		}
   	return element;
    }
 public static WebElement txtbox_City(){
	 element = null;
   	try{
   		System.out.print("trying for the DOB");
   		driver.manage().window().maximize();
   		element= driver.findElement(By.id("city"));
   		   		Log.info("Access Code text box is found");
   		System.out.print("element done");
   	}catch (Exception e){
   		System.out.print("exception");
   		Log.error("access code text box was not found");
   		throw(e);
   		}
   	return element;
    }
 
 public static WebElement txtbox_ZIP(){
	 element = null;
   	try{
   		System.out.print("trying for the DOB");
   		driver.manage().window().maximize();
   		element= driver.findElement(By.id("zipCode"));
   		   		Log.info("Access Code text box is found");
   		System.out.print("element done");
   	}catch (Exception e){
   		System.out.print("exception");
   		Log.error("access code text box was not found");
   		throw(e);
   		}
   	return element;
    }
 public static WebElement txtbox_LOCATION(){
	 element = null;
   	try{
   		System.out.print("trying for the DOB");
   		driver.manage().window().maximize();
   		element= driver.findElement(By.xpath("//input[@title='Please enter your location']"));
   		
   		   		Log.info("Access Code text box is found");
   		System.out.print("element done");
   	}catch (Exception e){
   		System.out.print("exception");
   		Log.error("access code text box was not found");
   		throw(e);
   		}
   	return element;
    }
 
 public static WebElement txtbox_Verify_LOCATION(){
	 element = null;
   	try{
   		System.out.print("trying for the DOB");
   		driver.manage().window().maximize();
   		if (driver.findElements(By.xpath("//input[@title='Please enter your location']")).size()!=0)
   				{
   			element=driver.findElement(By.xpath("//input[@title='Please enter your location']"));
   			element.sendKeys("katy");
   				}
   		
   		   		Log.info("Access Code text box is found");
   		System.out.print("element done");
   	}catch (Exception e){
   		System.out.print("exception");
   		Log.error("access code text box was not found");
   		throw(e);
   		}
   	return element;
    }
 
 public static WebElement txtbox_EMAIL(){
	 element = null;
   	try{
   		System.out.print("trying for the DOB");
   		driver.manage().window().maximize();
   		element= driver.findElement(By.id("email"));
   		   		Log.info("Access Code text box is found");
   		System.out.print("element done");
   	}catch (Exception e){
   		System.out.print("exception");
   		Log.error("access code text box was not found");
   		throw(e);
   		}
   	return element;
    }
 public static WebElement txtbox_password(){
	 element = null;
   	try{
   		System.out.print("trying for the DOB");
   		driver.manage().window().maximize();
   		element= driver.findElement(By.id("password"));
   		   		Log.info("Access Code text box is found");
   		System.out.print("element done");
   	}catch (Exception e){
   		System.out.print("exception");
   		Log.error("access code text box was not found");
   		throw(e);
   		}
   	return element;
    }
 public static WebElement txtbox_UserName(){
	 element = null;
   	try{
   		System.out.print("trying for the DOB");
   		driver.manage().window().maximize();
   		element= driver.findElement(By.xpath("//input[@name='UserName']"));
   		   		Log.info("Access Code text box is found");
   		System.out.print("element done");
   	}catch (Exception e){
   		System.out.print("exception");
   		Log.error("access code text box was not found");
   		throw(e);
   		}
   	return element;
    }
 public static WebElement txtbox_Confirmpassword(){
	 element = null;
   	try{
   		System.out.print("trying for the DOB");
   		driver.manage().window().maximize();
   		element= driver.findElement(By.id("confirmPassword"));
   		   		Log.info("Access Code text box is found");
   		System.out.print("element done");
   	}catch (Exception e){
   		System.out.print("exception");
   		Log.error("access code text box was not found");
   		throw(e);
   		}
   	return element;
    }
 public static WebElement dropdown_State(){
	 element = null;
   	try{
   		System.out.print("trying for the ACCESSCODE");
   		driver.manage().window().maximize();
   		
   		element=driver.findElement(By.id("maritalStatus"));
   		WebElement element = driver.findElement(By.id("selectState"));
   		element.sendKeys("TX");
   		Select oSelect = new Select(element);
   		oSelect.selectByValue("TX");
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

public static WebElement dropdown_SecurityQuestion1(){
	 element = null;
  	try{
  		System.out.print("trying for the ACCESSCODE");
  		driver.manage().window().maximize();
  		
  		element=driver.findElement(By.id("securityQuestion1"));
  		
  		
  		Select oSelect = new Select(element);
  		oSelect.selectByIndex(1);
  		Log.info("Access Code text box is found");
  		System.out.print("element done");
  	}catch (Exception e){
  		System.out.print("exception");
  		Log.error("access code text box was not found");
  		throw(e);
  		}
  	return element;
   }
public static WebElement dropdown_SecurityQuestion2(){
	 element = null;
 	try{
 		System.out.print("trying for the ACCESSCODE");
 		driver.manage().window().maximize();
 		
 		element=driver.findElement(By.id("securityQuestion2"));
 		
 		
 		Select oSelect = new Select(element);
 		oSelect.selectByIndex(2);
 		Log.info("Access Code text box is found");
 		System.out.print("element done");
 	}catch (Exception e){
 		System.out.print("exception");
 		Log.error("access code text box was not found");
 		throw(e);
 		}
 	return element;
  }
public static WebElement dropdown_SecurityQuestion3(){
	 element = null;
	try{
		System.out.print("trying for the ACCESSCODE");
		driver.manage().window().maximize();
		
		element=driver.findElement(By.id("securityQuestion3"));
		
		
		Select oSelect = new Select(element);
		oSelect.selectByIndex(3);
		Log.info("Access Code text box is found");
		System.out.print("element done");
	}catch (Exception e){
		System.out.print("exception");
		Log.error("access code text box was not found");
		throw(e);
		}
	return element;
 }
public static WebElement TxtBoiix_SecurityAnswer1(){
	 element = null;
 	try{
 		System.out.print("trying for the DOB");
 		//driver.manage().window().maximize();
 		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 		element= driver.findElement(By.xpath("//input[@id='securityAnswer1']"));
 	
 		//element= driver.findElement(By.xpath(".//*[@id='contactInfoForm']/div[2]/input[1]"));
 		   		Log.info("Access Code text box is found");
 		System.out.print("element done");
 	}catch (Exception e){
 		System.out.print("exception");
 		Log.error("access code text box was not found");
 		throw(e);
 		}
 	return element;
  }
public static WebElement TxtBoiix_SecurityAnswer2(){
	 element = null;
	try{
		System.out.print("trying for the DOB");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		element= driver.findElement(By.xpath("//input[@id='securityAnswer2']"));
	
		//element= driver.findElement(By.xpath(".//*[@id='contactInfoForm']/div[2]/input[1]"));
		   		Log.info("Access Code text box is found");
		System.out.print("element done");
	}catch (Exception e){
		System.out.print("exception");
		Log.error("access code text box was not found");
		throw(e);
		}
	return element;
 }
public static WebElement TxtBoiix_SecurityAnswer3(){
	 element = null;
	try{
		System.out.print("trying for the DOB");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		element= driver.findElement(By.xpath("//input[@id='securityAnswer3']"));
	
		//element= driver.findElement(By.xpath(".//*[@id='contactInfoForm']/div[2]/input[1]"));
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
  		System.out.print("trying for the DOB");
  		//driver.manage().window().maximize();
  		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
  		element= driver.findElement(By.xpath("//input[@value='Continue']"));
  	
  		//element= driver.findElement(By.xpath(".//*[@id='contactInfoForm']/div[2]/input[1]"));
  		   		Log.info("Access Code text box is found");
  		System.out.print("element done");
  	}catch (Exception e){
  		System.out.print("exception");
  		Log.error("access code text box was not found");
  		throw(e);
  		}
  	return element;
   }



////********FINACIAL PROFILE PAGE****////////////////


}