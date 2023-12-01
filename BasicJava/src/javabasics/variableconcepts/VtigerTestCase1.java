package javabasics.variableconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VtigerTestCase1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\qwerty\\vinay\\SeleniumAutomation\\Driver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		String pageTitle=driver.getTitle();
		System.out.println(pageTitle);
		String pageurl=driver.getCurrentUrl();
		System.out.println(pageurl);


		//		1..........user_name.........??

		Dimension sk=driver.findElement(By.xpath("//input[@name='user_name']")).getSize();
		int h=sk.height;
		System.out.println(h);
		if(h==22) {
			System.out.println("Username test case height should be 22,is passed.....");
		}else {
			System.out.println("Username test case height should be 22,is field.....");
		}
		int w=sk.width;
		System.out.println(w);
		if(w==140) {
			System.out.println("Username test case height should be 149,is passed.....");
		}else {
			System.out.println("Username test case height should be 140,is field.....");
		}
		//	2.........user_password..........??

		Dimension userPasswordSize=driver.findElement(By.xpath("//input[@name='user_password']")).getSize();
		int PassHight=userPasswordSize.height;
		System.out.println(PassHight);

		if(PassHight==23) {
			System.out.println(" Password box Test Case height should be 23,is passed......");
		}else {
			System.out.println(" Password box Test Case height should be 23,is field......");
		}

		int PassWight=userPasswordSize.width;
		System.out.println(PassWight);
		if(PassWight==140) {
			System.out.println("Password box weidth should be 149,is passed.....");
		}else {
			System.out.println("Password box weidth should be 140,is field.....");
		}

		////	.......login....??

		Dimension loginSize=driver.findElement(By.xpath("//input[@title='Login [Alt+L]']")).getSize();
		int loginHeigh=loginSize.height;
		System.out.println(loginHeigh);
		if(loginHeigh==40) {
			System.out.println(" loginSize box Test Case height should be 40 ,is passed......");
		}else {
			System.out.println(" loginSize box Test Case height should be 40 ,is field......");
		}
		int loginWidth=loginSize.width;
		System.out.println(loginWidth);
		if(loginWidth==138) {
			System.out.println(" loginSize box Test Case height should be 138,is passed......");
		}else {
			System.out.println(" loginSize box Test Case height should be 138,is field......");
		}
		//...username..Cordinate.X--&--Y...........??

		Point username= driver.findElement(By.xpath("//input[@name='user_name']")).getLocation();
		int userNmaeX=username.x;
		System.out.println(userNmaeX);
		if(userNmaeX==632) {
			System.out.println("Username box X Cordinate should be <632>, is passed....");
		}else {
			System.out.println("Username box X Cordinate should be <632>, is failed....");
		}
		int userNameY=username.y;
		System.out.println(userNameY);
		if(userNameY==230) {
			System.out.println("Username box Y Cordinate should be<230>,is passed....");
		}else {
			System.out.println("Username box Y Cordinate should be <230>,is failed....");
		}
		//  .......userPasswordCordinate(X,Y)........?? \\     

		Point userPasswordCordinate=driver.findElement(By.xpath("//input[@name='user_password']")).getLocation();
		int X=userPasswordCordinate.x;
		System.out.println(X);
		if(X==632) {
			System.out.println("Password box X Cordinate should be <632>,is passed.....");
		}else {
			System.out.println("Password box X Cordinate should be <632>,is failed.....");
		}
		int Y=userPasswordCordinate.y;
		System.out.println(Y);
		if(Y==262) {
			System.out.println("Password box Y Cordinate should be <262>,is passed....");
		}else {
			System.out.println("Password box Y Cordinate should be <262>,is failed....");
		}

		// .....loginCordinate (x,y)........\\       

		Point loginCordinate=driver.findElement(By.xpath("//input[@title='Login [Alt+L]']")).getLocation();
		int x=loginCordinate.x;
		System.out.println(x);
		if(x==632) {
			System.out.println(" Login Button X Cordinate should be <632>is passed......");
		}else {
			System.out.println(" Login Button X Cordinate should be <632>is failed......");
		}
		int y=loginCordinate.y;
		System.out.println(y);
		if(y==350) {
			System.out.println("Login Button Y Cordinate  should be <350>,is passed....");
		}else {
			System.out.println("Login Button Y Cordinate  should be <350>,is failed....");
		}
		//       ............. Enter Username<username>.........//

		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");

		//...........user_password.............//		

		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("parvind");

		//............Login......//

		driver.findElement(By.xpath("//input[@title='Login [Alt+L]']")).click();
		driver.findElement(By.linkText("Marketing")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.xpath("//img[@title='Create Lead...']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Parvind");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Gupta");
        driver.findElement(By.xpath("//input[@name='company']")).sendKeys("Expert View Automation ");
        driver.findElement(By.xpath("//input[@id='designation']")).sendKeys("Institute");
        WebElement CategoryLead=driver.findElement(By.xpath("//select[@name='leadsource']"));
        Select  selectleadsource = new Select(CategoryLead);
        selectleadsource.selectByVisibleText("Employee");
       WebElement Status = driver.findElement(By.xpath("(//select[@class='small'])[4]"));
        Select statusFix=new Select(Status);
        statusFix.selectByVisibleText("Cold");
        driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("545454");
        driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("8112614936");
        driver.findElement(By.xpath("//input[@name='fax']")).sendKeys("JAY MATA DI");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("parvndgupta48@gmail.com");
        driver.findElement(By.xpath("(//input[@name='assigntype'])[1]")).click();
        driver.findElement(By.xpath("//textarea[@name='lane']")).sendKeys("Narttampur URF Chamrupatti Mondh");
        driver.findElement(By.xpath("//input[@id='code']")).sendKeys("221406");
        driver.findElement(By.xpath("//input[@id='country']")).sendKeys("INDIA");
        driver.findElement(By.xpath("//input[@id='city']")).sendKeys("BHADOHI (MONDH)");
        driver.findElement(By.xpath("//input[@id='state']")).sendKeys("UTTAR PRADESH");
        driver.findElement(By.xpath("(//textarea[@class='detailedViewTextBox'])[2]")).sendKeys("My name is Parvind Gupta S/O Mahajan gupta");
       driver.findElement(By.xpath("(//input[@style='width:70px'])[3]")).click();






























	}

}
