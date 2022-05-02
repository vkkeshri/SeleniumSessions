package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickConcept {

	static WebDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//VDK//Desktop//selenium//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement rightClickBtn = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		Actions action = new Actions(driver);
		
		action.contextClick(rightClickBtn).build().perform();
		
		WebElement copyElement = driver.findElement(By.className("context-menu-icon-copy"));
		//System.out.println(copyElement.getText());
		//copyElement.click();
		
		/*String xpathVal = "//ul[@class='context-menu-list context-menu-root']/li[contains(@class,'context-menu-item context-menu-icon')]";
		List<WebElement> optionsList = driver.findElements(By.xpath(xpathVal));
		
		for(int i=0; i<optionsList.size(); i++){
			String optionValue = optionsList.get(i).getText();
			System.out.println(optionValue);
			if(optionValue.equals("Paste")){
				optionsList.get(i).click();
				break;
			}
		}*/
		String xpathVal = "//ul[@class='context-menu-list context-menu-root']/li[contains(@class,'context-menu-item context-menu-icon')]";
		
		if(clickOnRightClickOption(xpathVal, "Paste")){
			System.out.println("PASS");
		}else{
			System.out.println("FAIL");
		}
	}
	/**
	 * This method is used to select value option after right click
	 * @param selectValue
	 * @return 
	 */
	public static boolean clickOnRightClickOption(String xpathVal, String selectValue){
		boolean flag = false;
		List<WebElement> optionsList = driver.findElements(By.xpath(xpathVal));
		
		for(int i=0; i<optionsList.size(); i++){
			String optionValue = optionsList.get(i).getText();
			System.out.println(optionValue);
			if(optionValue.equals(selectValue)){
				optionsList.get(i).click();
				flag = true;
				break;
			}
		}
		return flag;
	}
}
