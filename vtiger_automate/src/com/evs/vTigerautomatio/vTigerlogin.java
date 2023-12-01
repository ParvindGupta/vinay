package com.evs.vTigerautomatio;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class vTigerlogin {
	public  WebDriver driver=null;
	public void loginVtiger() {
		 driver=new ChromeDriver();
		driver.get("http:/localhost:8888");
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("parvind");
		driver.findElement(By.xpath("//input[@name='Login']")).click();

	}

}
