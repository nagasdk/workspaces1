package com.selenium;

import org.openqa.selenium.WebDriver;

public interface IBrowserOperations {

	public WebDriver LaunchBrowser(String browserName);
	public void LaunchURL(String URL);
	public void goBack();
	
	public void maximizeBrowserWindow(WebDriver fd);
	public void closeOrQuitWebBrowser(WebDriver fd);
	
	
	
}
