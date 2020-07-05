package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\TESTING RELATED\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Window.html");
		
		String oldWindow=driver.getWindowHandle();
		WebElement firstButton=driver.findElement(By.id("home"));
		firstButton.click();
		
		Set<String> handles=driver.getWindowHandles();
		for (String string : handles) {
			driver.switchTo().window(string);
		}
		WebElement clickEdit=driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a/h5"));
		clickEdit.click();
		driver.close();
		driver.switchTo().window(oldWindow);
		
		WebElement openWindows=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		openWindows.click();
		int NumperOfWindowsOpened=driver.getWindowHandles().size();
		System.out.println("Number Of Windows Opened : " + NumperOfWindowsOpened);
		
		WebElement dontCloseMe=driver.findElement(By.id("color"));
		dontCloseMe.click();
		
		Set<String> dontClose=driver.getWindowHandles();
		
		for (String newWindows : dontClose) {
			if(!newWindows.equals(oldWindow)) {
				driver.switchTo().window(newWindows);
				driver.close();
			}
		}
		driver.quit();
	}

}
