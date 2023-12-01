package MeakingChromedriver;

public class Test extends PageElement {

	public static void main(String[] args) {
		
		/// You can create object of any child class and can keep that............/
		/// object either in same child class or in parent........../
		///sabse bada parenet "SearchContains" hai jo ak Interface hai................../
		///child ka object bana ke chaild may rakhe to dono (child and parent) ke methad sho karte hai..../
		///lekin jab child ka object bana ke parent  may rakhe to sirf parent ke methad sho karte hai..../
		
		
		WebBrowser  browser=new ChromeBrowser();
		browser.launchBrowser();
		browser.openUrl("https://flipkart.com");
		TestLogin login =new TestLogin();
		login.dologin(browser);
		
		
		
		
		
		
	}

}
