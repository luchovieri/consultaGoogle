package prueba;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PruebaTecnicaKometSales {
	
	@Test
	public void consultarPagina() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.get("https://www.seleniumhq.org");
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("menu_download")))).click();
		String title= driver.getTitle();
		assertEquals(title, "Downloads");
		driver.close();
		driver.quit();
	}

}
