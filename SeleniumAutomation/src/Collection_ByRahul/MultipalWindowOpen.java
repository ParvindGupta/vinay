package Collection_ByRahul;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipalWindowOpen {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http:/localhost:8888");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("parvind");
		driver.findElement(By.name("Login")).click();
		driver.findElement(By.linkText("Feedback")).click();
		driver.findElement(By.linkText("Help")).click();
		driver.findElement(By.linkText("About Us")).click();
		Set<String> ab=driver.getWindowHandles();
		for(String handlValue:ab) {
			System.out.println(handlValue);
			driver.switchTo().window(handlValue);
			String weTitle=driver.getTitle();
			if(!weTitle.equalsIgnoreCase("vtiger CRM 5 - Free, Commercial grade Open Source CRM")) {
	           driver.close() ;
			}
		}
		
		Set<String> handle = driver.getWindowHandles() ;
		for(String hndleValue : handle) {
			driver.switchTo().window(hndleValue);
			String title = driver.getTitle() ;
			if(title.
					
					
					
					
					
					
					equalsIgnoreCase("vtiger CRM 5 - Free, Commercial grade Open Source CRM")) {
				break ;
			}
		}
		
		Thread.sleep(3000) ;
		  driver.findElement(By.xpath("//a[text()='Privacy Policy']")).click();
	}
}	
