package chrome_option_handleTestCaseScript;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsTest {


	public static void main(String[] args) {

		System.out.println(System.getProperty("user.dir"));
		// we get our class path

		System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		// through the ChromeOptions class we can control  browser.
		//	i mean change the capability of browser

		//1.) PageLoadStrategy ===>>>>>>>>
		option.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		//	option.setPageLoadStrategy(PageLoadStrategy.EAGER);
		//	option.setPageLoadStrategy(PageLoadStrategy.NONE);

		// 2.) incognito ===>>>>>>
		option.addArguments("--incognito");

		// 3.) Maximize ===>>>>>>
		option.addArguments("--start-maximized");
		//option.addArguments("window-size=300,150");

		// 4.) Hide Browser Page
		//option.addArguments("--headless");

		// 5.) Infobars - we will try to remove that info
		option.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});


		WebDriver driver = new ChromeDriver(option);
		driver.get("http:/localhost:8888");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("rajput");
		driver.findElement(By.name("Login")).click();






	}

}
