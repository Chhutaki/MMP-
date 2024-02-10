package org.iit.healthcare.mmpInfinity;

import java.util.Random;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditProfile {
	
	public class Ragisterfunction {
		WebDriver driver;
		
		@BeforeMethod
		public void instantiateDriver()
		{
			WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
		    driver.get("http://96.84.175.78/MMP-Release2-Integrated-Build.6.8.000/portal/login.php");
		}
		
	
	@Test
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
	
	@Test
	public void editLasttName()
	{
		driver.findElement(By.id("username")).sendKeys("ria1");
		driver.findElement(By.id("password")).sendKeys("Ria12345");
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Profile']")).click();
		driver.findElement(By.id("Ebtn")).click();
		driver.findElement(By.id("lname")).clear();
		String expectedfNameValue = "lNAMEAUT"+generateRandomString();
		driver.findElement(By.id("lname")).sendKeys(expectedfNameValue);
		driver.findElement(By.id("Sbtn")).click();
		Alert alrt = driver.switchTo().alert();
		alrt.accept();
		String actualfNameValue = driver.findElement(By.id("lname")).getAttribute("value");
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
}