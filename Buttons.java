package week2.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Buttons {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Button.html");
		driver.findElement(By.id("home")).click();
		driver.navigate().back();
		Point location = driver.findElement(By.id("position")).getLocation();
		System.out.println("position of button i " +location);
		String cssValue = driver.findElement(By.id("color")).getCssValue("background-color");
		System.out.println("Back Ground color of the cutton is " +cssValue);
		Dimension size = driver.findElement(By.id("size")).getSize();
		System.out.println("The size of the buton is " +size);
		driver.quit();
		

	}

}
