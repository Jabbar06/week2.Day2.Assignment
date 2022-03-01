package week2.assignments;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookCreateNewAccount {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@class = '_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		driver.findElement(By.name("firstname")).sendKeys("AAA");
		driver.findElement(By.name("lastname")).sendKeys("BBB"); 
		driver.findElement(By.name("reg_email__")).sendKeys("12345"); 
		driver.findElement(By.id("password_step_input")).sendKeys("12345");
		Select dobDay = new Select(driver.findElement(By.id("day")));
		dobDay.selectByVisibleText("6");
		Select dobMonth = new Select(driver.findElement(By.id("month")));
		dobMonth.selectByIndex(6);
		Select dobyear = new Select(driver.findElement(By.id("year")));
		dobyear.selectByValue("1994");
		driver.findElement(By.xpath("//label[text() = 'Male']")).click();

	}

}
