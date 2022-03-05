package week2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click(); 
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ABC");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jabb");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("HAHA");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("KAS"); 
		driver.findElement(By.name("departmentName")).sendKeys("IT"); 
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Loren bla bla"); 
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("aaa@av.com"); 
		Select stateDD = new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
		stateDD.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		String viewLeadTitle = driver.getTitle();
		System.out.println(viewLeadTitle);

		
		
		//driver.quit();

	}

}
