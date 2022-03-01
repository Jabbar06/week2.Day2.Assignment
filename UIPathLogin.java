package week2.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UIPathLogin {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://acme-test.uipath.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("email")).sendKeys("kumar.testleaf@gmail.com"); 
		driver.findElement(By.name("password")).sendKeys("leaf@12"); 
		driver.findElement(By.xpath("//button[@class= 'btn btn-primary']")).click();
		driver.findElement(By.xpath("//a[text()= 'Log Out']")).click();
		driver.close();

	}

}
