package com.parvindGupta.vtigerautomation.testscripts;

import java.time.Duration;
import java.util.HashMap;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.NoSuchDriverException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebUtility {



	///***********************//   0001   //***********************

	public static WebDriver driver;
	public static void mylaunchbrowser( ) throws NoSuchDriverException  {
		try {
			driver=new ChromeDriver();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		System.out.println("Browser launch successfully");
	}

	//**********************//   0002   //***********************

	public static void OpenUrl(String Url){
		try {
			driver.get(Url);
			System.out.println("Url Launch successfully");
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

	//**************************//   0003   //************************

	public static WebElement myFindElement(String xpath,String moduleName) {
		WebElement weObj=null;
		try {
			weObj=driver.findElement(By.xpath(xpath));
			System.out.println(moduleName+" is found successfully");

		}catch(NoSuchElementException e) {
			WebDriverWait visibilWT=new WebDriverWait(driver,Duration.ofSeconds(60));
			visibilWT.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
			weObj=driver.findElement(By.xpath(xpath));
			System.out.println(moduleName+" is found successfully");
		}catch(Exception e) {
			weObj=driver.findElement(By.linkText(xpath));
			e.printStackTrace();
			System.out.println(moduleName+" is successfully");
			//			System.out.println(moduleName+"is not successfully");

		}
		return weObj;
	}

	//**************************//   0004   //************************

	public static void mySendKey(String xpath,String moduleName,String sendValue) {
		WebElement weSend=myFindElement(xpath, moduleName);
		try {
			weSend.clear();	
			weSend.sendKeys(sendValue);
			System.out.println(sendValue+" value is passed in "+moduleName+" textbox successfully");
		}catch(ElementNotInteractableException e) {
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("arguments[0].value='"+sendValue+"'",weSend );
			System.out.println(sendValue+" value has entered in "+moduleName+" textbox successfully");

		}catch(StaleElementReferenceException e) {
			weSend=driver.findElement(By.xpath("//input[@name='"+sendValue+"']"));
			System.out.println("we have found "+moduleName+" successfully");
			weSend.sendKeys(sendValue);
			System.out.println(sendValue+" value has entered in "+moduleName+" textbox successfully");

		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(sendValue+" value hasn't entered in "+moduleName+" textbox successfully");
			throw e;
		}

	}

	//***************************//   0005  //********************************

	public static void mySelectByText(String xpath,String moduleName,String linkTex) {
		
			WebElement weSend=myFindElement(xpath, moduleName);
			try {
			Select handleDrop=new Select(weSend); 
			handleDrop.selectByVisibleText(linkTex);
			
		
		}catch(ElementNotInteractableException e) {
			JavascriptExecutor js= (JavascriptExecutor)driver;
			js.executeScript("argument[0].click()", weSend);
			WebElement weoption=driver.findElement(By.xpath("//option[text()='"+linkTex+"']"));
			js.executeScript("argument[0].click()", weoption);
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(moduleName+"is not found handleDropdown ");
	}
	}
	//***********************//   0006   //********************************

	public static void myClick(String xpath,String moduleName) {
		WebElement weSend=myFindElement(xpath, moduleName);
		try {
			weSend.click();
		}catch(ElementNotInteractableException e) {

			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click()", weSend);
			System.out.println(moduleName+" element is clicked successfully");

			throw e;
		}catch(StaleElementReferenceException e) {

			weSend=myFindElement( xpath, moduleName);
			weSend.click();
			System.out.println(moduleName+" element is clicked successfully");

		}

		catch(Exception e) {
			e.printStackTrace();
			System.out.println(moduleName+" element is not clicked successfully");
			throw e;

		}

	}

	//*************************//   0007   //***************************

	public static String myGetText( String xpath, String elementName) {
		WebElement we=myFindElement( xpath, elementName);
		String innerText=null;
		try {
			innerText=we.getText();
			System.out.println(innerText+" - innertext of "+elementName+" got successfully");
		}catch(StaleElementReferenceException e) {

			we=myFindElement(xpath, elementName);
			innerText=we.getText();
			System.out.println(innerText+" - innertext of "+elementName+" got successfully");

		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(" innertext not found");
			throw e;

		}
		return innerText;
	}

	//*************************//   0008   //******************************

	public static void verifyString(String actualText, String expectedText) {
		try {
			if(actualText.equalsIgnoreCase(expectedText)) {
				System.out.println("Passed");
			}else {
				System.out.println("Failed");
			}
		}catch(Exception e) {
			e.printStackTrace();

		}
	}
	//*************************//   0009   //*************************************

	public static void myMouseOver( String xpath, String elementName) {
		try {
		WebElement we=myFindElement( xpath, elementName);	
		Actions actObj= new Actions(driver) ;
		actObj.moveToElement(we).build().perform();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	//*****************************//   0010   //************************************************
	public static void myclose() {
		try {
			driver.close();
		}catch(Exception e) {
			driver.quit();
			e.printStackTrace();
		}
	}

	//*****************************//   0011   //************************************************
	public static void myWait() {
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		}catch(Exception e) {
			e.printStackTrace();
		}

	}	

	//*****************************//   0012   //************************************************

	public static void myPopupsDissmiss() {
		
		try {
			driver.switchTo().alert().dismiss();
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}

		//*****************************//   0013   //************************************************


    









	}


	}
