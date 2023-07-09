package learningtestng;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewSelCode {
	public WebDriver driver;
	public ChromeOptions options;
	
	@BeforeMethod
	public void setup() {
		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--start-maximized");
		options.addArguments("--incognito");
		driver = new ChromeDriver(options);
		driver.get("http:tutorialsninja.com/demo");
	}
	@Test(priority = 1)
	public void LoginWithvalidcredentials() throws Exception {
		driver.findElement(By.linkText("My Account")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("input-password")).sendKeys("selenium@123");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}
	@Test(priority = 2)
	public void LoginWithInvalidCredentials() throws Exception {
		driver.findElement(By.linkText("My Account")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda9887@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("input-password")).sendKeys("selenium@1987623");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
