import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1_googlesearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1_googlesearch1();

	}

	public static void test1_googlesearch1() {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		WebElement ele = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		ele.sendKeys("Automation Step by Step");
		ele.sendKeys(Keys.ENTER);
		driver.close();
		System.out.println("Test completed successfully");
	}

}
