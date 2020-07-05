package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTipExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\TESTING RELATED\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/tooltip.html");
		
		WebElement text=driver.findElement(By.id("age"));
		String title=text.getAttribute("title");
		System.out.println(title);
		
		
	}

}
