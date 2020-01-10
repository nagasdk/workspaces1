package inheritance;

import org.openqa.selenium.WebElement;

import bsh.This;


	interface mysearchContext{
		WebElement findElement(String locatorExpression);
		<List>WebElement findElements(String locatorExpression);

	}

	
	interface myWebDriver extends mysearchContext{
		void get(String url);
		void close();
		void quit();
	}
	
	
	interface myTakesScreenshot{
		void takePicture();
	}
	
	
	interface myJSExecutor{
		void takeAction();
	}
	
	class myRemoteWebDriver implements myWebDriver,myJSExecutor,myTakesScreenshot{

		public WebElement findElement(String locatorExpression) {
			return null;
		}

		public void get(String url) {
			System.out.println("just priting the String or URL");
		}

		public void close() {
			
		}

		public void quit() {
			
		}

		public void takePicture() {
			
		}

		public void takeAction() {
			
		}

		public <List> WebElement findElements(String locatorExpression) {
			return null;
		}
		
	}
	
	 class myCrDriver extends myRemoteWebDriver{
			
		 	public void get(String url) {
				System.out.println("myCr Driver hit URL:"+ url);
			}

	 }

public class Inheritance1 {

	public static void main(String[] args) {

		myWebDriver driver = new myCrDriver();
		myCrDriver driver1 = new myCrDriver();
		driver1.get("http://google.com");
		driver.get("hello");
		System.out.println("test");
		System.out.println(Inheritance1.class.getClass().getTypeName());
	}

}

