/**
 * 
 */
/**
 * @author Nagaraju_Kura
 *
 */
package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserOperations implements IBrowserOperations{
	
	
	WebDriver driver = null;

	@Override
	public WebDriver LaunchBrowser(String browserName) {
		
		if(browserName.trim().equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");			
			driver = new ChromeDriver();
		}else if (browserName.trim().equalsIgnoreCase("firefox")){
			
		}else if(browserName.trim().equalsIgnoreCase("ie")){
			
		}
		 
		
		return driver;
	}

	@Override
	public void LaunchURL(String URL) {
		
	}

	@Override
	public void goBack() {
		
	}

	@Override
	public void maximizeBrowserWindow(WebDriver fd) {
		
	}

	@Override
	public void closeOrQuitWebBrowser(WebDriver fd) {
		
	}
	
	
	 
	
	
}