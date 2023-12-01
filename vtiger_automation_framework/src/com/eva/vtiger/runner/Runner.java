package com.eva.vtiger.runner;


import com.eva.vtiger.testscripts.InventoryInvoiceTestScripts;

public class Runner {

	public static void main(String[] args) throws InterruptedException {
//		MarketingAccountTestScripts mats=new MarketingAccountTestScripts();
//		mats.verifyVT001CreateAccount();
//		mats.verifyVT002DeleteAccount("brijbhan");
//		mats.verifyVT003SearchAccount();
//		mats.verifyVT004DuplicateAccount("Ravindra Sir","punit");
//		mats.verifyVT005AccountEditable("Akash pal");
//		mats.verifyVT006AccountTableLinks("Aryan");
//		mats.VerifyVT007MarketingTableRowAfterCreatingAccount("Ravindra sir");
//        
		InventoryInvoiceTestScripts iiTS=new InventoryInvoiceTestScripts();
		iiTS.vt0027VerifyAccountAndContactOnInvoicePage();
        
	}

}





