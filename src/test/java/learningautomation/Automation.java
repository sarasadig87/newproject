package learningautomation;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Automation {
public static WebDriver driver;
public static ChromeOptions options;
	public static void main(String[] args) {
		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--start-maximized");
		options.addArguments("--incognito");
		driver = new ChromeDriver(options);
		driver.get("http://walmart.com");
		
	}

}
