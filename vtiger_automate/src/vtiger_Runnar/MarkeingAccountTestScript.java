package vtiger_Runnar;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MarkeingAccountTestScript {

	public void verifyVT001SearchAccounts(String name, String mobilenumber) throws InterruptedException {

		System.out.println("verifyVT001SearchAccounts TestCase Started");

		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		System.out.println("Webdriver refrence is chromedriver launch successfully");

		driver.manage().window().maximize();
		System.out.println("ChromeDriver browser is launch");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		System.out.println("Chromedriver in mange implicitlyWait is successfully");

		driver.get("http://localhost:8888");
		
		///  username

		mySendKeys(driver, "//input[@name='user_name']", "UserName Textbox", "admin");
		mySendKeys(driver, "//input[@name='user_password']", "Password Textbox", "admin");

		myClick(driver, "//input[@name='Login']", "Login Button");

		System.out.println("Click performed on Login Button Successfully");

		driver.findElement(By.linkText("Marketing")).click();

		System.out.println("Click performed on Marketing Link Successfully");

		driver.findElement(By.linkText("Accounts")).click();

		System.out.println("Click performed on Accounts Link Successfully");

		try {


			driver.findElement(By.xpath("//img[@title='Create Account...']")).click();
			
			System.out.println("Create Account Started");
		
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		mySendKeys(driver, "//input[@name='accountname']", "AccountName textbox", "Rahul");

        driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(mobilenumber);
		
        driver.findElement(By.xpath("//input[@value='U']")).click();
		
        driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]")).click();
		
        System.out.println("Account Create Sucesufully");
		
        Thread.sleep(5000);
		
        Actions	actobj=	new Actions(driver);
		
        WebElement marketing=	driver.findElement(By.xpath("//a[text()='Marketing']"));
		
        actobj.moveToElement(marketing).build().perform();
		
        driver.findElement(By.xpath("//div[@id='Marketing_sub']//a[text()='Accounts']")).click();
		
        //driver.findElement(By.xpath("//input[@name='search_text']")).sendKeys(name);

		
        WebElement weSearchTextbox=driver.findElement(By.xpath("//input[@name='search_text']"));
		
        weSearchTextbox.sendKeys(name);

		WebElement weSearchType=driver.findElement(By.xpath("//select[@id='bas_searchfield']"));
		
		Select sel= new Select(weSearchType);
		
		sel.selectByVisibleText("Account Name");
		
		//weSearchType.sendKeys("Account Name");

		WebElement weSearchButton=driver.findElement(By.xpath("//input[@name='submit']"));
		
		weSearchButton.click();
		
		Thread.sleep(3000);
		
		WebElement weName=driver.findElement(By.xpath("//a[@title='Accounts']"));
		
		String actNameText=weName.getText();
		
		System.out.println(actNameText);
		
		///  equals equalsIgnoreCase  contains
		if(actNameText.contains(name)) {
			
			System.out.println("Passed. actual-"+actNameText+" and expected-"+name+" name are matched");
		
		}else {
			
			System.out.println("Failed. actual-"+actNameText+" and expected-"+name+" name are not matched");
		
		}
		
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		
		driver.quit();

		System.out.println("verifyVT001SearchAccounts TestCase Completed");


	}

	public void verifyVT002CreateAccount() {
		/// BrowserLaunch
		// Login
		// Create Account
		/// verify Created Account
		///  Logout 
		///  browser close
	}

	public void verifyVT003DeleteAccount() {
		/// BrowserLaunch
		// Login
		// Create Account
		/// verify Created Account
		///  Logout 
		///  browser close
	}

	public void verifyVT023AccountTableLinks() {
		/// BrowserLaunch
		// Login
		// Create Account
		/// verify Created Account
		///  Logout 
		///  browser close
	}

	// static WebDriver driver;
	
	public void verifyVT001CreateAccount(String name, String mobilenumber) throws InterruptedException {
		
		System.out.println("verifyVT001CreateAccount start ");
		
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//webDriver//options//window: void
		
		driver.get("http://localhost:8888/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//WebDriver//options//timeouts:timeouts
		
		Actions actobj=	new Actions(driver);
		
		WebElement weUserName=null;
		
		try {
			
			weUserName= driver.findElement(By.name("user_name"));
			
			weUserName.sendKeys("admin");
			
			System.out.println("username textbox found successfully");
		
		}catch(NoSuchElementException e ) {
			
			WebDriverWait wt=new WebDriverWait(driver, Duration.ofSeconds(60));
			
			wt.until(ExpectedConditions.visibilityOfElementLocated(By.name("user_name")));
			
			weUserName= driver.findElement(By.name("user_name"));
			
			throw e;
		
		}catch(InvalidSelectorException e) {
			
			e.printStackTrace();
			
			System.out.println("user text box not found on page");
			
			throw e;
		
		}catch(Exception e) {
			
			e.printStackTrace();
			
			System.out.println("username textbox not found on page");
			
			throw e;
		}

		driver.findElement(By.name("user_password")).sendKeys("admin");
		
		driver.findElement(By.name("Login")).click();
		
		driver.findElement(By.linkText("Marketing")).click();
		
		driver.findElement(By.linkText("Accounts`")).click();
		
		driver.findElement(By.xpath("//img[@title='Create Account...']")).click();
		
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(name);
		
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(mobilenumber);
		
		driver.findElement(By.xpath("//input[@value='U']")).click();
		
		driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]")).click();
		
		Thread.sleep(5000);

		WebElement marketing=	driver.findElement(By.xpath("//a[text()='Marketing']"));
		
		actobj.moveToElement(marketing).build().perform();
		
		//   driver.findElement(By.xpath(""));

		driver.findElement(By.xpath("//div[@id='Marketing_sub']//a[text()='Accounts']")).click();
		
		driver.findElement(By.xpath("//input[@name='search_text']")).sendKeys(name);


		WebElement searchname = driver.findElement(By.id("bas_searchfield"));
		
		Select objs = new Select(searchname);
		
		//			Thread.sleep(3000);
		
		objs.selectByVisibleText("Account Name");

		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		Thread.sleep(3000);
		
		String AccountNameTextActule=	driver.findElement(By.xpath("//span[@vtfieldname='accountname']/preceding-sibling::a")).getText();
		
		System.out.println(AccountNameTextActule);
		
		String Excepted	=name;	

		if(AccountNameTextActule.contains(Excepted)) {
		
			System.out.println("CreateAccount has completed");
		
		}else {
		
			System.out.println("CreateAccount  has not create");
		}
		
		System.out.println("Account verification are completed successfully  ");
		
		System.out.println("verifyVT001CreateAccount completed successfully");

	}

	public void verifyVT002SearchAccount() {
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().back();

	}

	public void verifyVT005DeleteAccount() {

	}

	public void verifyVT004SearchLead() {

	}


	public static void mySendKeys(WebDriver driver, String xpath, String elementName, String inputValue) {

		WebElement we= myFindElement(driver, xpath, elementName);

		try {
		
			we.sendKeys(inputValue);
			
			System.out.println(inputValue+" value entered in username textbox successfully");
		
		}catch(ElementNotInteractableException e) {
		
			JavascriptExecutor jse=(JavascriptExecutor) driver;
			
			jse.executeScript("argumens[0].value='admin'", we);
			
			System.out.println(inputValue+" value entered in "+elementName+" textbox successfully");
		
		}catch(StaleElementReferenceException e) {
		
			we=driver.findElement(By.name("user_name"));	
			
			we.sendKeys("admin");
			
			System.out.println("admin value entered in username textbox successfully");
		
		}catch(Exception e) {
		
			e.printStackTrace();
			
			System.out.println("failed. admin value not entered in username textbox");
			
			throw e;
		}

	}


	public static void myClick(WebDriver driver, String xpath, String elementName) {
		
		WebElement weUserName= myFindElement(driver, xpath, elementName);

		try {
		
			weUserName.click();;
			
			System.out.println("Click performed on "+elementName+" successfully");
		
		}catch(ElementNotInteractableException e) {
		
			JavascriptExecutor jse=(JavascriptExecutor) driver;
			
			jse.executeScript("arguments[0].click()", weUserName);
			
			System.out.println("Click performed on "+elementName+" Successfully");
		
		}catch(StaleElementReferenceException e) {
		
			weUserName=driver.findElement(By.name("user_name"));	
			
			weUserName.click();
			
			System.out.println("admin value entered in username textbox successfully");
		
		}catch(Exception e) {
		
			e.printStackTrace();
			
			System.out.println("failed. admin value not entered in username textbox");
			
			throw e;
		}
	}


	public static WebElement myFindElement(WebDriver driver, String xpath, String elementName) {

		WebElement weUserName=null;
		
		try {		
		
			weUserName=driver.findElement(By.xpath(xpath));	
			
			System.out.println(elementName+" element found successfully");
		
		}catch(NoSuchElementException e) {
		
			WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(60));
			
			wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
			
			weUserName=driver.findElement(By.xpath(xpath));	
			
			throw e;

		}catch(InvalidSelectorException e) {
			
			e.printStackTrace();
			
			System.out.println(elementName+" textbox not found on page");
			
			throw e;
		
		}catch(Exception e) {
			
			e.printStackTrace();
			
			System.out.println(elementName+"textbox not found on page");
			
			throw e;
		}	
		
		return weUserName;

	}



}


