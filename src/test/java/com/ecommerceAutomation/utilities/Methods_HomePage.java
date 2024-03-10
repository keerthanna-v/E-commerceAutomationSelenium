package com.ecommerceAutomation.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Methods_HomePage {

	SoftAssert softassert = new SoftAssert();
	
	// Whether homepage is visible or not
	public void homepageIsVisible(WebDriver driver,ExtentTest test )
	{
		softassert.assertTrue(driver.getTitle().equalsIgnoreCase("Automation Exercise"),"home page is visible successfully");
	    if(driver.getTitle().equalsIgnoreCase("Automation Exercise"))
	    {
		test.log(Status.PASS,"home page is visible successfully");
	    }
	    else
	    {
	    	test.log(Status.FAIL,"home page is not visible");
	    }
	}
	
	
	// Whether user logged  in or not
	public void isLoggedIn(WebDriver driver,ExtentTest test)
	{
		softassert.assertTrue(driver.getPageSource().contains("Logged in as"));
	    if(driver.getPageSource().contains("Logged in as"))
	    {
	    	test.log(Status.PASS,"Logged in successfully");
	    }
	    else
	    {
	    	test.log(Status.FAIL,"Not Logged in");
	    }
	}
	
	
	//Whether isaccount created
	public void isAccountCreated(WebDriver driver,ExtentTest test)
	{
		 softassert.assertTrue(driver.getPageSource().contains("ACCOUNT CREATED!"));
		    if(driver.getPageSource().contains("Account Created!"))
		    {
		    	test.log(Status.PASS,"ACCOUNT CREATED successfully");
		    }
		    else
		    {
		    	test.log(Status.FAIL,"ACCOUNT not CREATED successfully");	    	
		    }
	}
	
	//Whether is account deleted
	public void isAccountDeleted(WebDriver driver,ExtentTest test)
	{
		 softassert.assertTrue(driver.getPageSource().contains("ACCOUNT DELETED!"));
		    if(driver.getPageSource().contains("Account Deleted!"))
		    {
		    	test.log(Status.PASS,"ACCOUNT deleted successfully");
		    }
		    else
		    {
		    	test.log(Status.FAIL,"ACCOUNT not deleted successfully");
		    }
	}
	
	public void isNewUserSignUpVisible(WebDriver driver,ExtentTest test)
	{
		softassert.assertTrue(driver.getPageSource().contains("New User Signup! "));
		if(driver.getPageSource().contains("New User Signup!"))
		    {
			test.log(Status.PASS,"New User Signup! is visible");
		    }
		    else
		    {
		    	test.log(Status.FAIL,"New User Signup! is not visible");
		    }	
	}
}


