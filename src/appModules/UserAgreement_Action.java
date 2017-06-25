package appModules;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import pageObjects.AccessCodeEntry_Page;
import pageObjects.BaseClass;
import pageObjects.CheckOut_Page;
import pageObjects.UserAgreement_Page;
import utility.Constant;
import utility.ExcelUtils;
import utility.Utils;


public class UserAgreement_Action extends BaseClass {
	public UserAgreement_Action(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	// I could have created a Function for it but I keep calculations in Functions and test steps in Module Actions
		 // It could have been avoided and simply put these steps in Test Case, it depends totally on you, everybody has their own choice
		 public static void Execute(int iTestCaseRow) throws Exception{
			 
			// This is to get the Product name on the Check Out page with using getText() method 
			// CheckOut_Page.sProductName is a static variable and can be used anywhere with its class name
			// Once some text is stored in this variable can be used later in any other class 
			 String sAccessCode = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_AccessCode);
			 System.out.println("this is my access code "+sAccessCode);
			 UserAgreement_Page.btn_Continue().click(); 
			 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    		List<WebElement> els = driver.findElements(By.xpath("//input[@type='checkbox']"));
	    	 	for ( WebElement el : els ) {
	    	 	    if ( !el.isSelected() ) {
	    	 	        el.click();
	    	 	    }
	    	 	}
	  
	     	UserAgreement_Page.btn_Continue().click();
	     	//UserAgreement_Page.btn_CompleteEnrollment().click();
		 }

}
