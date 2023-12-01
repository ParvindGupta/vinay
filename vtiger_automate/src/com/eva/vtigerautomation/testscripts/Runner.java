package com.eva.vtigerautomation.testscripts;



public class Runner {

	public static void main(String[] args) throws InterruptedException {
		MarketingAccountsTestScripts mats=new MarketingAccountsTestScripts();
		mats.verifyVT023TableRowCountAfterNewAccountCreation();
//        mats.verifyVT001SearchAccounts();
//        mats.verifyVT002CreateAccount();
//        mats.verifyVT023AccountTableLinks();
//        mats.verifyVT003DeleteAccount();
//        
//        MarketingLeadsTestCases mlts =  new MarketingLeadsTestCases();
//        mlts.verifyVT021VerifySearchLeads();
//        mlts.verifyVT022VerifyCreateLead();
		
	}

}

