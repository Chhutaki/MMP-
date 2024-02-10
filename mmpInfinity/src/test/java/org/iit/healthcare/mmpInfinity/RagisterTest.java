package org.iit.healthcare.mmpInfinity;

import org.testng.annotations.Test;

public class RagisterTest extends Driverpage {
	
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
