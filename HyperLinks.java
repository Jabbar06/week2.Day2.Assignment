package week2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyperLinks{
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://leafground.com/pages/Link.html");
	driver.findElement(By.xpath("(//a[text() = 'Go to Home Page'])[1]")).click();
	driver.navigate().back();
	String linktext = driver.findElement(By.xpath("//a[text() = 'Find where am supposed to go without clicking me?']")).getAttribute("href");
	System.out.println(linktext);
	driver.findElement(By.xpath("//a[text() = 'Verify am I broken?']")).click();
	String currentUrl = driver.getCurrentUrl();
	if(currentUrl.contains("error")) {
		System.out.println("The page is Broken");
		driver.navigate().back();
	}
}
}
