package pageObjects;

import java.util.concurrent.TimeUnit;

//import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utility.Log;

public class PrimaryBeneficiary_Page extends BaseClass  {
	private static WebElement element;
	public static String sProductName;
	public static String sProductPrice;
 public PrimaryBeneficiary_Page(WebDriver driver){
	super(driver);
	}
 

 public static WebElement txtbox_Percentage(){
	 element = null;
   	try{
   		System.out.print("trying for the element");
   	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
   		driver.manage().window().maximize();
   		
   		//element= driver.findElement(By.xpath("/html/body/div[2]/div[1]/main/div[1]/div[1]/div/form/div/div[1]/div/input"));
   		element=  driver.findElement(By.xpath("//input[@title='Please enter a valid percentage']"));
   		
   		Log.info("Access Code text box is found");
   		System.out.print("element done");
   	}catch (Exception e){
   		System.out.print("exception");
   		Log.error("access code text box was not found");
   		throw(e);
   		}
   	return element;
    }
 public static WebElement dropdown_BeneType(){
	 element = null;
   	try{
   		System.out.print("trying for the ACCESSCODE");
   		driver.manage().window().maximize();

  element = driver.findElement(By.xpath("//select[@title='Please select a relationship']"));
   		//element.sendKeys("MARRIED");
  Select oSelect = new Select(element);
	oSelect.selectByValue("SPOUSE");	
   	
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
   		System.out.print("trying for the element");
   	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
   		driver.manage().window().maximize();
   		
   		//element= driver.findElement(By.xpath("/html/body/div[2]/div[1]/main/div[1]/div[1]/div/form/div/div[1]/div/input"));
   		element=  driver.findElement(By.xpath("//input[@title='Please enter first name']"));
   		
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
   		System.out.print("trying for the element");
   	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
   		driver.manage().window().maximize();
   		
   		//element= driver.findElement(By.xpath("/html/body/div[2]/div[1]/main/div[1]/div[1]/div/form/div/div[1]/div/input"));
   		element=  driver.findElement(By.xpath("//input[contains(@title,'Please enter last name')]"));
   		
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
   		//element= driver.findElement(By.xpath("/html/body/div[2]/div[1]/main/div[1]/div[1]/div/form/div/div[2]/input"));
   		element= driver.findElement(By.name("findPlan"));
   		Log.info("Continue button is found on the Check Out Page");
   	}catch (Exception e){
   		Log.error("Continue button on Check Out page is not found");
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

 
 public static WebElement btn_Skip(){
	 element = null;
   	try{
   		//element= driver.findElement(By.xpath("/html/body/div[2]/div[1]/main/div[1]/div[1]/div/form/div/div[2]/input"));
   		element= driver.findElement(By.xpath("//input[@id='btnContinueAction']"));
   		Log.info("Continue button is found on the Check Out Page");
   	}catch (Exception e){
   		Log.error("Continue button on Check Out page is not found");
   		throw(e);
   		}
   	return element;
    }

 
}


