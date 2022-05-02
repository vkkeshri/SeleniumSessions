package seleniumSessions;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HashMapInSelenium {

	public static void main(String[] args) {
		
		// Role based - permission based used case
		// Category manager -> go to the app -> add all the product
		// Customer user -> buy a product -> place an order
		// Admin user -> go to the app -> can see all the order
		// Seller user -> go to the app -> see only those order which are relevant
		// Distributer user -> go to the app -> can see the respective order
		// Delivery boy user -> go to the app -> can see the order and deliver the product
		// Customer care user -> go to the app -> 
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://classic.crmpro.com/index.html");
		/*driver.findElement(By.name("username")).sendKeys("naveenautomation");
		driver.findElement(By.name("password")).sendKeys("Test@123");*/
		
		System.out.println(getCredentialsMap());
		System.out.println(getCredentialsMap().get("admin"));
		String credential_customer = getCredentialsMap().get("admin");
		
		driver.findElement(By.name("username")).sendKeys(getUserName("customer"));
		driver.findElement(By.name("password")).sendKeys(getPassword("customer"));
	}
	
	public static HashMap<String, String> getCredentialsMap(){
		HashMap<String, String> userMap = new HashMap<String, String>();
		
		userMap.put("customer", "naveenautomation:Test@123");
		userMap.put("admin", "arpit:arpit@123");
		userMap.put("distributer", "gulnaz:gulnaz@123");
		userMap.put("seller", "chetna:chetna@9090");
		userMap.put("deliverygirl", "greeshma:greeshma@123");
		
		return userMap;
	}
	
	public static String getUserName(String role){
		String credentials = getCredentialsMap().get(role);
		return credentials.split(":")[0];
	}
	
	public static String getPassword(String role){
		String credentials = getCredentialsMap().get(role);
		return credentials.split(":")[1];
	}

}
