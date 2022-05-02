package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		//1. Launch the browser -- chrome
		System.setProperty("webdriver.chrome.driver", "C://Users//VDK//Desktop//selenium//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//2. enter url
		driver.get("https://www.google.com");
		
		//3. get the title of page
		String title = driver.getTitle();
		System.out.println("Page title is : "+title);
		
		//4. verification point:
		if(title.equals("Google")){
			System.out.println("PASS");
		}else{
			System.out.println("FAIL");
		}
	}
}
