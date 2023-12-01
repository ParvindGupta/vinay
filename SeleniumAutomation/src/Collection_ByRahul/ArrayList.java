package Collection_ByRahul;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArrayList {

	public static void main(String[] args) {
		//		hasSet();
		//		treeSetString();
		//		lnkdHashSet();
		//		treeSetInteger();
		//		linked();
		vtigerAutomate();
	}
	//Set is a Interface 
	//Set is a three child 1-HashSet 2-TreeSet 3-LinkedHashSet
	public static void hasSet() {
		Set<String> hs=new HashSet<String>();
		hs.add("Hello Parvind");
		hs.add("Hi Parvind");
		hs.add("Parvind Hello");
		hs.add("Parvind Hii");
		for(String nm : hs) {
			System.out.println(nm);
		}
		System.out.println("  ");
	}

	public static void treeSetString() {
		Set<String> wetreeSet=new TreeSet<String>();

		wetreeSet.add("Govind");
		wetreeSet.add("Arvind");
		wetreeSet.add("Sarvind");
		wetreeSet.add("Parvind");
		wetreeSet.add("Jay");
		wetreeSet.add("SitaRam");
		for (String mn:wetreeSet) {
			System.out.println(mn);	
		}
		System.out.println("  ");
	}
	public static void lnkdHashSet() {
		Set<String> welinkedHashSet= new LinkedHashSet<>();
		welinkedHashSet.add("mondh");
		welinkedHashSet.add("Mondh Bhadohi");
		for(String km:welinkedHashSet) {
			System.out.println(km);
		}
		System.out.println("  ");
	}


	public static void treeSetInteger() {
		Set<Integer> wetreeSetInt=new TreeSet<Integer>();

		wetreeSetInt.add(120);
		wetreeSetInt.add(98);
		wetreeSetInt.add(56);
		wetreeSetInt.add(234);
		for(Integer ab : wetreeSetInt) {
			System.out.println(ab);
		}
		System.out.println("  ");
	}


	public static void linked() {

		List<String> lnkList=new LinkedList<String>();
		lnkList.add("Parvind Gupta");
		lnkList.add("PParvind Gupta");
		lnkList.add("parvind Gupta");
		int weSize=lnkList.size();
		System.out.println(weSize);
		String weget=lnkList.get(2);
		System.out.println(weget);

	}

	public static void vtigerAutomate() {
		WebDriver driver =new ChromeDriver();
		String weHandlecode=driver.getWindowHandle();
		System.out.println(weHandlecode);
		driver.get("http:/localhost:8888");

		//        
		//        System.out.println(ab);

		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("parvind");
		driver.findElement(By.name("Login")).click();
		driver.findElement(By.linkText("Feedback")).click();
		driver.findElement(By.linkText("Help")).click();
		driver.findElement(By.linkText("About Us")).click();
		Set<String> ab=driver.getWindowHandles();
		for(String handlValue:ab) {
			System.out.println(handlValue);
			driver.switchTo().window(handlValue);
			String weTitle=driver.getTitle();
			if(weTitle.equalsIgnoreCase("")) {
				break;
			}
		}

		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Your are feedback description box");

	}


}
