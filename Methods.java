package week2.assignments;

import java.sql.DriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class Methods {

	public static void main(String[] args) {
		ChromeDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.findElement(By.id("email")).sendKeys("abc@testleaf.com");
		WebElement apptext = driver.findElement(By.xpath("(//input[@type= 'text'])[2]"));
		apptext.sendKeys(Keys.END);
		apptext.sendKeys("Jabbar");
		String attribute = driver.findElement(By.xpath("(//input[@name= 'username'])[1]")).getAttribute("value");
		System.out.println(attribute);
		driver.findElement(By.xpath("(//input[@name= 'username'])[2]")).clear();
		boolean enabled = driver.findElement(By.xpath("(//input[@disabled= 'true'])")).isEnabled();
		System.out.println(enabled);
		if (enabled == false) {
			System.out.println("The Edit field is disabled");
		}

	}

}
