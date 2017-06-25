package appModules;
import org.testng.Reporter;

import pageObjects.AccessCodeEntry_Page;
import pageObjects.BaseClass;
import pageObjects.CheckOut_Page;
import pageObjects.LetsStartPlan_Page;
import utility.Constant;
import utility.ExcelUtils;
import utility.Utils;

public class LetsStartPlan_Action {
	public static void Execute(int iTestCaseRow) throws Exception{
		 
		// This is to get the Product name on the Check Out page with using getText() method 
		// CheckOut_Page.sProductName is a static variable and can be used anywhere with its class name
		// Once some text is stored in this variable can be used later in any other class 
		 String sAccessCode = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_AccessCode);
		 String sSSN = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_SSN);
		 String sFirstName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_FirstName);
		 String sLastName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_LastName);
		 String sDOB = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_DOB);
     	LetsStartPlan_Page.txtbox_AccessCode().sendKeys(sAccessCode);
		 	LetsStartPlan_Page.txtbox_SSN().click();
       	LetsStartPlan_Page.txtbox_SSN().sendKeys(sSSN);
       	LetsStartPlan_Page.txtbox_FirstName().sendKeys(sFirstName);
    	LetsStartPlan_Page.txtbox_LastName().sendKeys(sLastName);
    	LetsStartPlan_Page.txtbox_DOB().click();
    	LetsStartPlan_Page.txtbox_DOB().sendKeys(sDOB);
    	
     	// Clicking on the Continue button on the Check Out page
    	LetsStartPlan_Page.btn_FindPlan().click();
	 }
}
