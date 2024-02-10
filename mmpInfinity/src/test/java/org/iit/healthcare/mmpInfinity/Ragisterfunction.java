package org.iit.healthcare.mmpInfinity;

import java.util.Random;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ragisterfunction {
	WebDriver driver;
	
	@BeforeClass
	public void instantiateDriver()
	{
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get("http://96.84.175.78/MMP-Release2-Integrated-Build.6.8.000/portal/login.php");
	}
	
	@Test
	public void ragister()  {
		
		driver.findElement(By.xpath("//*[@id='login']/form/p[7]/a")).click();
		driver.findElement(By.id("firstname")).sendKeys("FirstName");
	  	driver.findElement(By.id("lastname")).sendKeys("LastName");
		driver.findElement(By.id("datepicker")).sendKeys("01/20/20");
		driver.findElement(By.id("license")).sendKeys("e4ry689vhu");
		driver.findElement(By.id("ssn")).sendKeys("7282742470749023750");
	    driver.findElement(By.id("address")).sendKeys("somewhere in the world");
	    driver.findElement(By.id("zipcode")).sendKeys("nfdnld");
		driver.findElement(By.id("age")).sendKeys("45");
		driver.findElement(By.id("height")).sendKeys("56");
		driver.findElement(By.id("weight")).sendKeys("2324");
		driver.findElement(By.id("pharmacy")).sendKeys("Walgreens");
		driver.findElement(By.id("pharma_adress")).sendKeys("mineral point");
		driver.findElement(By.id("email")).sendKeys("testing1234@gmail.com");
		driver.findElement(By.id("password")).sendKeys("testing");
		driver.findElement(By.id("username")).sendKeys("Portal");
		driver.findElement(By.id("confirmpassword")).sendKeys("testing");
	     WebElement n = driver.findElement(By.id("security"));
	     n.click();
	    Select sl = new Select((WebElement) n);
	    sl.selectByIndex(2);
		driver.findElement(By.id("answer")).sendKeys("whatever");
	    driver.findElement(By.name("register")).click();
	    driver.close();		
	}
	
//	@Test
	public void editFirstName()
	{
		driver.findElement(By.id("username")).sendKeys("ria1");
		driver.findElement(By.id("password")).sendKeys("Ria12345");
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Profile']")).click();
		driver.findElement(By.id("Ebtn")).click();
		driver.findElement(By.id("fname")).clear();
		String expectedfNameValue = "FNAMEAUT"+generateRandomString();
		driver.findElement(By.id("fname")).sendKeys(expectedfNameValue);
		driver.findElement(By.id("Sbtn")).click();
		Alert alrt = driver.switchTo().alert();
		alrt.accept();
		String actualfNameValue = driver.findElement(By.id("fname")).getAttribute("value");
		expectedfNameValue.equals(actualfNameValue);
		driver.close();	
		
	}
	public String generateRandomNumber()
	{
		Random rand = new Random();
		int u = 65+ rand.nextInt(26);
		char upperCase = (char) u;
		System.out.println("UpperCase::" + upperCase );
		
		//lower 97 to 122
		int l = 97+rand.nextInt(122-97+1); 
		char lowercase = (char) l;
		System.out.println("lowercase:: " + lowercase);
		
		String randomString = upperCase+lowercase+"";
		return randomString;
		
	}
	public String generateRandomString()
	{
		Random rand = new Random();
		int u = 65+ rand.nextInt(26);
		char upperCase = (char) u;
		System.out.println("UpperCase::" + upperCase );
		
		//lower 97 to 122
		int l = 97+rand.nextInt(122-97+1); 
		char lowercase = (char) l;
		System.out.println("lowercase:: " + lowercase);
		
		String randomString = upperCase+""+lowercase+"";
		return randomString;
		
	}
}

		
		