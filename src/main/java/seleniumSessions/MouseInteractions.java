package seleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseInteractions {

	public static WebDriver driver;
	
	public static void main(String[] args) {

		int j=0;
		String[] itemsNeeded = {"Cucumber","Brocolli","Beetroot"};
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
        driver.get("https://www.amazon.com/");
        Actions act = new Actions(driver);       
        act.moveToElement(driver.findElement(By.xpath("//span[text()='Account & Lists']"))).build().perform();
	}

}
