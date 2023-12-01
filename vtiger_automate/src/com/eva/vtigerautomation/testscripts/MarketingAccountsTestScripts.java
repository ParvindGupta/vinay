package com.eva.vtigerautomation.testscripts;


import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//  Priority   -  Priortize -  Set 
public class MarketingAccountsTestScripts {

	public void verifyVT001SearchAccounts()  {

		System.out.println("verifyVT001SearchAccounts TestCase Started");
		WebUtil.launchBrowser();
		WebUtil.openUrl("http://localhost:8888");
		WebUtil.mySendKeys("//input[@name='user_name']", "userName Textbox", "admin");
		WebUtil.mySendKeys("//input[@name='user_password']", "Password Textbox", "parvind");
		WebUtil.myClick("//input[@name='Login']","Login Button");
		WebUtil.myClick("//a[text()='Marketing']", "Marketing Link");
		String expectedText="Marketing > Campaigns";
		String actualText=WebUtil.myGetText("//td[@class='moduleName']", "Marketing Campaign Header");
		WebUtil.verifyString(actualText, expectedText);
	}

	public void verifyVT002CreateAccount() {
		/// BrowserLaunch
		// Login
		// Create Account
		/// verify Created Account
		///  Logout 
		///  browser close
	}

	public void verifyVT003DeleteAccount() {
		/// BrowserLaunch
		// Login
		// Create Account
		/// verify Created Account
		///  Logout 
		///  browser close
	}

	public void verifyVT023TableRowCountAfterNewAccountCreation() throws InterruptedException {

		System.out.println("verifyVT023TableRowCountAfterNewAccountCreation TestCase Started");
		WebUtil.launchBrowser();
		WebUtil.openUrl("http://localhost:8888");
		WebUtil.mySendKeys("//input[@name='user_name']", "UserName ", "admin");
		WebUtil.mySendKeys("//input[@name='user_password']", "password ", "parvind");
		WebUtil.selectByText("//Select[@name='login_theme']", "Color Dropdown", "bluelagoon");
		WebUtil.selectByText("//Select[@name='login_language']", "language Dropdown", "US English");
		WebUtil.myClick("//input[@name='Login']", "Login Button");
		WebUtil.mouseOver("//a[text()='Marketing']", "Marketing Tab");
		WebUtil.myClick("//div[@id='Marketing_sub']//a[text()='Accounts']", "Accounts Link");

//		int rowCountBeforeAccountCreation = WebUtil.getTableRowCount("//table[@class='lvt small']","Account Link");
        
//		WebUtil.myClick("//img[@title='Create Account...']", "Create Account Button");
//		int num = 1 ;
//        for(int i =0 ; i<10 ; i++) {
//        	num ++ ;
//	     }
//        WebUtil.mySendKeys("//input[@name='accountname']", "Account name Textbox", "Shiv Babu10"+num);
//		WebUtil.mySendKeys("//input[@name='phone']", "Phone ", "9546066847");
//		WebUtil.mySendKeys("//input[@name='email1']", "Email ", "surajsingh@gmail.com");
//		WebUtil.mySendKeys("//textarea[@name='bill_street']", "Biling Address ", "Siyarha mondh bhadohi UP 221406");
//		WebUtil.myClick("(//input[@name='button'])[1]", "Save Button");
//		Thread.sleep(2000);
//		WebUtil.mouseOver("//a[text()='Marketing']", "Marketing Tab");
//        WebUtil.myClick("//div[@id='Marketing_sub']//a[text()='Accounts']", "Accounts Link");
//
//		int rowCountAfterAccountCreation = WebUtil.getTableRowCount("//table[@class='lvt small']","Account Link");
//
//		if(rowCountAfterAccountCreation==rowCountBeforeAccountCreation+1) {
//			System.out.println("Passed");
//		}else {
//			System.out.println("Failed");
//		} 
		List<String> listColumName=WebUtil.getTableColumnNamesList("//table[@class='lvt small']", "Account Table");
		for (String columnName : listColumName) {
			System.out.println(columnName);
		}
	    int count =	WebUtil.getColumnNumberByColumnName("//table[@class='lvt small']", "Account Table", "billing City");
        System.out.println(count);
		List<String> rowDataList = WebUtil.getRowDataListByRowNumber("//table[@class='lvt small']", "Account Table", 5);
        for(String rowData : rowDataList) {
        	System.out.println(rowData);
        }

	}




}
