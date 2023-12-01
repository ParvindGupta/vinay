package com.eva.vtiger.appreusablecode.marketing.InvoiceAccountsearch;

import com.eva.vtiger.utils.WebUtil;

public class InventryInvoiceSearchPage {


	public void SearchBoxSendValueAccount(String randumAccountName) {

		WebUtil.mySendKeys("//input[@name='search_text']", "Search Basic More", randumAccountName);
	}
	public void SearchBoxSendValueContent(String randumContentName) {

		WebUtil.mySendKeys("//input[@name='search_text']", "Search Basic More", randumContentName);
	}
	public void SearchButtonClick() {
		WebUtil.myClick("//input[@name='search']", "Search now Button");
	}

	public void AccountNameClick() {
		WebUtil.myClick("//a[@href='javascript:window.close();']", "Account Name");

	}public void ContentNameClick() {
		WebUtil.myClick("//a[@href='javascript:window.close();']", "Contant Name");

	}
	public void alertAcceptOnAccountSearchPage() {
		WebUtil.popUpAccept();
	}
    public void invaiceSwitchMainPage() {
    	WebUtil.switchToWindowByTitle("admin - Inventory - Invoice - vtiger CRM 5 - Commercial Open Source CRM");
    }
}
