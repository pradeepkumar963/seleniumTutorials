package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxExample {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "F:\\TESTING RELATED\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		
		//1.select checkboxes
		WebElement selectCheckBox=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[1]/input"));
		selectCheckBox.click();
		//2.confirm checkBox is selected
		WebElement checkSelected=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/input"));
		boolean check=checkSelected.isSelected();
		System.out.println(check);
		//3.DeSelect checkBox
		WebElement firstElement=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[1]/input"));
		if(firstElement.isSelected()) {
			firstElement.click();
		}
		WebElement secondElement=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[2]/input"));
		if(secondElement.isSelected()) {
			secondElement.click();
		}
		//4.select all checkBoxes
		WebElement option1=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[1]/input"));
		option1.click();
		WebElement option2=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[2]/input"));
		option2.click();
		WebElement option3=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[3]/input"));
		option3.click();
		WebElement option4=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[4]/input"));
		option4.click();
		WebElement option5=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[5]/input"));
		option5.click();

	}

}
