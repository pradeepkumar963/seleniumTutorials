package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\TESTING RELATED\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		
		//1.select using index 
		WebElement dropDown1=driver.findElement(By.id("dropdown1"));
		Select select1= new Select(dropDown1);
		select1.selectByIndex(1);
		
		//2.select using text
		WebElement dropDown2=driver.findElement(By.name("dropdown2"));
		Select select2=new Select(dropDown2);
		select2.selectByVisibleText("Appium");
		
		//3.select using value
		WebElement dropDown3=driver.findElement(By.id("dropdown3"));
		Select select3=new Select(dropDown3);
		select3.selectByValue("3");
		
		//4.get the number of dropdown options
		WebElement dropDown4=driver.findElement(By.className("dropdown"));
		Select select4=new Select(dropDown4);
		List<WebElement> listOfOptions=select4.getOptions();
		int size=listOfOptions.size();
		System.out.println("ListOfOptions : " +size);
		
		//5.Use the sendkeys to select
		WebElement dropDown5=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/select"));
		dropDown5.sendKeys("Loadrunner");
		
		//6.select multiple options
		WebElement dropDown6=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));
		Select select6=new Select(dropDown6);
		select6.selectByIndex(1);
		select6.selectByIndex(2);
		select6.selectByIndex(3);
		
	}

}
