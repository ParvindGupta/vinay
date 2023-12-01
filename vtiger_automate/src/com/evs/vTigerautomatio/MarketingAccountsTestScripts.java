package com.evs.vTigerautomatio;



import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//  Priority   -  Priortize -  Set 
public class MarketingAccountsTestScripts {

	public void verifyVT001SearchAccounts() throws InterruptedException {

		System.out.println("verifyVT001SearchAccounts TestCase Started");

		WebDriver driver=new ChromeDriver();
		System.out.println("WebDriver is the refrence in chromedriver is launch successfully");

		driver.manage().window().maximize();
		System.out.println("chromedriver is manage in maximize");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		System.out.println("chromedriver manage in timeous is tha implicitly wait is method successfuly");

		driver.get("http://localhost:8888");
		System.out.println("with the help of Webdriver get method in Argument pass url VT launch successfully");

		///  username

		WebElement weUserName=null;
		

		try {		

			weUserName=driver.findElement(By.name("user_name"));	

			System.out.println("username textbox found successfully");

		}catch(NoSuchElementException e) {

			WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(60));

			wt.until(ExpectedConditions.visibilityOfElementLocated(By.name("user_name")));

			weUserName=driver.findElement(By.name("user_name"));	

		}catch(InvalidSelectorException e) {

			e.printStackTrace();

			System.out.println("username textbox not found on page");

			throw e;

		}catch(Exception e) {

			e.printStackTrace();

			System.out.println("username textbox not found on page");

			throw e;
		}
		
// sendkeys in userbox...................................///
		
		try {

			weUserName.sendKeys("admin");

			System.out.println("admin value entered in username textbox successfully");

		}catch(ElementNotInteractableException e) {

			JavascriptExecutor jse=(JavascriptExecutor) driver;

			jse.executeScript("argumens[0].value='admin'", weUserName);

			System.out.println("admin value entered in username textbox successfully");

		}catch(StaleElementReferenceException e) {

			weUserName=driver.findElement(By.name("user_name"));	

			weUserName.sendKeys("admin");

			System.out.println("admin value entered in username textbox successfully");

		}catch(Exception e) {

			e.printStackTrace();

			System.out.println("failed. admin value not entered in username textbox");

			throw e;
		}

		///  password.............................///
		
		WebElement wepassword=null;

		try {	

			wepassword=driver.findElement(By.name("user_password"));

			System.out.println("password textbox found successfully");

		}catch(NoSuchElementException e) {
			//

			WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(60));

			wt.until(ExpectedConditions.visibilityOfElementLocated(By.name("user_password")));

			wepassword=driver.findElement(By.name("user_password"));	
			
			System.out.println("password textbox not found on page");
			
		}catch(InvalidSelectorException e) {

			e.printStackTrace();
			
			System.out.println("password textbox not found on page");

			throw e;

		}catch(Exception e) {

			e.printStackTrace();

			System.out.println("password textbox not found on page");

			throw e;
		}

		try {

			wepassword.sendKeys("parvind");

			System.out.println("parvind value entered in password textbox successfully");

		}catch(ElementNotInteractableException e) {

			JavascriptExecutor jse=(JavascriptExecutor) driver;

			jse.executeScript("argumens[0].value='parvind'", wepassword);

			System.out.println("parvind value entered in password textbox successfully");

		}catch(StaleElementReferenceException e) {

			wepassword=driver.findElement(By.name("user_password"));	

			wepassword.sendKeys("parvind");

			System.out.println("Passed-parvind value entered in password textbox successfully");

		}catch(Exception e) {

			e.printStackTrace();

			System.out.println("failed- parvind value not entered in password textbox");

			throw e;
		}

		///Login button ...............................///
		System.out.println();
		System.out.println("Automat in login button in started");
		WebElement weLoginButton=null;

		try {	

			weLoginButton=driver.findElement(By.name("Login"));

			System.out.println("Login Button found successfully");

		}catch(NoSuchElementException e) {
			//

			WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(60));

			wt.until(ExpectedConditions.visibilityOfElementLocated(By.name("Login")));

			weLoginButton=driver.findElement(By.name("Login"));	
			
			System.out.println("Login Bottan not found on page");
			
		}catch(InvalidSelectorException e) {

			e.printStackTrace();
			
			System.out.println("Login Bottan not found on page");

			throw e;

		}catch(Exception e) {

			e.printStackTrace();

			System.out.println("Login Botton not found on page");

			throw e;
		}

		try {

			weLoginButton.click();

			System.out.println("Click login Buttom is  successfully in try block");

		}catch(ElementNotInteractableException e) {

			JavascriptExecutor jse=(JavascriptExecutor) driver;

			jse.executeScript("argumens[0].click()", weLoginButton);

			System.out.println("Click login Buttom is  successfully with the help of in java Script");

		}catch(StaleElementReferenceException e) {

			weLoginButton=driver.findElement(By.name("Login"));	

			weLoginButton.click();

			System.out.println("StaleElementReferenceException help in  successfully Handle");

		}catch(Exception e) {

			e.printStackTrace();

			System.out.println("failed-Login button not click or not click successfully");

			throw e;

		}
		System.out.println("-------------------------------------------------");
		System.out.println("login button is succssefully ......................../");
		
		
		
		
		
		
		
		
		
		
		
		
		
		

//		driver.findElement(By.linkText("Marketing")).click();
//
//		System.out.println("Click performed on Marketing Link Successfully");
//
//		driver.findElement(By.linkText("Accounts")).click();
//
//		System.out.println("Click performed on Accounts Link Successfully");
//
//		WebElement weSearchTextbox=driver.findElement(By.xpath("//input[@name='search_text']"));
//
//		weSearchTextbox.sendKeys("parvind Gupta");
//
//		WebElement weSearchType=driver.findElement(By.xpath("//select[@id='bas_searchfield']"));
//
//		weSearchType.sendKeys("Account Name");
//
//		WebElement weSearchButton=driver.findElement(By.xpath("//input[@name='submit']"));
//
//		weSearchButton.click();
//
//		Thread.sleep(3000);
//
//		WebElement weName=driver.findElement(By.xpath("//a[@title='Accounts']"));
//
//		String actNameText=weName.getText();
//
//		System.out.println(actNameText);
//
//		///  equals equalsIgnoreCase  contains
//
//		if(actNameText.contains("parvind gupta")) {
//
//			System.out.println("Passed. actual-"+actNameText+" and expected-Parvind Gupta name are matched");
//
//		}else {
//
//			System.out.println("Failed. actual-"+actNameText+" and expected-Parvind Gupta name are not matched");
//
//		}
//
//		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
//
//		driver.quit();
//
//		System.out.println("verifyVT001 login Button TestCase Completed");
//		}
//
//	}
//
//	public void verifyVT002CreateAccount() {
//		/// BrowserLaunch
//		// Login
//		// Create Account
//		/// verify Created Account
//		///  Logout 
//		///  browser close
//	}
//
//	public void verifyVT003DeleteAccount() {
//		/// BrowserLaunch
//		// Login
//		// Create Account
//		/// verify Created Account
//		///  Logout 
//		///  browser close
//	}
//
//	public void verifyVT023AccountTableLinks() {
//		/// BrowserLaunch
//		// Login
//		// Create Account
//		/// verify Created Account
//		///  Logout 
//		///  browser close
	}
}
