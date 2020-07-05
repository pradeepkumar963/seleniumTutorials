package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpsExample {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\TESTING RELATED\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Alert.html");
		
		//1.alertBox
		WebElement alertBox=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/button"));
		alertBox.click();
		Alert alert=driver.switchTo().alert();
		Thread.sleep(3000);
		alert.accept();
		
		//2.confirmBox
		WebElement confirmBox=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		confirmBox.click();
		Alert confirm=driver.switchTo().alert();
		Thread.sleep(3000);
		confirm.dismiss();
		
		//3.promptBox
		WebElement promptBox=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/button"));
		promptBox.click();
		Alert prompt=driver.switchTo().alert();
		prompt.sendKeys("SELENIUM");
		Thread.sleep(3000);
		prompt.accept();
		
		//4.sweetAlert
		WebElement sweetAlert=driver.findElement(By.xpath("//*[@id=\"btn\"]"));
		sweetAlert.click();
		Alert sweet=driver.switchTo().alert();
		Thread.sleep(3000);
		sweet.accept();
	}

}
