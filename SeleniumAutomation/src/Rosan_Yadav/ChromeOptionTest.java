package Rosan_Yadav;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class ChromeOptionTest {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt=new ChromeOptions();
		//opt.addArguments("--incognito");

		// es methad se incognito browserlance karete hai (matalab jo esmay search karenge o histri may so nahi karega)
	
		//opt.addArguments("--headless");//Esaka kam hai console par browser lance ka code likh dega lekin dikhegaa nahi...
		
		//opt.addArguments("--start-maximized");//Esaka kam hai open huye browser ko maximized karta hai...
//		Thread.sleep(4000);
//		
		opt.addArguments("window-size=2000,600");// esase ham lanch browser ke size ko apane anusar change kar sakate hai..
		opt.setExperimentalOption("excludeSwitches",new String[] {"enable-automaton"});
		WebDriver driver=new ChromeDriver(opt);

		driver.get("https://google.com");
		System.out.println("Browser lanched seccesedfully");







	}

}
