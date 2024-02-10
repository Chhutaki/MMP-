package org.iit.healthcare.mmpInfinity;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;

  
public class Testing {
	WebDriver driver;
   @Test
 
	public void drivertesting() throws Exception {
		System.out.println("Deepti -________________________________++++++++");  
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://96.84.175.78/MMP-Release2-Integrated-Build.6.8.000/portal/login.php");
		driver.findElement(By.id("username")).sendKeys("ria1");
		driver.findElement(By.id("password")).sendKeys("Ria12345");
		driver.findElement(By.name("submit")).click();
		String actual = driver.findElement(By.xpath("//h3[normalize-space()='ria1']")).getText().trim();
		String expected="ria1";
		Assert.assertEquals(actual,expected);
		
		driver.findElement(By.xpath("//span[normalize-space()='Schedule Appointment']")).click();
		driver.findElement(By.xpath("//input[@value='Create new appointment']")).click();
		driver.findElement(By.xpath("//h4[text()='Dr.Smith']/parent::li/div/p[text()='Description:Orthopedic']/ancestor::ul/following-sibling::button")).click();
		WebElement iframe = driver.findElement(By.id("myframe"));
		driver.switchTo().frame(iframe);
		driver.findElement(By.id("datepicker")).click();
		driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[4]/td[2]/a")).click();
		driver.findElement(By.id("time")).click();
		driver.findElement(By.xpath("//*[@id='time']/option[3]")).click();
		driver.findElement(By.id("ChangeHeatName")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='sym']")).sendKeys("something is happening");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[3]/input")).click();
	    String ActualMessage= driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/table/tbody/tr[1]/td[3]")).getText().trim();
		String ExpectedMessage = "something is happening";
		Assert.assertEquals(ActualMessage, ExpectedMessage);
		
		driver.findElement(By.xpath("//span[normalize-space()='Profile']")).click();
		driver.findElement(By.id("Ebtn")).click();
	    driver.findElement(By.id("fname")).sendKeys("MyName");
	    
		
		
		
		
		
		
   
	   /* driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/ul/li[7]/a/span")).click();
		driver.findElement(By.id("search")).click();
		driver.findElement(By.id("search")).sendKeys("Fever");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/div/div[2]/p[2]/input")).click();
		Thread.sleep(3000);
	    String actualsymps = driver.findElement(By.xpath("//*[@id='show']/table/tbody/tr/td[1]")).getText();
	    String ExpectedSyms = "fever";
	    Assert.assertEquals(actualsymps, ExpectedSyms);
	    */
		
		
		
		
		
		
	}
   		

}
