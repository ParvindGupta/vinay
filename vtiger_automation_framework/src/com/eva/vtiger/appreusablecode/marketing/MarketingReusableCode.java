package com.eva.vtiger.appreusablecode.marketing;

import com.eva.vtiger.utils.WebUtil;

public class MarketingReusableCode {

	public String newCreateMarketingAccount(String expAccountName) {
		WebUtil.mySendKeys("//input[@name='accountname']", "Account name",expAccountName);
		WebUtil.mySendKeys("//input[@name='website']", "webSite name", ""+expAccountName+".er@gmail.com");
		WebUtil.mySendKeys("//input[@id='phone']", "phone number", "8947863734");
		WebUtil.mySendKeys("//textarea[@name='bill_street']", "billing address", "prayagraj");
		WebUtil.mySendKeys("//input[@id='bill_city']", "city", "kaushambi");
		WebUtil.mySendKeys("//input[@id='bill_state']", "state", "utter pradesh");
		WebUtil.mySendKeys("//input[@id='bill_country']", "country", "india");
		WebUtil.mySendKeys("//textarea[@name='description']", "description", "Do work hard util you do");
		return expAccountName;
	}
	public String newCreateMarketingContacts(String expContactsName) {
		WebUtil.selectByValueAttribute("//select[@name='salutationtype']", "sir Name", "Mr.");	
		WebUtil.mySendKeys("//input[@name='firstname']", "first Name", expContactsName);
		WebUtil.mySendKeys("//input[@name='lastname']", "last Name", "EVA");
		WebUtil.mySendKeys("//input[@name='phone']", "office phone", "8764564654");
		WebUtil.mySendKeys("//input[@name='email']", "email Name", ""+expContactsName+".tester@qa.com");
		WebUtil.mySendKeys("//textarea[@name='mailingstreet']", "mailing street name", "Sant Ravidash nagar near khamharia village");
		WebUtil.mySendKeys("//input[@name='mailingpobox']", "mailing post office ", "bhadohi");
		WebUtil.mySendKeys("//input[@name='mailingcity']", "mailing post city ", "varanashi");
		WebUtil.mySendKeys("//input[@name='mailingstate']", "mailing state ", "utter pradesh");
		WebUtil.mySendKeys("//input[@name='mailingcountry']", "mailing country", "india");
		WebUtil.myClick(" //b[text()='Copy Other Address']/following::input[@name='cpy']", "Copy mailing Address");
		WebUtil.myClick("//textarea[@name='description']", "Copy mailing Address");
		WebUtil.mySendKeys("//textarea[@name='description']", "description name ", "“Set your goals high, and don't stop till you get there.”");
		WebUtil.myClick("//textarea[@name='description']", "Copy mailing Address");
		return expContactsName;
	}
	public String newCreatMarketingLeads(String expLeadsName) {
		WebUtil.selectByValueAttribute("//select[@name='salutationtype']", "firstName", "Mr.");
		WebUtil.mySendKeys("//input[@name='firstname']", "firstName",expLeadsName);
		WebUtil.mySendKeys("//input[@name='lastname']", "lastName", "EVA");
		WebUtil.mySendKeys("//input[@name='phone']", "phone", "8081157129");
		WebUtil.mySendKeys("//input[@name='company']", "company", "Daphnish services pvt.ltd");
		WebUtil.mySendKeys("//input[@name='email']", "email", ""+expLeadsName+"2022@gmail.com");
		WebUtil.mySendKeys("//textarea[@name='lane']", "street", "pashchim sharira");
		WebUtil.mySendKeys("//input[@id='country']", "country", "india");
		WebUtil.mySendKeys("//input[@id='city']", "city", "kaushambi");
		WebUtil.mySendKeys("//input[@id='state']", "state", "utter pradesh");
		WebUtil.mySendKeys("//textarea[@name='description']", "description", "Do work hard util you do");
		return expLeadsName;
	}
	
}
