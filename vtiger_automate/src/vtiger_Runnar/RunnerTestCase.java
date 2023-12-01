package vtiger_Runnar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RunnerTestCase {



	public static void main(String[] args) {
		MyLoginVtiger vtLogin=new MyLoginVtiger();
		vtLogin.loginVtigerPage(new ChromeDriver(), "http://localhost:8888");
		
		
		
		
		
	}

}
