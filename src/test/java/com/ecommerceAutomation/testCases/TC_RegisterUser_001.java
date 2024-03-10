package com.ecommerceAutomation.testCases;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import com.ecommerceAutomation.pageObjects.RegisterUser;
import com.ecommerceAutomation.utilities.Methods_HomePage;

public class TC_RegisterUser_001 extends BaseClass {
	
	@Test
	public void RegisterUser () throws InterruptedException
	{
		ExtentTest test;
		RegisterUser reg = new RegisterUser(driver);
		Methods_HomePage hp = new Methods_HomePage();
		test=extent.createTest("RegisterUser");
		
		//Verify that home page is visible successfully
		hp.homepageIsVisible(driver, test);
		
	    //Clicking on the LoginOrSignUp button
		reg.clickLoginOrSignUP();
		
		//Verify 'New User Signup!' is visible
		hp.isNewUserSignUpVisible(driver, test);
		
		//Filling the Signup 
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
	    //clicking on the Createaccount button
	    reg.clickCreateAccount(js);
	    
	    //Verify that 'ACCOUNT CREATED!' is visible
	    hp.isAccountCreated(driver, test);
	    
	    //clicking on continue
	    reg.clickContinue();
	    
	    
	    driver.navigate().refresh();
	    
	    reg.clickContinue();
	    
	    //Checking Logged in or not
	    hp.isLoggedIn(driver, test);
	  
	    //Deleting the Account
	    reg.clickDelete();
	    
	    //checking the account deleted message
	    hp.isAccountDeleted(driver, test);
	    
	    //clicking on the delete button
	    reg.clickDeleteContinue();
	   
	    //checking the homepage is visible or not 
	    hp.homepageIsVisible(driver, test);  	
	    	
	     	
	}

}
