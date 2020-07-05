package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\TESTING RELATED\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/frame.html");
		
		driver.switchTo().frame(0);
		WebElement button=driver.findElement(By.id("Click"));
		button.click();
		
		String text=driver.findElement(By.id("Click")).getText();
		System.out.println(text);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		WebElement button1=driver.findElement(By.id("Click1"));
		button1.click();
		
		String text1=driver.findElement(By.id("Click1")).getText();
		System.out.println(text1);
		
		driver.switchTo().defaultContent();
		
		List<WebElement> noOfFrames=driver.findElements(By.tagName("iframe"));
		int size=noOfFrames.size();
		System.out.println(size);
	}

}
