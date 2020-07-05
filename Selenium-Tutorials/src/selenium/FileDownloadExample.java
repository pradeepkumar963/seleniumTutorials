package selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownloadExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\TESTING RELATED\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/download.html");
		
		WebElement download=driver.findElement(By.linkText("Download Excel"));
		download.click();
		//Downloads
		File fileDownload=new File("C:\\Users\\Admin\\Downloads");
		File[] totalFiles=fileDownload.listFiles();
		for (File file : totalFiles) {
			if(file.getName().equals("testleaf.xlsx")) {
			System.out.println("download");
			break;
			}
		}
	}

}
  