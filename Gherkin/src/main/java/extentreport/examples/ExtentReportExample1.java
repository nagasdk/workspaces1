package extentreport.examples;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ExtentHtmlReporterConfiguration;

public class ExtentReportExample1 {

	WebDriver driver = null;
	DesiredCapabilities dc = new DesiredCapabilities();
	ExtentHtmlReporter ehr = new ExtentHtmlReporter("src/main/resources/ExtentReports/ExtentReportExample1.html");
	ExtentReports extentReports = new ExtentReports();
	

	
	
	@BeforeTest
	public void beforeTest(){
		extentReports.attachReporter(ehr);
	}

	@Test
	public void test() throws IOException{
		ExtentTest logger = null;
		
		
		try{
			logger = extentReports.createTest("test1","ExtentReportExample1-Description");
			logger.log(Status.INFO, "Launching the Browser");
			
			//driver = openBrowser("chrome", dc, driver);
			driver = openBrowser("chrome", dc, driver);
			if( driver!=null){
				logger.log(Status.PASS, "Browser Launched");	
			}else{
				logger.log(Status.FAIL, "Browser Launched");
			}
						
				
		}catch(Exception e){
			logger.log(Status.FAIL,e.getMessage());
		}finally{
			extentReports.flush();
		}
		
		ExtentTest logger2 =null;
		try{
			
			logger2 = extentReports.createTest("test2","Extension of ExtentReportExample1");
			logger2.log(Status.INFO, "Test2 begins");
			driver.get("http://facebook.com");
			logger2.log(Status.PASS,"Navigated across Facebook Page");
			Thread.sleep(3000);
			driver.manage().window().maximize();
			logger2.log(Status.PASS,"Window Maximized");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='u_0_m123']")).sendKeys("hello");
			
		}catch(Exception e){
			
			logger2.log(Status.FAIL,e.getMessage());

			try {
				takeSnapShot(driver, "D:\\eclipse-jee-oxygen\\workspaces1\\Gherkin\\src\\main\\java\\extentreport\\example\\error.png");
				//logger2.addScreenCaptureFromPath("could not find the username element", "D:\\eclipse-jee-oxygen\\workspaces1\\Gherkin\\src\\main\\java\\extentreport\\example\\error.png");
				logger2.fail("Failed to get reference of login element",MediaEntityBuilder.createScreenCaptureFromPath("D:\\eclipse-jee-oxygen\\workspaces1\\Gherkin\\src\\main\\java\\extentreport\\example\\error.png").build());				
			} catch (Exception e1) {
				logger2.log(Status.FAIL,e1.getMessage()+"\n........ssdfsdfas");
			}
			
		}finally{
			extentReports.flush();	
		}
		
	}

	@AfterTest
	public void afterTest(){
		driver.close();
		driver.quit();
	}

	
    public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

        //Convert web driver object to TakeScreenshot
        TakesScreenshot scrShot =((TakesScreenshot)webdriver);

        //Call getScreenshotAs method to create image file
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

         //Move image file to new destination
        File DestFile=new File(fileWithPath);

         //Copy file at destination
         FileUtils.copyFile(SrcFile, DestFile);

    }
	
	
	public  WebDriver openBrowser(String browserName,DesiredCapabilities dc, WebDriver fd ) {
		try{
			System.out.println("open chrome browser2");
			dc.setCapability("name", "ExtentReportExample1");
			
			if(browserName.equalsIgnoreCase("chrome")){
				System.setProperty("webdriver.chrome.driver", "src/main/resources/chrome78v/chromedriver.exe");
				dc.setCapability(CapabilityType.BROWSER_NAME, "chrome");
				fd = new ChromeDriver(dc);				
			}else if(browserName.equalsIgnoreCase("firefox")){
				System.setProperty("webdriver.chrome.driver", "src/main/resources/chrome78v/chromedriver.exe");
				dc.setCapability(CapabilityType.BROWSER_NAME, "chrome");				
				
			}else if(browserName.equalsIgnoreCase("ie")){
				System.setProperty("webdriver.ie.driver","src/main/resources/ie/IEDriverServer.exe");
				DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();				
				capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
				capabilities.setCapability(InternetExplorerDriver.UNEXPECTED_ALERT_BEHAVIOR, "ignore");
				dc.setCapability(CapabilityType.BROWSER_NAME, "IE");				
				fd = new InternetExplorerDriver(capabilities);
			}
			
			fd.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);			


		}catch(Exception e){
			e.printStackTrace();
		}
		return fd;
	}
	
	
	
	
	
}
