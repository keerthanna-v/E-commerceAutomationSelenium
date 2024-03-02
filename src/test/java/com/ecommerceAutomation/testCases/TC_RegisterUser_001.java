package com.ecommerceAutomation.testCases;



import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.ecommerceAutomation.pageObjects.RegisterUser;

public class TC_RegisterUser_001 extends BaseClass {
	
	@Test
	public void RegisterUser () throws InterruptedException
	{
	

		ExtentTest test;
	
		RegisterUser reg = new RegisterUser(driver);
		
		test=extent.createTest("RegisterUser");
		SoftAssert softassert=new SoftAssert();
		
		
		softassert.assertTrue(driver.getTitle().equalsIgnoreCase("Automation Exercise"),"home page is visible successfully");
		test.log(Status.PASS,"home page is visible successfully");
		
		reg.clickLoginOrSignUP();
		
		if(driver.getPageSource().contains("New User Signup! "))
		{
		test.log(Status.PASS,"ITs new User sigup page");
		}
		else
		{
			test.log(Status.FAIL,"Its not the Home page");
		}
	    reg.setName("Keerthanna");
	    reg.setEmail("jndsvjkn@gmail.com");
	    reg.signup();
	    
	    reg.selectTitle("Mr");
	    reg.setPassword("Keerthanna@29");
	    reg.setDay("29");
	    reg.setMonth("10");
	    reg.setYear("1999");
	    reg.selectNewsletter(js);
	    reg.selectOption(js);
	    reg.setFirstName("Keerthanna");
	    reg.setLastName("v");
	    reg.setCompany("Accenture");
	    reg.setAddress1("address1");
	    reg.setAddress2("address2");
	    reg.selectCountry("India");
	    reg.setState("TamilNadu");
	    reg.setCity("Chennai");
	    reg.setZipcode("600110");
	    reg.setMobileNumber("8876587980");
	
		
	}

}
