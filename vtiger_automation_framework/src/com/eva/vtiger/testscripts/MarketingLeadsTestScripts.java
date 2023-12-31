//package com.eva.vtiger.testscripts;
//
//import java.util.List;
//
//import com.eva.vtiger.appreusablecode.common.CommonReusableCodes;
//import com.eva.vtiger.appreusablecode.marketing.MarketingReusableCode;
//import com.eva.vtiger.utils.WebUtil;
//
//public class MarketingLeadsTestScripts {
//
//
//	public void verifyVT008SearchLeads() {
//		WebUtil.printMessage("====  verifyVT008SearchLeads starts from here====");
//		CommonReusableCodes cc=new CommonReusableCodes();
//		cc.login();
//		cc.clickSubLinkOfLink("Marketing", "Leads");
//		cc.creatNew("Leads");
//		MarketingReusableCode mrc=new MarketingReusableCode();
//		String expFirstName =mrc.newCreatMarketingLeads("Rajeev");
//		cc.saveButton("//b[text()='Description Information']");
//		cc.clickSubLinkOfLink("Marketing", "Leads");
//		cc.searchForElement(expFirstName,  "firstname");
//		WebUtil.myThread(3000);
//		List<String> columnDetails=WebUtil.getColumnDataListByColumnName("//table[@class='lvt small']", "marketing leads table", "First Name");
//		for (int i = 0; i < columnDetails.size(); i++) {
//			String columnData =columnDetails.get(i);
//			if (columnData.contains(expFirstName)) {
//				WebUtil.printMessage("your "+(i+1)+" data "+columnData+" is matched that you are searching");
//			} else {
//				WebUtil.printMessage("your "+(i+1)+" data "+columnData+" is not  matched that you are searching");
//			}
//		}
//		cc.logOut();
//		WebUtil.myQuit();
//		WebUtil.printMessage("====  verifyVT008SearchLeads starts from here====");
//	}
//
//	public void verifyVT009CreateLeads(String name) {
//		WebUtil.printMessage("====  verifyVT009CreateLeads ends from here====");
//		CommonReusableCodes cc=new CommonReusableCodes();
//		cc.login();
//		cc.clickSubLinkOfLink("Marketing", "Leads");
//		cc.creatNew("Leads");
//		MarketingReusableCode mrc=new MarketingReusableCode();
//		String expFirstName =mrc.newCreatMarketingLeads(name);
//		cc.saveButton("//b[text()='Description Information']");
//		cc.clickSubLinkOfLink("Marketing", "Leads");
//		cc.searchForElement(expFirstName,  "firstname");
//		WebUtil.myThread(3000);
//		List<String> columnDetails=WebUtil.getColumnDataListByColumnName("//table[@class='lvt small']", "marketing leads table", "First Name");
//		for (int i = 0; i < columnDetails.size(); i++) {
//			String columnData =columnDetails.get(i);
//			if (columnData.contains(expFirstName)) {
//				WebUtil.printMessage("your "+(i+1)+" data "+columnData+" is matched that you are searching");
//				WebUtil.printMessage("Passed !, "+(i+1)+" "+columnData+" name is created successfully");
//			} else {
//				WebUtil.printMessage("your "+(i+1)+" data "+columnData+" is not  matched that you are searching");
//				WebUtil.printMessage("Failed !, "+(i+1)+" "+columnData+" name is not created successfully");
//
//			}
//		}
//		cc.logOut();
//		WebUtil.myQuit();
//		WebUtil.printMessage("====  verifyVT009CreateLeads ends from here====");
//	}
//
//	public void verifyVT0010DeleteLead(String name) {
//		WebUtil.printMessage("====  verifyVT0010DeleteLead starts from here====");
//
//		CommonReusableCodes cc=new CommonReusableCodes();
//		cc.login();
//		cc.clickSubLinkOfLink("Marketing", "Leads");
//		cc.creatNew("Leads");
//		MarketingReusableCode mrc=new MarketingReusableCode();
//		mrc.newCreatMarketingLeads(name);
//		cc.saveButton("//b[text()='Description Information']");
//		WebUtil.myThread(3000);
//		String leadNumber=WebUtil.myInnerText("//td[text()='Lead No']/following-sibling::td", "LeadNumber");
//		String[] arrStr=leadNumber.split("LEA");
//		int leadNum=Integer.parseInt(arrStr[1].trim());
//		WebUtil.mouseClick("//td[@class='genHeaderSmall']/preceding::input[@title='Delete [Alt+D]']", "delete button");
//		WebUtil.popUpAccept();
//		cc.searchForElement(leadNum, "lead_no");
//		String expResult="No Lead Found !";
//		String actResult=WebUtil.myInnerText("//span[@class='genHeaderSmall']", "Leads Result");
//		if(expResult.equalsIgnoreCase(actResult)) {
//			System.out.println("Passed!,your created lead has been deleted successfully");
//		}else {
//			System.out.println("failed!,your created lead hasn't been deleted successfully");
//		}
//		cc.logOut();
//		WebUtil.myQuit();
//		WebUtil.printMessage("====  verifyVT0010DeleteLead ends from here====");
//	}
//
//	public void verifyVT011LeadsTableLinks(String firstName) {
//		WebUtil.printMessage("===== verifyVT011LeadsTableLinks starts from here ======");
//		CommonReusableCodes cc=new CommonReusableCodes();
//		cc.login();
//		cc.clickSubLinkOfLink("Marketing", "Leads");
//		cc.creatNew("Leads");
//		MarketingReusableCode mrc=new MarketingReusableCode();
//		mrc.newCreatMarketingLeads(firstName);
//		cc.saveButton("//b[text()='Description Information']");
//		WebUtil.myThread(3000);
//		String leadNumber=WebUtil.myInnerText("//td[text()='Lead No']/following-sibling::td", "LeadNumber");
//		String leadNum=leadNumber.trim();
//		cc.clickSubLinkOfLink("Marketing", "Leads");
//		cc.searchForElement(leadNum, "lead_no");
//		String firstNameBeforeClickText=WebUtil.myInnerText("//table[@class='lvt small']//tr[2]//td/a[text()='"+firstName+"']", "First Name");
//		WebUtil.myClick("//table[@class='lvt small']//tr[2]//td/a[text()='"+firstName+"']", "First Name");
//		String firstNameafterClickText=WebUtil.myInnerText("//div[@id='tblLeadInformation']//td[@id='mouseArea_First Name']//span", "First Name");
//		if (firstNameBeforeClickText.equalsIgnoreCase(firstNameafterClickText)) {
//			WebUtil.printMessage("Passed !,first name is same After clicking the first name link in marketing leads");
//		} else {
//			WebUtil.printMessage("Passed !,first name is not same After clicking the first name link in marketing leads");
//		}
//		cc.logOut();
//		WebUtil.myQuit();
//		WebUtil.printMessage("====  verifyVT011LeadsTableLinks ends from here====");
//	}
//}
