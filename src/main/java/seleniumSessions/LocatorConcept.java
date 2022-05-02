package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//VDK//Desktop//selenium//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(15000);
		
		//7 locators :
		//1. id : 
		WebElement email = driver.findElement(By.id("username"));
		email.sendKeys("naveen@gmail.com");
		
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("test@123");
		
		WebElement loginbutton = driver.findElement(By.id("loginBtn"));
		loginbutton.click();
		
		//different way to write
		//driver.findElement(By.id("username")).sendKeys("naveen@gmail.com");
		//driver.findElement(By.id("password")).sendKeys("password");
		//driver.findElement(By.id("loginBtn")).click();
		
		//2. name : 
		//driver.findElement(By.name("username")).sendKeys("naveen@gmail.com");
		
		//3. xpath : address of element and it uses properties of element
		//driver.findElement(By.xpath("//*[@id='username']")).sendKeys("naveen@gmail.com");
		//driver.findElement(By.xpath("//*[@id='password']")).sendKeys("test@123");
		
		//4. CSS Selector
		//driver.findElement(By.cssSelector("#username")).sendKeys("naveen@gmail.com");
		
		//5. Class Name : 
		//form-control private-form__control login-email
		//form-control private-form__control login-password m-bottom-3
		//driver.findElement(By.className("login-email")).sendKeys("naveen@gmail.com");
		//driver.findElement(By.className("login-password")).sendKeys("test@123");
		
		//6. linkText : only for link
		//driver.findElement(By.linkText("Sign Up")).click();
		
		//7. Partial Link Text : 
		//driver.findElement(By.partialLinkText("Sign")).click();
	}

}
