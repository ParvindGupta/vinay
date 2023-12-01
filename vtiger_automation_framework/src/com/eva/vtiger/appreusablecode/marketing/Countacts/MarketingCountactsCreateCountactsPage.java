package com.eva.vtiger.appreusablecode.marketing.Countacts;

import com.eva.vtiger.utils.WebUtil;

public class MarketingCountactsCreateCountactsPage {

	
	
	public String enterAndSaveCreateCountantForm(){
		String randumContantsName=WebUtil.getRandomName();
		WebUtil.mySendKeys("//input[@name='firstname']", "first Name Textbox",randumContantsName);
		WebUtil.mySendKeys("//input[@name='lastname']", "LastName Textbox", "gupta");
		WebUtil.mySendKeys("//input[@name='mobile']", "Mobile Texbox", "9956891182");
		WebUtil.mySendKeys("//input[@name='fax']", "fax Textbox", "mahajangupta99@gmail.com");
		WebUtil.mySendKeys("//input[@name='email']", "email Textbox", "mahajangupta99@gmail.com");
		WebUtil.mySendKeys("//textarea[@name='mailingstreet']", "Mailing Street Textbox", "Narottampur mondh Bazar");
		WebUtil.mySendKeys("//input[@name='mailingcity']", "Mailing city Textbox", "Bhadohi");
		WebUtil.mySendKeys("//input[@name='mailingcountry']", "Mailing country Textbox", "INDIA");
        WebUtil.myClick("//b[text()='Description Information']/preceding::input[@title='Save [Alt+S]']", "Save Button");
	    return randumContantsName;
	}
	
	
	
	
}
