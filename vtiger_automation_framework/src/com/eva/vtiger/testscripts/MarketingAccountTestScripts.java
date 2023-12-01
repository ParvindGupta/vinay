 package com.eva.vtiger.testscripts;

import com.eva.vtiger.appreusablecode.common.CommonReusableCodes;
import com.eva.vtiger.appreusablecode.marketing.MarketingReusableCode;
import com.eva.vtiger.appreusablecode.marketing.accounts.MarketingAccountsCreateAccountPage;
import com.eva.vtiger.appreusablecode.marketing.accounts.MarketingAccountsLandingPage;
import com.eva.vtiger.utils.WebUtil;

public class MarketingAccountTestScripts {

	public void verifyVT001CreateAccount() throws InterruptedException {
		WebUtil.printMessage("====  verifyVT001CreateAccount starts from here====");
		CommonReusableCodes cc=new CommonReusableCodes();
		cc.login();
		cc.gotoMarketingAccounts();;
		cc.creatNew("Accounts");
		MarketingReusableCode mrc=new MarketingReusableCode();
		String expAccountName =mrc.newCreateMarketingAccount("Shyam Bhan");
		cc.saveButton("//b[text()='Description Information']");
		cc.gotoMarketingAccounts();;
		cc.searchForElement(expAccountName,  "accountname");
		Thread.sleep(3000);
		String actAccountName=WebUtil.myInnerText("//a[@title='Accounts']", "Account name");
		if (actAccountName.equalsIgnoreCase(expAccountName)) {
			WebUtil.printMessage("Passed !,new Account is created successfully");

		} else {
			WebUtil.printMessage("Failed !,new Account is not created successfully");
		}
		cc.logOut();
		WebUtil.myQuit();
		WebUtil.printMessage("====  verifyVT001CreateAccount ends from here====");
	}

	public void verifyVT002DeleteAccount(String name) throws InterruptedException {
		WebUtil.printMessage("====  verifyVT002DeleteAccount starts from here====");

		CommonReusableCodes cc=new CommonReusableCodes();
		cc.login();
		cc.gotoMarketingAccounts();;
		cc.creatNew("Accounts");
		MarketingReusableCode mrc=new MarketingReusableCode();
		mrc.newCreateMarketingAccount(name);
		cc.saveButton("//b[text()='Description Information']");
		Thread.sleep(5000);
		WebUtil.mouseClick("//td[@class='genHeaderSmall']/preceding::input[@title='Delete [Alt+D]']", "delete button");
		WebUtil.popUpAccept();
		cc.searchForElement(name, "accountname");
		String expResult="No Account Found !";
		String actResult=WebUtil.myInnerText("//span[@class='genHeaderSmall']", "Account Result");

		if(expResult.equalsIgnoreCase(actResult)) {
			System.out.println("Passed!,your created lead has been deleted successfully");
		}else {
			System.out.println("failed!,your created lead hasn't been deleted successfully");
		}
		cc.logOut();
		WebUtil.myQuit();
		WebUtil.printMessage("====  verifyVT002DeleteAccount ends from here====");
	}

	public void verifyVT003SearchAccount() throws InterruptedException {
		WebUtil.printMessage("====  verifyVT003SearchAccount Starts from here====");
		CommonReusableCodes cc=new CommonReusableCodes();
		cc.login();
		cc.gotoMarketingAccounts();;
		String expName="Shyam bhan";
		cc.searchForElement( expName, "accountname");
		Thread.sleep(4000);
		String actName=WebUtil.myInnerText("//a[@title='Accounts']", "Account Name");
		if (expName.equalsIgnoreCase(actName)) {
			WebUtil.printMessage("Passed!,your expected name is searched successfully");
		} else {
			WebUtil.printMessage("failed!,your expected name is not searched successfully");
		}
		cc.logOut();
		WebUtil.myQuit();
		WebUtil.printMessage("====  verifyVT003SearchAccount ends from here====");
	}
	public void verifyVT004DuplicateAccount(String firstAccountName,String secondAccountName) {
		WebUtil.printMessage("======= verifyVT004DuplicateAccount Starts from here ======");
		CommonReusableCodes cc=new CommonReusableCodes();
		cc.login();
		cc.gotoMarketingAccounts();
		cc.creatNew("Accounts");
		MarketingReusableCode mrc=new MarketingReusableCode();
		mrc.newCreateMarketingAccount(firstAccountName);
		cc.saveButton("//b[text()='Description Information']");
		String firstWebsiteName=WebUtil.myInnerText("//span[@id='dtlview_Website']", "website Name");
		WebUtil.myClick("//td[@class='genHeaderSmall']/preceding::input[@title='Duplicate [Alt+U]']", "Duplicate");
		WebUtil.myClear("//input[@name='accountname']", "Account Name");
		WebUtil.mySendKeys("//input[@name='accountname']", "Account Name", secondAccountName);
		String secondWebsiteName=WebUtil.getAttributeValue("//input[@value='Kusal.er@gmail.com']", "website name", "value");
		if (firstWebsiteName.equalsIgnoreCase(secondWebsiteName)) {
			WebUtil.printMessage("Passed !,the privious data and current data is matched successfully");
		} else {
			WebUtil.printMessage("Failed !,the privious data and current data is not matched successfully");
		}
		cc.logOut();
		WebUtil.myQuit();
		WebUtil.printMessage("======= verifyVT004DuplicateAccount ends from here ======");
	}

