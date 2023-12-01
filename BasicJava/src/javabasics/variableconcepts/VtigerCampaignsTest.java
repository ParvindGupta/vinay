package javabasics.variableconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VtigerCampaignsTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dell\\Desktop\\qwerty\\vinay\\SeleniumAutomation\\Driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888/");
        driver.findElement(By.xpath("(//input[@class='small'])[1]")).sendKeys("admin");
        driver.findElement(By.xpath("(//input[@class='small'])[2]")).sendKeys("parvind");
        WebElement weColorThem=driver.findElement(By.xpath("(//select[@style='width:70%'])[1]"));
        Select ThemeColor = new Select(weColorThem);
        ThemeColor.selectByVisibleText("bluelagoon");
        WebElement welanguage=driver.findElement(By.xpath("(//select[@style='width:70%'])[2]"));
        Select Language = new Select(welanguage);
        Language.selectByVisibleText("US English");
        driver.findElement(By.xpath("//input[@title=\"Login [Alt+L]\"]")).click();
        driver.findElement(By.linkText("Marketing")).click();
        driver.findElement(By.linkText("Campaigns")).click();
        driver.findElement(By.xpath("//img[@title='Create Campaign...']")).click();
        driver.findElement(By.xpath("//input[@name='campaignname']")).sendKeys("parvind");
       WebElement CompanyType= driver.findElement(By.xpath("(//select[@class='small'])[5]"));
     Select SeComType=  new Select(CompanyType);
     SeComType.selectByVisibleText("Conference");
     driver.findElement(By.xpath("//input[@name='targetaudience']")).sendKeys("100");
     driver.findElement(By.xpath("//input[@name='sponsor']")).sendKeys("PAPA");
     driver.findElement(By.xpath("//input[@name='numsent']")).sendKeys("200");
     driver.findElement(By.xpath("name=\"campaign_no\"")).sendKeys("Expert View Automation");
     
//        driver.findElement(By.xpath("(//input[@class='small'])[2]")).sendKeys("parvind");
//        driver.findElement(By.xpath("(//input[@class='small'])[2]")).sendKeys("parvind");
//        driver.findElement(By.xpath("(//input[@class='small'])[2]")).sendKeys("parvind");
//        driver.findElement(By.xpath("(//input[@class='small'])[2]")).sendKeys("parvind");
//        driver.findElement(By.xpath("(//input[@class='small'])[2]")).sendKeys("parvind");
//        driver.findElement(By.xpath("(//input[@class='small'])[2]")).sendKeys("parvind");
       
        
        
        
	}

}
