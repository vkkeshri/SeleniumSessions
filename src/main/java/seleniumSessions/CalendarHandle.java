package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalendarHandle {

	static WebDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//VDK//Desktop//selenium//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.skyscanner.co.in/");
		
		driver.findElement(By.id("depart-fsc-datepicker-button")).click();
		
		selectCalendarDate("June 2019", 30);
	}
	
	public static void selectCalendarDate(String month, int day){
	
		boolean flag = false;
		
		Select select = new Select(driver.findElement(By.id("depart-calendar__bpk_calendar_nav_select")));
		select.selectByVisibleText(month);
		
		List<WebElement> datesList = driver.findElements(By.xpath("//tbody//tr//span"));
		System.out.println("Total number of dates in calendar is : "+datesList.size());
		
		List<WebElement> disabledDatesList = driver.findElements(By.className("bpk-calendar-date--blocked"));
		int disabledDatesListCount = disabledDatesList.size();
		System.out.println("Total disabled dates are : "+disabledDatesListCount);
		
		/*if(day<disabledDatesListCount){
			try {
				throw new Exception("Expired date/day "+day+" is passed, please pass the correct date");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}*/
		
		for(int i = disabledDatesListCount; i<datesList.size(); i++){
			String dateText = datesList.get(i).getText();
			System.out.println(dateText);
			if(Integer.parseInt(dateText)==day){
				datesList.get(i).click();
				flag = true;
				break;
			}
			/*else{
				System.out.println("Incorrect date.");
			}*/
		}
		if(flag){
			System.out.println("correct date got selected");
		}else{
			System.out.println("incorrect date");
		}
	}
}
