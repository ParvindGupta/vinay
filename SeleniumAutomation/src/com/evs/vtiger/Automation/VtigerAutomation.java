package com.evs.vtiger.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class VtigerAutomation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\qwerty\\vinay\\SeleniumAutomation\\Driver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		String pageTitle=driver.getTitle();
		System.out.println(pageTitle);
		String pageurl=driver.getCurrentUrl();
		System.out.println(pageurl);
		boolean usernames=driver.findElement(By.xpath("//input[@name='user_name']")).isDisplayed();
		if( usernames==true) {
			System.out.println("User Name is visible");
		}else {
			System.out.println("User Name is not invisible");
		}	
		boolean userpassword=driver.findElement(By.xpath("//input[@name='user_password']")).isDisplayed();
		if(userpassword==true) {
			System.out.println("User Password is visible");
		}else {
			System.out.println("User Password is not visible");
		}
		boolean colourtheme=driver.findElement(By.xpath("//select[@class='small']")).isDisplayed();
		if(colourtheme==true) {
			System.out.println("Colour Theme is visible");
		}else {
			System.out.println("Colour Theme is not visible");
		}
		boolean languagebutton=driver.findElement(By.xpath("//select[@name='login_theme']")).isDisplayed();
		if(languagebutton==true) {
			System.out.println("Language Button is visible");
		}else {
			System.out.println("Language Button is not invisible");
		}
		boolean Signinbutton=driver.findElement(By.xpath("//input[@title='Login [Alt+L]']")).isDisplayed();
		if(Signinbutton==true) {
			System.err.println("Sign in button is Visible");
		}else {
			System.err.println("Sign in button is not INVisible");
		}	
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("parvind");
		WebElement welogin=driver.findElement(By.xpath("//select[contains(@name,'login_theme')]"));
		Select loginStutus=new Select(welogin);
		loginStutus.selectByVisibleText("woodspice");
		WebElement welanguage=driver.findElement(By.xpath("//select[contains(@name,'login_language')]"));
		Select languageStutues=new Select(welanguage);
		languageStutues.selectByIndex(0);
		driver.findElement(By.xpath("//input[contains(@name,'Login')]")).click();
		WebElement wemarketing=driver.findElement(By.xpath("(//img[contains(@src,'images/menuDnArrow.gif')])[2]"));
		Actions actobj=new Actions(driver);
		actobj.moveToElement(wemarketing).build().perform();
		WebElement weleads=driver.findElement(By.xpath("href=\"index.php?module=Leads&action=index&parenttab=Marketing\""));
		actobj.moveToElement(weleads).build().perform();		
		driver.findElement(By.xpath("//img[@title='Open Calculator...']"));
		
		
	}

}

