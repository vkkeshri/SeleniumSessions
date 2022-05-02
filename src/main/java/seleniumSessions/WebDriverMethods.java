package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//VDK//Desktop//selenium//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		
		driver.manage().deleteAllCookies();
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		if(url.contains("com")){
			System.out.println("PASS");
		}
		
		System.out.println(driver.getPageSource());				
	}

}
