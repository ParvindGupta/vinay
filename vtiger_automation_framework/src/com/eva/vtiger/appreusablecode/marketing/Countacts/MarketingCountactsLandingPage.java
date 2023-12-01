package com.eva.vtiger.appreusablecode.marketing.Countacts;

import com.eva.vtiger.utils.WebUtil;

public class MarketingCountactsLandingPage {

	
	public void clickCreateCountactsButton() {
		WebUtil.myThread(3000);
		WebUtil.myClick("//img[@title='Create Contact...']", "Create Contact");
	}
}
