package com.eva.vtiger.appreusablecode.marketing.accounts;

import com.eva.vtiger.utils.WebUtil;

public class MarketingAccountsCreateAccountPage {

	public String enterAndSaveCreateAccountForm() {
	    String randumAccountName=WebUtil.getRandomName();
		WebUtil.mySendKeys("//input[@name='accountname']", "Account Name Textbox", randumAccountName);
		WebUtil.mySendKeys("//input[@name='phone']", "Phone Textbox", "572893892");
		WebUtil.mySendKeys("//input[@name='fax']", "fax Textbox", "mrnarenderkumar@faxid432.com");
		WebUtil.mySendKeys("//input[@name='email1']", "email Textbox", "mrnarenderkumar12@gmail.com");
		WebUtil.mySendKeys("//textarea[@ name='bill_street']", "Billing Addresh Textbox", "Narottampur urf Chamrupatti");
		WebUtil.mySendKeys("//input[@name='bill_city']", "Billing city Textbox", "Bhadohi");
		WebUtil.mySendKeys("//input[@name='bill_code']", "billing code Textbox", "221406");
        WebUtil.myClick("//b[text()='Description Information']/preceding::input[@title=\"Save [Alt+S]\"]", "Save Button");
       WebUtil.myThread(2000);
        return randumAccountName;
	}
	
	
	
}
