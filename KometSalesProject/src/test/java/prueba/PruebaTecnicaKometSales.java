package prueba;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PruebaTecnicaKometSales {
	
	@Test
	public void consultarPagina() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("lst-ib")));		driver.get("http://www.google.com");
		driver.get("https://www.seleniumhq.org");
		driver.findElement(By.id("menu_download")).click();
		String title= driver.getTitle();
		assertEquals(title, "Downloads");
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}

}
