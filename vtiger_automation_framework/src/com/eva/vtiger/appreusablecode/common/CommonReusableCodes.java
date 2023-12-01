package com.eva.vtiger.appreusablecode.common;

import com.eva.vtiger.utils.WebUtil;

public class CommonReusableCodes {

	public void login() {
		WebUtil.launchBrowser();
		WebUtil.openUrl("http://localhost:8888");
		WebUtil.mySendKeys("//input[@name='user_name']", "userName","admin");
		WebUtil.mySendKeys("//input[@name='user_password']", "password","parvind");
		WebUtil.myClick("//input[@title='Login [Alt+L]']", "login button");
	}
	public void invalidLogin() {
		WebUtil.launchBrowser();
		WebUtil.mySendKeys("//input[@name='user_name']", "userName","PArvind");
		WebUtil.mySendKeys("//input[@name='user_password']", "password","Gupta");
		WebUtil.myClick("//input[@title='Login [Alt+L]']", "login button");
		
	}
	public void logOut() {
		WebUtil.myClick("//a[text()='Sign Out']", "sign out");
	}
	//	public void clickSubLinkOfLink(String linkName,String subLinkName) {
	//		WebUtil.mouseMoveToElement("//a[text()='"+linkName+"']", linkName);
	//		WebUtil.myClick("//a[text()='"+linkName+"']", linkName);
	//		WebUtil.myClick("//a[text()='"+subLinkName+"']", subLinkName);
	//	}


	public void gotoMarketingContacts() {

		WebUtil.mouseMoveToElement("//a[text()='Marketing']", "Marketing Link");
		WebUtil.myClick("//div[@id='Marketing_sub']//a[text()='Contacts']", "Contacts Link");

	}
	public void gotoMarketingAccounts() {

		WebUtil.mouseMoveToElement("//a[text()='Marketing']", "Marketing Link");
		WebUtil.myClick("//div[@id='Marketing_sub']//a[text()='Accounts']", "Accounts Link");

	}
	public void gotoInventoryInvoice() {

		WebUtil.mouseMoveToElement("//a[text()='Inventory']", "Invoice Link");
		WebUtil.myClick("//div[@id='Inventory_sub']//a[text()='Invoice']", "Invoice Link");

	}

	public  void creatNew(String subLinkName) {

		WebUtil.myClick("//img[contains(@title,'Create ')]", "creat New "+subLinkName);
	}
	public void saveButton(String uniqueXpathBetweenTwoSaveButton) {
		WebUtil.myClick(uniqueXpathBetweenTwoSaveButton+"/preceding::input[@title='Save [Alt+S]']", "");

	}
	public void searchForElement(String expAccountName,String searchTypeAttributeValue) {
		WebUtil.mySendKeys("//input[@name='search_text']", "search for", expAccountName);
		WebUtil.selectByValueAttribute("//div[@id='basicsearchcolumns_real']//select[@id='bas_searchfield']", "select type", searchTypeAttributeValue);
		WebUtil.myClick("//input[@name='submit']", "search button");

	}
	public void searchForElement(int number,String searchTypeAttributeValue) {
		WebUtil.mySendKeys("//input[@name='search_text']", "search for",""+number+"");
		WebUtil.selectByValueAttribute("//div[@id='basicsearchcolumns_real']//select[@id='bas_searchfield']", "select type", searchTypeAttributeValue);
		WebUtil.myClick("//input[@name='submit']", "search button");

	}



}
