package RahulSir_Parent_Sibling_child_Ancester;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FallowingSibling {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\qwerty\\vinay\\SeleniumAutomation\\Driver\\chromedriver.exe");
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(option);
		driver.get("http://localhost:8888/");
		String ab= driver.getTitle();
		System.out.println(ab);
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("parvind");
		driver.findElement(By.xpath("//input[@name='Login']")).click();
	
		driver.findElement(By.xpath("(//img[@alt='Open Calendar...']/parent::td/preceding-sibling::td)[last()-2]")).click();
		
		
	}








}
