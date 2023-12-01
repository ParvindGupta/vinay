package com.parvindGupta.vtigerautomation.testscripts;

public class MyRunner {

	public static void main(String[] args) {
		MarketingAccountsTestscripts abc=new MarketingAccountsTestscripts();
//		abc.verifyVT0001searchAccounts();
		abc.verifyVT0002TableRowCountAfterNewAccountCreation();
	}

}
