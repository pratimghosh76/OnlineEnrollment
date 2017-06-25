package appModules;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import pageObjects.AboutYou_Page;
import pageObjects.AccessCodeEntry_Page;
import pageObjects.BaseClass;
import pageObjects.CheckOut_Page;
import pageObjects.FinancialProfile_Page;
import utility.Constant;
import utility.ExcelUtils;
import utility.Utils;


public class FinancialProfile_Action {
	// I could have created a Function for it but I keep calculations in Functions and test steps in Module Actions
		 // It could have been avoided and simply put these steps in Test Case, it depends totally on you, everybody has their own choice
		 public static void Execute(int iTestCaseRow) throws Exception{
			 
			// This is to get the Product name on the Check Out page with using getText() method 
			// CheckOut_Page.sProductName is a static variable and can be used anywhere with its class name
			// Once some text is stored in this variable can be used later in any other class 
			 String sAccessCode = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_AccessCode);
			 System.out.println("this is my access code "+sAccessCode);
			 
			if (FinancialProfile_Page.FinProfDropDn_RiskProfile().isDisplayed()) {
		FinancialProfile_Page.FinProfDropDn_RiskProfile().click();
		FinancialProfile_Page.FinProfDropDn_Objectives().click();
		FinancialProfile_Page.FinProfDropDn_NetWorth().click();
		FinancialProfile_Page.FinProfDropDn_HouseholdIncome().click();
		FinancialProfile_Page.FinProfDropDn_TaxBracket().click();
		FinancialProfile_Page.FinProfDropDn_MutualFund().click();
		FinancialProfile_Page.btn_Continue().click();	
			}
			else
			{
				System.out.println("profile page not there");
			}
			}
			
			
	
			 
		 }


