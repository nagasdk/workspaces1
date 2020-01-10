package com.seleniumscripts;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.selenium.BrowserOperations;

public class Script1 {
	static WebDriver driver =null;

	public static void main(String[] args) throws NoSuchElementException{

		BrowserOperations bo = new BrowserOperations();
		driver = bo.LaunchBrowser("chrome");
		
		
		driver.get("http://google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		
		Set<Cookie> allCookies =  driver.manage().getCookies();
		for(Cookie ck: allCookies){
			System.out.println(ck.getName()+"-"+ck.getValue());
		}
		List<WebElement> wes = driver.findElements(By.className("gLFyf gsfi"));
		System.out.println(wes.size());
		
		
		Cookie cookie1= new Cookie("test", "1234");
		driver.manage().addCookie(cookie1);
		driver.manage().addCookie( new Cookie("test2","value2"));
		driver.manage().addCookie( new Cookie("test3","value3"));
		driver.manage().addCookie( new Cookie("test4","value4"));
		
		driver.close();
		driver.quit();
		//driver.navigate().
		//driver.findElement(By.)
	}

	
	@SuppressWarnings("deprecation")
	public static WebDriver LaunchBrowser(String browserName) {
		
		if(browserName.trim().equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
			
			ChromeOptions chromeoptions = new ChromeOptions();
      	    chromeoptions.addArguments("--disable-extensions");
			chromeoptions.addArguments("test-type=webdriver");
			chromeoptions.addArguments("--ignore-certificate-errors");
			chromeoptions.addArguments("--disable-web-security");

			DesiredCapabilities dc= new DesiredCapabilities();			
			dc.setCapability("browserName", "chrome");
			dc.setCapability(ChromeOptions.CAPABILITY, chromeoptions);			
			
			
			driver = new ChromeDriver(chromeoptions);
			
			
			
		}else if (browserName.trim().equalsIgnoreCase("firefox")){
			
		}else if(browserName.trim().equalsIgnoreCase("ie")){
			
		}
		 
		
		return driver;
	}
}
