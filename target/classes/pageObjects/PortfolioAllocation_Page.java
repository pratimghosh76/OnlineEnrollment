package pageObjects;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

public class PortfolioAllocation_Page extends BaseClass  {
	private static WebElement element;
	public static String sProductName;
	public static String sProductPrice;
 public PortfolioAllocation_Page(WebDriver driver){
	super(driver);
	}
 
 
 
 public static WebElement btn_Continue(){
	 element = null;
   	try{
     	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
   		//element= driver.findElement(By.xpath("/html/body/div[2]/div[1]/main/div[1]/div[1]/div/form/div/div[2]/input"));
   		element=driver.findElement(By.xpath("//input[@value='Continue']"));
   		Log.info("Continue button is found on the Check Out Page");
   	}catch (Exception e){
   		Log.error("Continue button on Check Out page is not found");
   		throw(e);
   		}
   	return element;
    }

 public static WebElement Option_DoItYourself(){
	 element = null;
   	try{
     	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
   		//element= driver.findElement(By.xpath("/html/body/div[2]/div[1]/main/div[1]/div[1]/div/form/div/div[2]/input"));
   		//element= driver.findElement(By.xpath("//label[@for='fund-radioOption1']"));
     	
   		element= driver.findElement(By.xpath(".//*[@id='frmSelectionPath']/div[1]/div[1]/div/div[1]/label"));
   		
   		Log.info("Continue button is found on the Check Out Page");
   	}catch (Exception e){
   		Log.error("Continue button on Check Out page is not found");
   		throw(e);
   		}
   	return element;
    }


	public static WebElement Option_DoItYourself_click(){
		 element = null;
	   	try{
	     	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   		//element= driver.findElement(By.xpath("/html/body/div[2]/div[1]/main/div[1]/div[1]/div/form/div/div[2]/input"));
	   		//element= driver.findElement(By.xpath("//label[@for='fund-radioOption1']"));
	     	boolean bValue = false;
	     	//List radioGrp = driver.findElements(By.name("xxxxxxxx"));
	     	//vValue=radioGrp.get(0).
	   		element= driver.findElement(By.xpath(".//*[@id='frmSelectionPath']/div[1]/div[1]/div/div[1]/label"));
	   		
	   		Log.info("Continue button is found on the Check Out Page");
	   	}catch (Exception e){
	   		Log.error("Continue button on Check Out page is not found");
	   		throw(e);
	   		}
	   	return element;
	    }
	
	
	
	
 public static WebElement TxtBx_FxdIncome_0(){
	 element = null;
   	try{
     	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
   		//element= driver.findElement(By.xpath("/html/body/div[2]/div[1]/main/div[1]/div[1]/div/form/div/div[2]/input"));
   		element=  driver.findElement(By.xpath("//input[@id='fixed income-input_0']"));
   		
   		Log.info("Continue button is found on the Check Out Page");
   	}catch (Exception e){
   		Log.error("Continue button on Check Out page is not found");
   		throw(e);
   		}
   	return element;
    }
 public static WebElement TxtBx_FxdIncome_1(){
	 element = null;
   	try{
     	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
   		//element= driver.findElement(By.xpath("/html/body/div[2]/div[1]/main/div[1]/div[1]/div/form/div/div[2]/input"));
   		element=  driver.findElement(By.xpath("//input[@id='fixed income-input_1']"));
   		Log.info("Continue button is found on the Check Out Page");
   	}catch (Exception e){
   		Log.error("Continue button on Check Out page is not found");
   		throw(e);
   		}
   	return element;
    }
 
}

