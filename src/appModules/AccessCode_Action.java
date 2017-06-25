package appModules;

import org.testng.Reporter;

import pageObjects.AccessCodeEntry_Page;
import pageObjects.BaseClass;
import pageObjects.CheckOut_Page;
import utility.Constant;
import utility.ExcelUtils;
import utility.Utils;


public class AccessCode_Action {
	// I could have created a Function for it but I keep calculations in Functions and test steps in Module Actions
		 // It could have been avoided and simply put these steps in Test Case, it depends totally on you, everybody has their own choice
		 public static void Execute(int iTestCaseRow) throws Exception{
			 
			// This is to get the Product name on the Check Out page with using getText() method 
			// CheckOut_Page.sProductName is a static variable and can be used anywhere with its class name
			// Once some text is stored in this variable can be used later in any other class 
			 String sAccessCode = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_AccessCode);
			 System.out.println("this is my access code "+sAccessCode);
	     	AccessCodeEntry_Page.txtbox_AccessCode().sendKeys(sAccessCode);     	
	     
	     	
	     	
	     	// Clicking on the Continue button on the Check Out page
	     	AccessCodeEntry_Page.btn_FindPlan().click();
		 }

}
