package udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class udemy02_explicitWait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait ew=new WebDriverWait(driver, 5);
		driver.get("https://www.itgeared.com/demo/1506-ajax-loading.html");
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/a[2]")).click();
		ew.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"results\"]")));
		System.out.print(driver.findElement(By.xpath("//*[@id=\"results\"]")).getText());	
		driver.close();
		driver.quit();

	}

}
