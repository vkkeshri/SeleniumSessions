package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HTMLUNITConcept {

	public static void main(String[] args) {
		
		WebDriver driver = new HtmlUnitDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());

	}

}
