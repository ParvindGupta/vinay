package com.parvindGupta.vtigerautomation.testscripts;

public class MarketingAccountsTestscripts {

	public void verifyVT0001searchAccounts() {
		System.out.println("verifyVT0001Search loginPage testcase Started");
		WebUtility.mylaunchbrowser();
		WebUtility.OpenUrl("http:/localhost:8888");
		WebUtility.mySendKey("//input[@name='user_name']", "user text box", "admin");
		WebUtility.mySendKey("//input[@name='user_password']", "password text box ", "parvind");
		WebUtility.mySelectByText("//Select[@name='login_theme']", "color Them text box ", "woodspice");
		WebUtility.mySelectByText("//Select[@name='login_language']", "Language text box ", "US English");
		WebUtility.myClick("//input[@name='Login']", "Login Botton");
		//		WebUtility.myclose();
		System.out.println("verifyVT0001searchlogin testcaseCompleted");
		System.out.println("**********************************************************************************");
		System.out.println("For marketing *************************************");
		WebUtility.myMouseOver("//a[text()='Marketing']", " MouseOver Marketing");
		WebUtility.myClick("//a[text()='Marketing']", " marketing is click");
		WebUtility.myMouseOver("//td[@class='level2UnSelTab']//a[text()='Accounts']", "MouseOver Accounts");
		WebUtility.myClick("//td[@class='level2UnSelTab']//a[text()='Accounts']", " Accounts is click");
		WebUtility.mySendKey("//input[@class='txtBox']", "Search for text box", "parvind gupta");
		WebUtility.mySelectByText("(//select[@id='bas_searchfield'])[1]", "In text box", "Account Name");
		WebUtility.myClick("//input[@name='submit']", "Search for click text box");
		WebUtility.myGetText("//a[contains(@href,'lView&record=2')]", "Account Name");
		WebUtility.verifyString("parvind gupta", "Parvind Gupta");
	}
	/*verifyVT0002TableRowCountAfterNewAccountCreation................... */
	
	public void verifyVT0002TableRowCountAfterNewAccountCreation() {
		System.out.println("verifyVT0002TableRowCountAfterNewAccountCreation testcase Started");
		WebUtility.mylaunchbrowser();
		WebUtility.OpenUrl("http:/localhost:8888");
		WebUtility.mySendKey("//input[@name='user_name']", "user text box", "admin");
		WebUtility.mySendKey("//input[@name='user_password']", "password text box ", "parvind");
		WebUtility.mySelectByText("//Select[@name='login_theme']", "color Them text box ", "woodspice");
		WebUtility.mySelectByText("//Select[@name='login_language']", "Language text box ", "US English");
		WebUtility.myClick("//input[@name='Login']", "Login Botton");
		WebUtility.myMouseOver("//a[text()='Marketing']", "MouseOver Marketing Tab");
		WebUtility.myClick("//a[text()='Marketing']", "marketing Link is click");
		WebUtility.myClick("//td[@class='level2UnSelTab']//a[text()='Accounts']", "Accounts is click");
		
	}
}
