package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class OpenGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.Open chrome
		//2.Google home page
		
	System.setProperty("webdriver.chrome.driver", "F:\\TESTING RELATED\\Selenium\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("http://google.com");
	//driver.quit();
	
	//enter the search term
	//click the link
	 driver.findElement(By.name("q")).sendKeys("Tirupur"+Keys.ENTER);
		
	}

}



