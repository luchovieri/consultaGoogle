package prueba;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PruebaTecnicaKometSales {
	
	public static String resExitoso = "Tracking - AWB Summary";
	public static String resFallido = "Usuario o contraseña incorrecto";
	public static String usuario = "gp";
	public static String claveCorrecta = "demo";
	public static String claveIncorrecta = "demo2";
	
	@Test
	public void loginExitoso() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.get("https://app.kometsales.com ");
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("txtUserName")))).sendKeys(usuario);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("txtPassword")))).sendKeys(claveCorrecta);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"frmSignin\"]/button")))).click();
		String resultado = driver.getTitle();
		assertEquals(resultado, resExitoso);
		driver.close();
		driver.quit();
	}
	
	@Test
	public void loginFallido() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.get("https://app.kometsales.com ");
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("txtUserName")))).sendKeys(usuario);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("txtPassword")))).sendKeys(claveIncorrecta);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"frmSignin\"]/button")))).click();
		String resultado = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[1]/div/div[2]/div[2]")))).getText();
		assertEquals(resultado, resFallido);
		driver.close();
		driver.quit();
	}

}
