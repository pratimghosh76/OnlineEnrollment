package appModules;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import pageObjects.AboutYou_Page;
import pageObjects.AccessCodeEntry_Page;
import pageObjects.BaseClass;
import pageObjects.CheckOut_Page;
import utility.Constant;
import utility.ExcelUtils;
import utility.Utils;


public class AboutYou_Action {
	// I could have created a Function for it but I keep calculations in Functions and test steps in Module Actions
		 // It could have been avoided and simply put these steps in Test Case, it depends totally on you, everybody has their own choice
		 public static void Execute(int iTestCaseRow) throws Exception{
			 
			// This is to get the Product name on the Check Out page with using getText() method 
			// CheckOut_Page.sProductName is a static variable and can be used anywhere with its class name
			// Once some text is stored in this variable can be used later in any other class 
			 String sAccessCode = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_AccessCode);
			 System.out.println("this is my access code "+sAccessCode);
			 
			 
			 //1st about you
				
			 AboutYou_Page.dropdown_MaritalStat().click();
						 
			 AboutYou_Page.Radio_Male().click();
			
			 AboutYou_Page.Radio_Male().click();
			 AboutYou_Page.txtbox_HireDate().click();
			 AboutYou_Page.txtbox_HireDate().sendKeys("11112011");
			 AboutYou_Page.txtbox_AddressLine1().sendKeys("2496 s mason rd");
			 AboutYou_Page.txtbox_City().sendKeys("sugarland");
			 AboutYou_Page.dropdown_State().click();
			 
			 AboutYou_Page.txtbox_ZIP().sendKeys("66322");
			 //AboutYou_Page.txtbox_LOCATION().sendKeys("katy");
			 //AboutYou_Page.txtbox_EMAIL().sendKeys("partha.ghosh@valic.com");
			// AboutYou_Page.txtbox_password().sendKeys("Umakanta95");
			 //AboutYou_Page.txtbox_Confirmpassword().sendKeys("Umakanta95");
			 //AboutYou_Page.dropdown_SecurityQuestion1().click();//
	     	// Clicking on the Continue button on the Check Out page
		
			 
			 //second about you
			 AboutYou_Page.Radio_Email_Personal().click();
			 //AboutYou_Page.Radio_Email_Personal().sendKeys(Keys.TAB);
			 
			 AboutYou_Page.TxtBox_Email_Personal().clear();
			 AboutYou_Page.TxtBox_Email_Personal().sendKeys("partha.ghosh@symphony.com");
			 
			 AboutYou_Page.Radio_PersonalPhone().click();
			// AboutYou_Page.txtbox_PhoneNumber().click();
			 AboutYou_Page.txtbox_PhoneNumber().clear();
			 AboutYou_Page.txtbox_PhoneNumber().sendKeys("9139134444");
			AboutYou_Page.btn_Continue().click();
			 
			
			 
			
			 
		 }

}
