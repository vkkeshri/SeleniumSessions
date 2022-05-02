package seleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SyncWait {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//VDK//Desktop//selenium//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Implicit wait will apply only on webelement
		//global wait - this is applied on all the web elements
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Thread.sleep(10000); // Static wait
		
		driver.get("https://app.hubspot.com/login");
		
		//Explicit wait : it can be applied on a specific element
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		wait.until(ExpectedConditions.titleContains("HubSpot Login"));
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("username")).sendKeys("vkkeshri@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Test123!");
		driver.findElement(By.id("loginBtn")).click();
		
		By header = By.xpath("//h1[@class='private-header__heading']");
		wait.until(ExpectedConditions.presenceOfElementLocated(header));
		
		boolean flag = driver.findElement(By.xpath("//h1[@class='private-header__heading']")).isDisplayed();
		System.out.println(flag);
		
		System.out.println(driver.getTitle());

	}

}
