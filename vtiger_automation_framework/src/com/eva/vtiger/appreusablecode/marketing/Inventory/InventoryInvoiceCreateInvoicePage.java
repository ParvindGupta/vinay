package com.eva.vtiger.appreusablecode.marketing.Inventory;

import com.eva.vtiger.utils.WebUtil;

public class InventoryInvoiceCreateInvoicePage {


	public void enterClickAccountNameInvoiceSelectButtom(){
	WebUtil.myClick("//input[@name='account_name']//following-sibling::img","Account Name Select textbox");
	
	}	
	public void enterClickCountactNameInvoiceSelectButtom(){
		WebUtil.myClick("//input[@name='contact_name']//following-sibling::img","Contact Name Select textbox");
		
		}	
}
