package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\TESTING RELATED\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://leafground.com/pages/Calendar.html");
		
		WebElement calendar=driver.findElement(By.id("datepicker"));
		//calendar.sendKeys("07/10/2020"+Keys.ENTER);
		calendar.click();
		
		// xpath =  //*[@id="ui-datepicker-div"]/div/a[2]/span
		// own xpath = //a[@title="Next"]
		
		WebElement next=driver.findElement(By.xpath("//a[@title=\"Next\"]"));
		next.click();
		
		// xpath = //*[@id="ui-datepicker-div"]/table/tbody/tr[2]/td[4]/a
		// own xpath = //a[contains(text(),'10')]
		
		WebElement datePick=driver.findElement(By.xpath("//a[contains(text(),'10')]"));
		datePick.click();
	}

}
