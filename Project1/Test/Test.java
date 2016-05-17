package Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Test {
	
	
 public static String baseurl_TestEnv;
	 
	 public static final String ANSI_RESET = "\u001B[0m";
	 public static final String ANSI_RED = "\u001B[31m";
	 public static final String ANSI_GREEN = "\u001B[32m";
	 
	 static WebDriver driver,driver2,driver3,driver4, driver5, driver6;
		
	    
	    
	    
// TEST Scenario: Click Search Btn -verify results page - map / listing search / sort by / listing per page
	     public static void main ()  throws InterruptedException, IOException, Exception{

	     	System.out.println("Verify_SERP_Listing_Count_Validation.......");
	     	
	     	 System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		     driver = new ChromeDriver();
	         driver.get(baseurl_TestEnv);
	         driver.manage().window().maximize();
	     	
	     	
	     }
	     
	     
	     

}
