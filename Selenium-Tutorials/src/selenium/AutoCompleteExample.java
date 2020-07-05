package selenium;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompleteExample {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\TESTING RELATED\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/autoComplete.html");
		
		WebElement select=driver.findElement(By.id("tags"));
		select.sendKeys("s");
		
		Thread.sleep(3000);
		
		List <WebElement>options=driver.findElements(By.xpath("//*[@id=\"ui-id-1\"]/li"));
		System.out.println(options.size());
		
		for (WebElement webElement : options) {
			if(webElement.getText().equals("Web Services")) {
				webElement.click();
				System.out.println("if part");
				break;
			}
			else {
				System.out.println("else part");
			}
		}
	}

}
