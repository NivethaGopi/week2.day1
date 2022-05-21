package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		 driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.linkText("Create Lead")).click();
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Nivetha");
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Gopi");
		 driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Nivi");
		 driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		 driver.findElement(By.id("createLeadForm_description")).sendKeys("Test Description");
		 driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Nivethagopi95@gmail.com");
		 WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		 Select val = new Select(state);
		 val.selectByVisibleText("New York");
		 driver.findElement(By.className("smallSubmit")).click();
		 driver.findElement(By.linkText("Edit")).click();
		 driver.findElement(By.id("updateLeadForm_description")).clear();
		 driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Page Edited");
		 driver.findElement(By.className("smallSubmit")).click();
		 System.out.println("Title of the page is: "+ driver.getTitle());
	}

}
