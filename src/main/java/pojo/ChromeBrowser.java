package pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class ChromeBrowser {
	
	public static WebDriver launchBrowser() {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "D:\\Java + Eclipse Installation\\ChromeDriverUpdated\\chromedriver.exe");
//	    WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://kite.zerodha.com/");
		return driver;
	}

}
