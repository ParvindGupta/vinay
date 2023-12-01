package com.eva.vtiger.testscripts;

import com.eva.vtiger.appreusablecode.common.CommonReusableCodes;
import com.eva.vtiger.appreusablecode.marketing.Countacts.MarketingCountactsCreateCountactsPage;
import com.eva.vtiger.appreusablecode.marketing.Countacts.MarketingCountactsLandingPage;
import com.eva.vtiger.appreusablecode.marketing.Inventory.InventoryInvoiceCreateInvoicePage;
import com.eva.vtiger.appreusablecode.marketing.Inventory.InventoryInvoiceLandingPage;
import com.eva.vtiger.appreusablecode.marketing.InvoiceAccountsearch.InventryInvoiceSearchPage;
import com.eva.vtiger.appreusablecode.marketing.accounts.MarketingAccountDetailsPage;
import com.eva.vtiger.appreusablecode.marketing.accounts.MarketingAccountsCreateAccountPage;
import com.eva.vtiger.appreusablecode.marketing.accounts.MarketingAccountsLandingPage;
import com.eva.vtiger.utils.WebUtil;

public class InventoryInvoiceTestScripts {


	public void vt0027VerifyAccountAndContactOnInvoicePage(){
		CommonReusableCodes crc=new CommonReusableCodes();
		crc.login();
		crc.gotoMarketingAccounts();
		MarketingAccountsLandingPage accountPage=new MarketingAccountsLandingPage();
		accountPage.clickCreateAccountButton();
		MarketingAccountsCreateAccountPage createpage=new MarketingAccountsCreateAccountPage();
		String randumAccountName = createpage.enterAndSaveCreateAccountForm();
		crc.gotoMarketingContacts();
		MarketingCountactsLandingPage contactpage=new MarketingCountactsLandingPage();
		contactpage.clickCreateCountactsButton();
		MarketingCountactsCreateCountactsPage CreateCountactPage=new MarketingCountactsCreateCountactsPage();
		CreateCountactPage.enterAndSaveCreateCountantForm();
		crc.gotoInventoryInvoice();
		InventoryInvoiceLandingPage clickInvoiceButton=new InventoryInvoiceLandingPage();
		clickInvoiceButton.clickCreateInvoiceButton();
		InventoryInvoiceCreateInvoicePage selectButtonClickAccount=new InventoryInvoiceCreateInvoicePage();
		selectButtonClickAccount.enterClickAccountNameInvoiceSelectButtom();
		WebUtil.switchToWindowByTitle(" ");
		InventryInvoiceSearchPage searchPage=new InventryInvoiceSearchPage();
		searchPage.SearchBoxSendValueAccount(randumAccountName);
		searchPage.SearchButtonClick();
		searchPage.AccountNameClick();
		searchPage.alertAcceptOnAccountSearchPage();
		searchPage.invaiceSwitchMainPage();
		
		
		selectButtonClickAccount.enterClickCountactNameInvoiceSelectButtom();
		WebUtil.switchToWindowByTitle("");
		InventoryInvoiceCreateInvoicePage selectButtonClickContant=new InventoryInvoiceCreateInvoicePage();
		//selectButtonClickContant. enterClickCountactNameInvoiceSelectButtom();
		searchPage.SearchBoxSendValueContent(randumAccountName);
		searchPage.SearchButtonClick();
		searchPage.ContentNameClick();
		searchPage.alertAcceptOnAccountSearchPage();
	}


}
