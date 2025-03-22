package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.LoginPage;

public class LoginTest extends BaseTest{

    LoginPage loginPage;

    

    @Test(priority=1)
    public void testLoginWithValidCredentials() {
    	//Open the Login page
        driver.get("https://next-boilerplate-umber.vercel.app/login");
        loginPage = new LoginPage(driver);
        //Enter the User name 
        loginPage.enterUsername("sunitamydream38@gmail.com");
        //Enter the password
        loginPage.enterPassword("Piyusunni@495#");
        //Click on the Sign In Button
        loginPage.clickLoginButton();

        // Assert successful login behavior
        // e.g., check if the user is redirected or dashboard is displayed
    }

    @Test(priority=2)
    public void testLoginWithInvalidCredentials() throws InterruptedException {
    	//Open the Login page
        driver.get("https://next-boilerplate-umber.vercel.app/login");
        loginPage = new LoginPage(driver);
        //Enter the invalid user name
        loginPage.enterUsername("invaliduser@gmail.com");
        //Enter the invalid password
        loginPage.enterPassword("invalidpassword4#^^***&&&*&");
        //Click on the Sign In Button
        loginPage.clickLoginButton();
        Thread.sleep(3000);

        // Assert error message
        String errorMessage = loginPage.getErrorMessage();
        Assert.assertEquals(errorMessage, "User not found");
        
    }
}

        
    
