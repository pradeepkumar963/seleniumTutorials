package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "F:\\TESTING RELATED\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/radio.html");
		WebElement selectBox=driver.findElement(By.xpath("//*[@id=\"yes\"]"));
		selectBox.click();
		
		WebElement uncheckedkBox=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/label[2]/input"));
		WebElement checkedBox=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/label[3]/input"));
		boolean status1=uncheckedkBox.isSelected();
		boolean status2=checkedBox.isSelected();
		System.out.println(status1);
		System.out.println(status2);
		
		WebElement ageSelect=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input[1]"));
		ageSelect.click();
	}

}
