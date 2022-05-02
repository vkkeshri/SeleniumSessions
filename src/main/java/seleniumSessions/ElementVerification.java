package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVerification {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//VDK//Desktop//selenium//chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.crmpro.com/register/");
		
		WebElement submitButton = driver.findElement(By.id("submitButton"));
		System.out.println(submitButton.isDisplayed());
		System.out.println(submitButton.isEnabled());
		
		WebElement agreeTerms = driver.findElement(By.name("agreeTerms"));
		System.out.println(agreeTerms.isSelected());
		agreeTerms.click();
		System.out.println(agreeTerms.isSelected());
		
		System.out.println(submitButton.isDisplayed());
		System.out.println(submitButton.isEnabled());
		
		

	}

}
