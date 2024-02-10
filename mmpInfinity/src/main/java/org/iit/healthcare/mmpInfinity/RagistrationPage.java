package org.iit.healthcare.mmpInfinity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RagistrationPage extends Driverpage {
	
	
	WebElement  registerbutton = driver.findElement(By.xpath("//*[@id='login']/form/p[7]/a"));
	WebElement  fName =	driver.findElement(By.id("firstname"));
	WebElement  lName =	driver.findElement(By.id("lastname"));
	WebElement  dob =	driver.findElement(By.id("datepicker"));
	WebElement  licence = driver.findElement(By.id("license"));
	WebElement  ssn = driver.findElement(By.id("ssn"));
	WebElement  add = driver.findElement(By.id("address"));
	WebElement  zipcode = driver.findElement(By.id("zipcode"));
	WebElement  age = driver.findElement(By.id("age"));
	WebElement  height = driver.findElement(By.id("height"));
	WebElement  weight = driver.findElement(By.id("weight"));
	WebElement  pharmacy = driver.findElement(By.id("pharmacy"));
	WebElement  pharma_adress =	driver.findElement(By.id("pharma_adress"));
	WebElement   email = driver.findElement(By.id("email"));
	WebElement  pass =	driver.findElement(By.id("password"));
	WebElement  username = driver.findElement(By.id("username"));
	WebElement  confpass = driver.findElement(By.id("confirmpassword"));
	WebElement security = driver.findElement(By.id("security"));
	WebElement ans = driver.findElement(By.id("answer"));
	WebElement save  =  driver.findElement(By.name("register"));
	
	
	
	public void clickRegisterbutton() {
		registerbutton.click();
		};
	public void enterfname() {
		fName.sendKeys("Deepti");
		};
		
    public void enterlastName() {
		lName.sendKeys("something");
		};		 
	public void enterDOB() {
		dob.sendKeys("20/09/20");
				}
		 public void enterlicence() {
				licence.sendKeys("545454545455555");
				}
		 public void enterSSN(String num) {
				ssn.sendKeys(num);
				}
		 public void enterAddress(String address) {
				add.sendKeys(address);
				}
		 public void enterZip(String zip) {
				zipcode.sendKeys(zip);
				}
		 public void enterage(String agenumber) {
				age.sendKeys(agenumber);
				}
		/* public void EnterlastName() {
				lName.sendKeys("something");
				}
		 public void EnterlastName() {
				lName.sendKeys("something");
				}
		 public void EnterlastName() {
				lName.sendKeys("something");
				}
		 public void EnterlastName() {
				lName.sendKeys("something");
				}
		 public void EnterlastName() {
				lName.sendKeys("something");
				}
		 public void EnterlastName() {
				lName.sendKeys("something");
				}
		 public void EnterlastName() {
				lName.sendKeys("something");
				}
		 */
	
		 @Test
			public void testRagister() throws Exception{
				Driverpage();
				  RagistrationPage reg = new RagistrationPage();
				  reg.clickRegisterbutton();
				Thread.sleep(2000); 
				  reg.enterfname();
				  reg.enterlastName();
				  reg.enterDOB();
				  reg.enterlicence();
				  reg.enterSSN("12345678");
				  reg.enterAddress("somewhere in the world");
	
	
	
		 }
}
