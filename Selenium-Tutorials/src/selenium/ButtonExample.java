package selenium;
import org.openqa.selenium.Point;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ButtonExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\TESTING RELATED\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		
		//1.find the button position
		WebElement getPositionButton= driver.findElement(By.id("position"));	
		Point xypoint=getPositionButton.getLocation();
		int xValue=xypoint.getX();
		int yValue=xypoint.getY();
		System.out.println("X value is : " +xValue +"Y value is : "+ yValue);
		
		//2.find the button color
		WebElement buttonColor=driver.findElement(By.id("color"));
		String color=buttonColor.getCssValue("background-color");
		System.out.println("Button Color is : "+color);
		
		//3.find the button size
		WebElement buttonSize=driver.findElement(By.id("size"));
		int height=buttonSize.getSize().getHeight();
		int width=buttonSize.getSize().getWidth();
		System.out.println("Height is : "+ height +"Width is : "+ width);
		
		//4.click the home button
		WebElement homeButton=driver.findElement(By.id("home"));
		homeButton.click();
		
		
	}

}
