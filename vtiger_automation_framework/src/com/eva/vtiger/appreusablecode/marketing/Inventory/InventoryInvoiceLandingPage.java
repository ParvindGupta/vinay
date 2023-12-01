package com.eva.vtiger.appreusablecode.marketing.Inventory;

import com.eva.vtiger.utils.WebUtil;

public class InventoryInvoiceLandingPage {

	public void clickCreateInvoiceButton() {
		WebUtil.myClick("//img[@title='Create Invoice...']", "Create Invoice");
	}
}
