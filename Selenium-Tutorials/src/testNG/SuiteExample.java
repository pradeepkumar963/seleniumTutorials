package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

//aim: open chrome and go to
// 1.google.co.in 2.bing.com 3.yahoo.com
public class SuiteExample {
	WebDriver driver;
	long startTime;
	long endTime;
	@BeforeSuite
	public void openBrowser() {
		startTime=System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "F:\\TESTING RELATED\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	@Test
	public void openGoogle() {	
		driver.get("http://www.google.co.in");
	}
	@Test
	public void openBing() {
		driver.get("http://www.bing.com");
	}
	@Test
	public void openYahoo() {	
		driver.get("http://www.yahoo.com");
	}
	@AfterSuite
	public void closeBrowser() {
		driver.quit();
		endTime=System.currentTimeMillis();
		long totalTime=System.currentTimeMillis();
		System.out.println("Total Time : "+totalTime);
	}
}
