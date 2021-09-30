import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// System.setProperty("webdriver.chrome.driver","‪D:\\Eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mvnrepository.com/artifact/junit/junit/4.13.2");
		System.out.print("URL - " + driver.getCurrentUrl());
		Thread.sleep(2000);
	}
}
