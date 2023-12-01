import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;


public class Upload_DownloadBrowser {

	public static void main(String[] args) {
		vTigerAutomate();

	}

	public static void vTigerAutomate() {

		//Addresh chenge,popups Handles & download file...................///

		System.out.println(System.getProperty("user.dir"));
		HashMap<String,Object> chromePrefs=new HashMap<String,Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory","C:\\Users\\dell\\Desktop\\xyzXYZ");
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("prefs",chromePrefs );

 
		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("http:/localhost:8888");
		Actions submeet=new Actions(driver);
		submeet.sendKeys("admin",Keys.TAB).sendKeys("parvind",Keys.ENTER).perform();
		driver.findElement(By.linkText("Marketing")).click();	
		driver.findElement(By.linkText("Leads")).click();

		// Export & Download File..................../

		//		driver.findElement(By.xpath("//img[@title='Export Leads']")).click();	
		//		driver.findElement(By.xpath("//input[@name='Export']")).click();

		//Import & upload File................../	

				driver.findElement(By.xpath("//img[contains(@src,'/images/tbarImport.gif')]")).click();
				driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\dell\\Downloads\\Leads.csv");
				driver.findElement(By.xpath("//input[@title='Next']")).click();
				driver.findElement(By.xpath("//select[@name='colnum0']")).sendKeys("First Name");
				driver.findElement(By.xpath("//select[@name='colnum2']")).sendKeys("Last Name *");
				driver.findElement(By.xpath("//select[@name='colnum4']")).sendKeys("Company *");
		//		driver.findElement(By.xpath("(//input[@type='button'])[3]")).click();
		//		driver.findElement(By.xpath("//input[@title='Finished']")).click();

	}


}