	public void verifyVT005AccountEditable(String editACName)  {
		WebUtil.printMessage("===== verifyVT005AccountEditable starts from here ======");
		CommonReusableCodes cc=new CommonReusableCodes();
		cc.login();
		cc.gotoMarketingAccounts();;
		WebUtil.myClick("//input[@id='12']", "Account Name");
		String acNameBeforeEdit=WebUtil.myInnerText("//input[@id='12']/parent::td/following-sibling::td/a[@title='Accounts']", "AccountName");
		WebUtil.myClick("//input[@id='12']/ancestor::tr[@id='row_12']//a[contains(text(),'edit')]", "edit button");
		WebUtil.myClear("//input[@name='accountname']", "AccountName");
		WebUtil.mySendKeys("//input[@name='accountname']", "A/C_Name",editACName);
		cc.saveButton("//b[text()='Description Information']");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String acNameAfterEdit=WebUtil.myInnerText("//tr[@id='row_12']/descendant::a[@title='Accounts']", "acNameAfterEdit");
		if (!acNameBeforeEdit.equalsIgnoreCase(acNameAfterEdit)) {  ///  !...not equalsIgnoreCase
			System.out.println("Passed !,your Account name is editable because your before edit A/C name ="+acNameBeforeEdit+" "
					+ "and after edit A/C name ="+acNameAfterEdit+" is different");

		} else {
			System.out.println("Failed !,your Account name is editable because your before edit A/C name ="+acNameBeforeEdit+" "
					+ "and after edit A/C name ="+acNameAfterEdit+" is same");
		}
		cc.logOut();
		WebUtil.myQuit();
		WebUtil.printMessage("===== verifyVT005AccountEditable ends from here ======");
	}

	public void verifyVT006AccountTableLinks(String AcName) {
		WebUtil.printMessage("===== verifyVT006AccountTableLinks starts from here ======");
		CommonReusableCodes cc=new CommonReusableCodes();
		cc.login();
		cc.gotoMarketingAccounts();;
		cc.creatNew("Accounts");
		MarketingReusableCode mrc=new MarketingReusableCode();
		mrc.newCreateMarketingAccount(AcName);
		cc.saveButton("//b[text()='Description Information']");
		cc.gotoMarketingAccounts();;
		String accountNameBeforeClick=WebUtil.myInnerText("//table[@class='lvt small']//tr//td//a[text()='"+AcName+"']", "AccountName");
		WebUtil.myClick("//table[@class='lvt small']//tr//td//a[text()='"+AcName+"']", "Account name");
		String accountNameAfterClickLink=WebUtil.myInnerText("//span[@id='dtlview_Account Name']", "accountNameAfterClickLink");
		if(accountNameBeforeClick.equalsIgnoreCase(accountNameAfterClickLink)) {
			WebUtil.printMessage("Passed !,Account name is same After clicking the account name link");
		}else {
			WebUtil.printMessage("Failed !,Account name is not same After clicking the account name link");
		}
		cc.logOut();
		WebUtil.myQuit();
		WebUtil.printMessage("===== verifyVT006AccountTableLinks ends from here ======");
	}
	public void VerifyVT007MarketingTableRowAfterCreatingAccount(String acName) {
		CommonReusableCodes cc=new CommonReusableCodes();
		cc.login();
		cc.gotoMarketingAccounts();;
		int countBeforeAccountCreation=WebUtil.getTableRowCount("//table[@class='lvt small']", "Accounts");
		cc.creatNew("Accounts");
		MarketingReusableCode mrc=new MarketingReusableCode();
		mrc.newCreateMarketingAccount(acName);
		cc.saveButton("//b[text()='Description Information']");
		cc.gotoMarketingAccounts();;
		int countAfterAccountCreation=WebUtil.getTableRowCount("//table[@class='lvt small']", "Accounts");
		if (countAfterAccountCreation==countBeforeAccountCreation+1) {
			WebUtil.printMessage("new created Account is added in table row successfully ");
		} else {
			WebUtil.printMessage("new created Account is not added in table row successfully ");
		}

	}
	
	public void verifyVTOO26AccountTableColumnNames() {
	   ///  automate 
		CommonReusableCodes crc=new CommonReusableCodes();
		crc.login();
		crc.gotoMarketingAccounts();
		MarketingAccountsLandingPage accountLandingPage=  new MarketingAccountsLandingPage();
		accountLandingPage.clickCreateAccountButton();
		
		MarketingAccountsCreateAccountPage createPage=new MarketingAccountsCreateAccountPage();
		createPage.enterAndSaveCreateAccountForm();
		
		
		
		
	}
	
	
	
	
	
	
}