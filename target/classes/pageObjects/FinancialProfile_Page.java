package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utility.Log;

public class FinancialProfile_Page extends BaseClass  {
	private static WebElement element;
	public static String sProductName;
	public static String sProductPrice;
 public FinancialProfile_Page(WebDriver driver){
	super(driver);
	}
 
 
 
 public static WebElement btn_Continue(){
	 element = null;
   	try{
     	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
   		//element= driver.findElement(By.xpath("/html/body/div[2]/div[1]/main/div[1]/div[1]/div/form/div/div[2]/input"));
   		element= driver.findElement(By.xpath("//input[@value='Continue']"));
   		Log.info("Continue button is found on the Check Out Page");
   	}catch (Exception e){
   		Log.error("Continue button on Check Out page is not found");
   		throw(e);
   		}
   	return element;
    }

 public static WebElement FinProfDropDn_Objectives(){
	 element = null;
  	try{
  		System.out.print("trying for the ACCESSCODE");
  		driver.manage().window().maximize();
  		
  	
  	 element = driver.findElement(By.xpath("//select[@name='InvestmentObjectiveCode']"));
  		//element.sendKeys("TX");
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

 public static WebElement FinProfDropDn_RiskProfile(){
	 element = null;
  	try{
  		System.out.print("trying for the ACCESSCODE");
  		//driver.manage().window().maximize();
  		
  		
  		 element = driver.findElement(By.xpath("//select[contains(@id,'riskProfileOption')]"));
  		//element.sendKeys("TX");
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

 public static WebElement FinProfDropDn_HouseholdIncome(){
	 element = null;
  	try{
  		System.out.print("trying for the ACCESSCODE");
  		//driver.manage().window().maximize();
  		
  		//element=driver.findElement(By.id("maritalStatus"));
  		element = driver.findElement(By.xpath("//select[@name='HouseHoldIncomeCode']"));
  		//element.sendKeys("TX");
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
 //

 public static WebElement FinProfDropDn_NetWorth(){
	 element = null;
  	try{
  		System.out.print("trying for the ACCESSCODE");
  		//driver.manage().window().maximize();
  		
  		//element=driver.findElement(By.id("maritalStatus"));
  		element = driver.findElement(By.xpath("//select[@name='NetWorthCode']"));
  		//element.sendKeys("TX");
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
 
 public static WebElement FinProfDropDn_TaxBracket(){
	 element = null;
  	try{
  		System.out.print("trying for the ACCESSCODE");
  		//driver.manage().window().maximize();
  		
  		//element=driver.findElement(By.id("maritalStatus"));
  		 element = driver.findElement(By.xpath("//select[@id='TaxBracket']"));
  		//element.sendKeys("TX");
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
 //;

 public static WebElement FinProfDropDn_MutualFund(){
	 element = null;
  	try{
  		System.out.print("trying for the ACCESSCODE");
  		//driver.manage().window().maximize();
  		
  		//element=driver.findElement(By.id("maritalStatus"));
  		 element = driver.findElement(By.xpath("//select[@name='PurchasedOtherSecurities']"));
  		//element.sendKeys("TX");
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
 
}

