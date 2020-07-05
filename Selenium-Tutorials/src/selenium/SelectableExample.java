package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class SelectableExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\TESTING RELATED\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.get("http://leafground.com/pages/selectable.html");
		
		List<WebElement>selectable=driver.findElements(By.xpath("//*[@id=\"selectable\"]/li"));
		int select=selectable.size();
		System.out.println(select);
		
		/*Actions action=new Actions(driver);
		action.keyDown(Keys.CONTROL).click(selectable.get(0)).click(selectable.get(1)).click(selectable.get(2))
		.build().perform();
		*/
		
		Actions action=new Actions(driver);
		action.clickAndHold(selectable.get(0));
		action.clickAndHold(selectable.get(2));
		action.clickAndHold(selectable.get(4)); 
		action.build().perform();
	}

}
