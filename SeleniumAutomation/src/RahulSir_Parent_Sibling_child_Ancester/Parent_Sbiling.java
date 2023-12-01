package RahulSir_Parent_Sibling_child_Ancester;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Parent_Sbiling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\qwerty\\vinay\\SeleniumAutomation\\Driver\\chromedriver.exe");
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(option);
		driver.get("http://localhost:8888/");
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("parvind");
		List <WebElement> loginthimstutus=driver.findElements(By.xpath("//select[@name='login_theme']//option"));
		String statusLogintheme=driver.findElement(By.xpath("//td[text()='Color Theme']")).getText();
		System.out.println(statusLogintheme+"----------------");
		for(int i=0; i<=loginthimstutus.size()-1; i++) {
		WebElement stuts=loginthimstutus.get(i);
		String thimstutus=stuts.getText();
		System.out.println(thimstutus);
		}
		System.out.println(" ");
		List <WebElement> languageStutus=driver.findElements(By.xpath("//select[@name='login_language']//option"));
     	System.out.println("Language.......................|");
		for(int i=0; i<=languageStutus.size()-1; i++) {
		WebElement stutuslanguage=languageStutus.get(i);
		String ablanguageStutus=stutuslanguage.getText();
		System.out.println(ablanguageStutus);
	}
		driver.findElement(By.xpath("//input[@name='Login']")).click();
//		WebElement welogin= driver.findElement(By.xpath("//input[@name='Login']"));
//		driver.navigate().refresh();
//		welogin.click();
		List<WebElement>wetab= driver.findElements(By.xpath("//table[@class='hdrTabBg']//a[contains(@href,'index')]"));
		for(int i=0;i<wetab.size();i++) {
			wetab= driver.findElements(By.xpath("//table[@class='hdrTabBg']//a[contains(@href,'index')]"));
        WebElement wetabstatus= wetab.get(i);
		String tabText=wetabstatus.getText();
		System.out.println("===="+tabText+"====");
		System.out.println(" ");
		wetabstatus.click();
		List<WebElement>wesabTab= driver.findElements(By.xpath("//table[@class='level2Bg']//a"));
		for(int j=0;j<wesabTab.size();j++) {
			wesabTab= driver.findElements(By.xpath("//table[@class='level2Bg']//a"));
			String sabtabText=wesabTab.get(j).getText();
			System.out.println(sabtabText);
		}
		
		
		
		
		
		
		
		
//		System.out.println(" ");
//		List<WebElement> homepagelistbar1=driver.findElements(By.xpath("//table[@class='level2Bg']//a"));
//		for(int j=0; j<=homepagelistbar1.size()-1; j++) {
//		WebElement tablinktet1=homepagelistbar1.get(j);
//		String wetablink1=tablinktet1.getText();
//		System.out.println(wetablink1);
		
		
		
		
		
		
		
		}	
//		Actions ac=new Actions (driver);
//		ac.sendKeys("admin",Keys.TAB).sendKeys("parvind",Keys.ENTER).build().perform();
//		List<WebElement> homepagelistbar=driver.findElements(By.xpath("//table[@class='hdrTabBg']//a[contains(@href,'index.php?module=')]"));
//		for(int i=0; i<=homepagelistbar.size()-1; i++) {
//			WebElement tablinktet=homepagelistbar.get(i);
//		String wetablink=tablinktet.getText();
//		System.out.println(wetablink);
//		System.out.println(" ");
//		
//		List<WebElement> homepagelistbar1=driver.findElements(By.xpath("//table[@class='level2Bg']//a"));
//		for(int j=0; j<=homepagelistbar1.size()-1; j++) {
//			WebElement tablinktet1=homepagelistbar1.get(j);
//		String wetablink1=tablinktet1.getText();
//		System.out.println(wetablink1);
//		
//		List<WebElement> linktextbar=driver.findElements(By.linkText("Marketin

	
	
	
	}
	}