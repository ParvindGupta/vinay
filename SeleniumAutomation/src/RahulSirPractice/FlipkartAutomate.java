package RahulSirPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class FlipkartAutomate {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver",
				"Driver//chromedriver.exe");

		ChromeOptions Option = new ChromeOptions();
		Option.addArguments("remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(Option);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();		
		WebElement maintitle=driver.findElement(By.xpath("//input[@class='_3704LK']"));
		maintitle.clear();
		maintitle.sendKeys("mobile",Keys.ENTER);
		Thread.sleep(5000);
		WebElement eleVariabl=driver.findElement(By.xpath("//span[text()='Electronics']"));
		Actions we=new Actions(driver);
		we.moveToElement(eleVariabl).build().perform();
		List<WebElement> moblielistBarr=driver.findElements(By.xpath("//a[@title='Mobiles']/following-sibling::a"));
		for(int j=0; j<moblielistBarr.size(); j++) {
		WebElement ca=moblielistBarr.get(j);
		String mobileLis= ca.getText();
		System.out.println(mobileLis);
	}





	}

}
