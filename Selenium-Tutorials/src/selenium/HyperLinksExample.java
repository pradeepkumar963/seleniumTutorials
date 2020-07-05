package selenium;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperLinksExample {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\TESTING RELATED\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.navigate().to("http://leafground.com/pages/Link.html");
		
		WebElement goToHome=driver.findElement(By.partialLinkText("Go to Home Page"));
		goToHome.click();
		Thread.sleep(3000);
		driver.navigate().back();
		
		WebElement findMe=driver.findElement(By.partialLinkText("Find where"));
		String find=findMe.getAttribute("href");
		System.out.println(find);
		
		WebElement verifyBroken=driver.findElement(By.linkText("Verify am I broken?"));
		verifyBroken.click();
		String verify=driver.getTitle();
		if(verify.contains("404")) {
			System.out.println("Link is broken");
		}
		Thread.sleep(3000);
		driver.navigate().back();
		
		WebElement goToHome1=driver.findElement(By.partialLinkText("Go to Home Page"));
		goToHome1.click();
		Thread.sleep(3000);
		driver.navigate().back();
		
		java.util.List<WebElement>linkCount=driver.findElements(By.tagName("a"));
		int totalLinks=linkCount.size();
		System.out.println(totalLinks);
		
		
	}

}
