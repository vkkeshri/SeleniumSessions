package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//VDK//Desktop//selenium//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.close();
		//driver.quit();
		System.out.println(driver.getTitle());
		//close -- NoSuchWindowException: no such window: target window already closed
		//quite -- NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
		
		
		
	}

}
