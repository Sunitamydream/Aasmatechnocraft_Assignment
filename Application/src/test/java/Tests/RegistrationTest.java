package Tests;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.RegistrationPage;

public class RegistrationTest extends BaseTest{

    RegistrationPage registrationPage;

    @Test(priority=1)
    public void testValidRegistration() {
    	//Open the Register page
        driver.get("https://next-boilerplate-umber.vercel.app/register");
        registrationPage = new RegistrationPage(driver);
        //Enter the Name
        registrationPage.enterName("Sunita");
        //Enter the UserName
        registrationPage.enterEmail("sunitamydream41@gmail.com");
        //Enter the Password
        registrationPage.enterPassword("Piyusunni@495#");
        //Click on Sign Up button
        registrationPage.clickSignUpButton();

        // Assert successful registration behavior (e.g., account creation confirmation)
    }

    @Test(priority=2)
    public void duplicateRegistration() throws InterruptedException {
    	//Open the Register page
        driver.get("https://next-boilerplate-umber.vercel.app/register");
        registrationPage = new RegistrationPage(driver);
        //Enter the Name
        registrationPage.enterName("Sunita");
        //Enter the already registered UserName
        registrationPage.enterEmail("sunitamydream38@gmail.com");
        //Enter the Password
        registrationPage.enterPassword("Piyusunni@495#");
        //Click on Sign Up button
        registrationPage.clickSignUpButton();
        String expectedErrorMessage = registrationPage.getErrorMessage();
        
        // Assert error message if username already exists
        Assert.assertEquals(expectedErrorMessage, "Request failed with status code 400");
    }

}