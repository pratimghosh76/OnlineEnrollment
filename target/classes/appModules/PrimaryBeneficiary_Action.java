package appModules;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import pageObjects.AboutYou_Page;
import pageObjects.AccessCodeEntry_Page;
import pageObjects.BaseClass;
import pageObjects.CheckOut_Page;
import pageObjects.PrimaryBeneficiary_Page;
import utility.Constant;
import utility.ExcelUtils;
import utility.Utils;
import pageObjects.*;


public class PrimaryBeneficiary_Action {
	// I could have created a Function for it but I keep calculations in Functions and test steps in Module Actions
		 // It could have been avoided and simply put these steps in Test Case, it depends totally on you, everybody has their own choice
		 public static void Execute(int iTestCaseRow) throws Exception{
			 
			// This is to get the Product name on the Check Out page with using getText() method 
			// CheckOut_Page.sProductName is a static variable and can be used anywhere with its class name
			// Once some text is stored in this variable can be used later in any other class 
			 String sAccessCode = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_AccessCode);
			 System.out.println("this is my access code "+sAccessCode);
			 
			 
			 //1st about you
				
			PrimaryBeneficiary_Page.dropdown_BeneType().click();
			PrimaryBeneficiary_Page.txtbox_Percentage().sendKeys("100");
			PrimaryBeneficiary_Page.txtbox_FirstName().sendKeys("amrita");
			PrimaryBeneficiary_Page.txtbox_LastName().sendKeys("ghosh");
			PrimaryBeneficiary_Page.btn_Continue().click();
			
			PrimaryBeneficiary_Page.btn_Skip().click();
			////if (driver.findElements(By.xpath("//input[@name='UserName']")).size()!=0) {
			/*String FirstName=ExcelUtils.getCellData(iTestCaseRow, Constant.Col_FirstName);
			
			AboutYou_Page.txtbox_UserName().sendKeys(FirstName+"1980");
			AboutYou_Page.txtbox_password().sendKeys("Umakanta95");
			AboutYou_Page.txtbox_Confirmpassword().sendKeys("Umakanta95");
			
			AboutYou_Page.dropdown_SecurityQuestion1().click();
			AboutYou_Page.TxtBoiix_SecurityAnswer1().sendKeys("answer1");
			
			AboutYou_Page.dropdown_SecurityQuestion2().click();
			AboutYou_Page.TxtBoiix_SecurityAnswer2().sendKeys("answer2");
			 
			AboutYou_Page.dropdown_SecurityQuestion3().click();
			AboutYou_Page.TxtBoiix_SecurityAnswer3().sendKeys("answer3");
			AboutYou_Page.btn_Continue().click()*/;
			
		 }

}
