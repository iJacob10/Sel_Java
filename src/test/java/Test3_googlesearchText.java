import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import test.Test3_googlesearchPAGE;

public class Test3_googlesearchText {
	static WebDriver driver;

	public static void main(String[] args) {
		googlesearchText();

	}

	public static void googlesearchText() {
		driver = new ChromeDriver();

		Test3_googlesearchPAGE searchobj = new Test3_googlesearchPAGE(driver);

		driver.get("https://www.google.com/");
		searchobj.setTextInSearchBox("Automation step to step");
		searchobj.clickSearchButton();
		System.out.println("Test executed with POM");
		driver.close();
	}
}
