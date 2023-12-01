package RahulSirPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class MultiPalMethad {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\qwerty\\vinay\\SeleniumAutomation\\Driver\\chromedriver.exe");
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(option);
		driver.get("http://localhost:8888/");
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("parvind");
		WebElement loginThim =	driver.findElement(By.xpath("//select[@name='login_theme']"));
		Select thimStutus=new Select(loginThim);
		thimStutus.selectByIndex(1);
		WebElement languageBar=driver.findElement(By.xpath("//select[@name='login_language']"));
		Select languageStutus=new Select(languageBar);
		languageStutus.selectByIndex(0);
		driver.findElement(By.xpath("//input[@name='Login']")).click();
		driver.findElement(By.linkText("Marketing")).click();
		driver.findElement(By.linkText("Campaigns")).click();	
		List<WebElement> chekboxlist=driver.findElements(By.xpath("//input[@type='checkbox']"));
		int we=chekboxlist.size();
		int blankCount=0;
		int nonblankCount=0;
		System.out.println(we);
		for(int i=0; i<=we-1; i++) {
		WebElement wec=	chekboxlist.get(i);
		wec.click();
		String innerText=wec.getText();
		if(innerText.equalsIgnoreCase("pq")) {
			blankCount=blankCount+1;
		}else {
			nonblankCount=nonblankCount+1;
		}
		}
	
		System.out.println("Blank- "+blankCount);
		System.out.println("NonBlankCount- "+nonblankCount);
		
		
		
		
		
		
		
		
		
		
		
	}
	

}