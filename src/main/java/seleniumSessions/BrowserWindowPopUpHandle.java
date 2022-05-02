package seleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowPopUpHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Users//VDK//Desktop//selenium//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.findElement(By.linkText("Good PopUp #3")).click();
		
		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> it = handles.iterator();
		
		String mainWindowID = it.next();
		System.out.println("Main window id is : "+mainWindowID);
		
		String childWindowID = it.next();
		System.out.println("Child window id is : "+childWindowID);
		
		driver.switchTo().window(childWindowID);
		
		System.out.println("Child window title is : "+driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(mainWindowID);
		
		System.out.println("Main window title is : "+driver.getTitle());
		

	}

}
