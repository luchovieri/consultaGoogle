package google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConsultaGoogle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("lst-ib")));		driver.get("http://www.google.com");
		driver.get("http://www.google.com");
		driver.findElement(By.id("lst-ib")).sendKeys("Selenium hq");
		driver.findElement(By.name("btnK")).click();
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}
}
