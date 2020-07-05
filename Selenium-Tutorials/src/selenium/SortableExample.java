package selenium;

import java.util.List;

import javax.lang.model.util.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SortableExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\TESTING RELATED\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://leafground.com/pages/sortable.html");
		
		List<WebElement> elements=driver.findElements(By.xpath("//*[@id=\"sortable\"]/li"));
		
		WebElement fromElements=elements.get(5);
		WebElement toElements=elements.get(2);
		
		Actions actions=new Actions(driver);
		
		actions.clickAndHold(fromElements);
		actions.moveToElement(toElements);
		actions.release(toElements);
		actions.build().perform();
		
		
		
	}

}
