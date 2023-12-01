import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class flipkartLogin {
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","Driver\\chromedriver.exe");
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.navigate().to("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[@role='button']")).click();
		driver.findElement(By.xpath("//div[@Class='H6-NpN _3N4_BX']")).click();
		/*
		 * driver.findElement(
		 * By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("8112614936");
		 */driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		 WebElement weObj=driver.findElement(By.xpath("(//span[@class='_2I9KP_'])[1]"));
		 Actions mouseOver= new Actions(driver);
		 mouseOver.moveToElement(weObj).build().perform();
		 driver.findElement(By.xpath("//a[@title='Mobiles']")).click();
		 WebElement scroll=driver.findElement(By.xpath("//img[@alt='iPhone']"));
		 mouseOver.scrollToElement(scroll).build().perform();
		 mouseOver.click(scroll).build().perform();
		 List<WebElement> listGetObj=driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		 for(int i=0;i<listGetObj.size(); i++) {
			WebElement phoneStutus= listGetObj.get(i);
			System.out.println(phoneStutus);
		 }
	}
	
}
