package javabasics.variableconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VtigerTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\qwerty\\vinay\\SeleniumAutomation\\Driver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		String pageTitle=driver.getTitle();
		System.out.println(pageTitle);
		String pageurl=driver.getCurrentUrl();
		System.out.println(pageurl);
		WebElement username = driver.findElement(By.xpath("//input[@name='user_name']"));
		boolean ActualuserNameVisible=username.isDisplayed();
		if(ActualuserNameVisible==true){
			System.out.println("username box is visible & Testcase is passed.....");
		}else {
			System.out.println("username Box is not visible & Testcase is field.....");
		}
		boolean ActualuserNameEnable=username.isEnabled();
		if(ActualuserNameEnable==true){
			System.out.println("username box is Enable & Testcase is passed.....");
		}else {
			System.out.println("username box is not Enable & Testcase is field.....");
		}
		WebElement userPassword=driver.findElement(By.xpath("//input[@name='user_password']"));
		boolean ActualPasswordVisible=userPassword.isDisplayed();
		if(ActualPasswordVisible==true){
			System.out.println("Pasword  box is visible & Testcase is passed.....");
		}else {
			System.out.println("Pasword  box is not visible & Testcase is field.....");
		}
		boolean ActualPasswordEnabe=username.isEnabled();
		if(ActualPasswordEnabe==true){
			System.out.println("Pasword box is Enable & Testcase is passed.....");
		}else {
			System.out.println("Pasword box is not Enable & Testcase is field.....");
		}
		WebElement colourThem =driver.findElement(By.xpath("//select[@class='small']"));
		boolean ActualcolourThemVisible=colourThem.isDisplayed();
		if(ActualcolourThemVisible==true){
			System.out.println("colourThem box is visible & Testcase is passed.....");
		}else {
			System.out.println("colourThem  box is not visible & Testcase is field.....");
		}
		boolean ActualcolourThemEnabe=username.isEnabled();
		if(ActualcolourThemEnabe==true){
			System.out.println("colourThem box is Enable & Testcase is passed.....");
		}else {
			System.out.println("colourThem box is not Enable & Testcase is field.....");
		}
		WebElement langauge = driver.findElement(By.xpath("//select[@name='login_theme']"));
		boolean ActuallangaugeVisible=langauge.isDisplayed();
		if(ActuallangaugeVisible==true){
			System.out.println("langauge box is visible & Testcase is passed.....");
		}else {
			System.out.println("langauge  box is not visible & Testcase is field.....");
		}
		boolean ActuallangaugeEnabe=username.isEnabled();
		if(ActuallangaugeEnabe==true){
			System.out.println("langauge box is Enable & Testcase is passed.....");
		}else {
			System.out.println("langauge box is not Enable & Testcase is field.....");
		}
		WebElement login=driver.findElement(By.xpath("//input[@title='Login [Alt+L]']"));
		boolean ActualloginVisible=login.isDisplayed();
		if(ActuallangaugeVisible==true){
			System.out.println("login box is visible & Testcase is passed.....");
		}else {
			System.out.println("login  box is not visible & Testcase is field.....");
		}
		boolean ActualloginEnabe=username.isEnabled();
		if(ActualloginEnabe==true){
			System.out.println("login box is Enable & Testcase is passed.....");
		}else {
			System.out.println("login box is not Enable & Testcase is field.....");
		}




		username.sendKeys("admin");
		userPassword.sendKeys("parvind");
		colourThem.sendKeys("bluelagoon");
		langauge.sendKeys("US Enlish");
		login.click();









	}



}
