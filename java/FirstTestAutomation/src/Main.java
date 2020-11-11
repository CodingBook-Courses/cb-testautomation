import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Main {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://127.0.0.1:5500/html/index.html");
		
		WebElement courseElement = driver.findElement(By.xpath("*"));
//		WebElement textElement = courseElement.findElement(By.xpath("//input[@type='text1']"));
		courseElement.click();
		courseElement.sendKeys("...");
//		
//		List<WebElement> courseElements = driver.findElements(By.xpath("//course"));
//		for(WebElement courseElement : courseElements) {
//			System.out.println(courseElement.getText());
//		}
//		WebElement cloudCourseElement = courseElements.get(2);
//		System.out.println(cloudCourseElement.getText());
	}

}

     