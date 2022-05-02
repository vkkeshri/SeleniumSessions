package seleniumSessions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Read_Prop {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		Properties prop = new Properties();
		
		try {
			FileInputStream ip = new FileInputStream("C:/Users/VDK/Desktop/eclipse/workspace/MaySeleniumSessions/"
					+ "src/main/java/configuration/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//System.out.println(prop.getProperty("browser"));
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")){
			WebDriverManager.chromedriver().setup();
			if(prop.getProperty("headless").equals("yes")){
				ChromeOptions co = new ChromeOptions();
				co.addArguments("--headless");
				driver = new ChromeDriver(co);
			}else{
				driver = new ChromeDriver();
			}			
		}else if(browserName.equals("ff")){
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}else if(browserName.equals("IE")){
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}else if(browserName.equals("opera")){
			WebDriverManager.operadriver().setup();
			driver = new OperaDriver();
		}else{
			System.out.println("Please mention the correct browser name or browser name is not defined.");
		}
		
		driver.get(prop.getProperty("url"));
		
	}

}
