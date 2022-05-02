package seleniumSessions;

import java.util.HashMap;

import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserOptions {

	public static ChromeOptions getChromeOptions(String headless, String imageDisabled){
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--start-maximized");
		co.addArguments("--ignore-certificate-errors");
		co.addArguments("--disable-popup-blocking");
		co.addArguments("--incognito");
		
		if(headless.equals("yes")){
			co.addArguments("--headless");
		}
		
		if(imageDisabled.equals("yes")){
			HashMap<String, Object> images = new HashMap<String, Object>();
			images.put("images", 2);
			HashMap<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("profile.default_content_setting_values", images);
			co.setExperimentalOption("prefs", prefs);
		}
		return co;
	}
}
