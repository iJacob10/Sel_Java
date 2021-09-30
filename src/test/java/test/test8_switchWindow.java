package test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test8_switchWindow {
	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

// Load the website
		driver.get("http://www.naukri.com/");

// It will return the parent window name as a String
		String parent = driver.getWindowHandle();
		Thread.sleep(2000);
		Set<String> s = driver.getWindowHandles();
		Thread.sleep(2000);
// Now iterate using Iterator
		Iterator<String> I1 = s.iterator();

		while (I1.hasNext()) {

			String child_window = I1.next();

			if (!parent.equals(child_window)) {
				driver.switchTo().window(child_window);

				System.out.println(driver.switchTo().window(child_window).getTitle());
				Thread.sleep(2000);
				driver.close();
			}

		}
//switch to the parent window
		driver.switchTo().window(parent);
		driver.quit();
	}
}