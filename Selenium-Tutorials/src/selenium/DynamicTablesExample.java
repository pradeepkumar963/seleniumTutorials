package selenium;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTablesExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\TESTING RELATED\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://leafground.com/pages/table.html");
		//number of columns
		List<WebElement> columns=driver.findElements(By.tagName("th"));
		int columnSize=columns.size();
		System.out.println("Number Of columns : "+columnSize);
		//number of rows
		List<WebElement> rows=driver.findElements(By.tagName("tr"));
		int rowSize=rows.size();
		System.out.println("Number Of Rows : "+rowSize);
		//getting progress value
		//own xpath = //td[normalize-space()='Learn to interact with Elements']/following::/td[1]
		WebElement percentage=driver.findElement(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));
		String getPercent=percentage.getText();
		System.out.println("Percentage is : "+getPercent);
		//finding least value and click checkbox
		List<WebElement> listValues=driver.findElements(By.xpath("//td[2]"));
		
		List<Integer> numberList=new ArrayList<Integer>();
		
		for (WebElement webelement : listValues) {
			String value=webelement.getText().replace("%", "");
			numberList.add(Integer.parseInt(value));
			
		}
		System.out.println("Final List : "+ numberList);
		
		int smallValue=Collections.min(numberList);
		System.out.println(smallValue);
		String smallValueString=Integer.toString(smallValue)+"%";
		//own Xpath - direct to ->//td[normalize-space()="30%"]//following::td[1]
		String finalXpath="//td[normalize-space()="+"\""+ smallValueString +"\""+"]"+"//following::td[1]";
		System.out.println(finalXpath);
		
		WebElement check=driver.findElement(By.xpath(finalXpath));
		check.click();
		
	}

}
