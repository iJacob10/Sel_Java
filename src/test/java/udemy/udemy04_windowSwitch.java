package udemy;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class udemy04_windowSwitch {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[contains(text(),\"Multiple Windows\")]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),\"Click Here\")]")).click();
		
		//get all the windows that are open
		Set<String> windows=driver.getWindowHandles(); //[parentid, childid]
		Iterator<String> it=windows.iterator();
		
		String parentid=it.next(); //1st window
		String childid=it.next();   //2nd window
		
		driver.switchTo().window(childid);
		System.out.println("Second window: "+driver.findElement(By.cssSelector("h3")).getText());	

		driver.switchTo().window(parentid);
		System.out.println("First window: "+driver.findElement(By.cssSelector("h3")).getText());
		
		
		driver.get("https://www.arcesium.com/careers.html#positions");
		driver.findElement(By.xpath("(//a[contains(text(),\"Technology\")])[1]")).click();
		//get all the windows that are open
		Set<String> windows2=driver.getWindowHandles(); //[parentid, childid]
		Iterator<String> it2=windows2.iterator();
		
		String parentid2=it2.next(); //1st window
		System.out.println("First window: "+driver.findElement(By.xpath("(//h1[contains(text(),\"Careers at Arcesium\")])[1]")).getText());	

		String childid2=it2.next();   //2nd window
		driver.switchTo().window(childid2);
		System.out.println("Second window: "+driver.findElement(By.xpath("//h2[@class=\"h3 fontcolorb9a00efb6f5c6e8a56a91390486728b2 fontalign-center\"]")).getText());
		System.out.println("Location:"+ driver.findElement(By.xpath("//h2[@class=\"h3 fontcolorb9a00efb6f5c6e8a56a91390486728b2 fontalign-center\"]")).getText().split(" ")[0]);
		
		driver.quit();
		
		//multiple windows, click heare .. ca[pture new window
	}

}
