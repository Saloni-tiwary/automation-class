package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageSetup.FacebookLoginPage;
import utils.BaseTest;
import utils.TestData;

public class FacebookLoginTest extends BaseTest {

    @Test
    public void testURLValidation() {
        String expectedURL = "https://www.facebook.com/";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, expectedURL, "URL validation failed");
    }

    @Test
    public void testTitleValidation() {
        FacebookLoginPage loginPage = new FacebookLoginPage(driver);
        String expectedTitle = "Facebook – log in or sign up";
        String actualTitle = loginPage.getPageTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title validation failed");
    }

    @Test
    public void testInputFieldValidation() {
        FacebookLoginPage loginPage = new FacebookLoginPage(driver);
        Assert.assertTrue(loginPage.isEmailFieldDisplayed(), "Email input field is not displayed");
        Assert.assertTrue(loginPage.isPasswordFieldDisplayed(), "Password input field is not displayed");
    }

    @Test
    public void testLoginButtonValidation() {
        FacebookLoginPage loginPage = new FacebookLoginPage(driver);
        Assert.assertTrue(loginPage.isLoginButtonDisplayed(), "Login button is not displayed");
    }
    
    @Test
    public void testCreateNewAccountButtonValidation() {
    	FacebookLoginPage loginPage = new FacebookLoginPage(driver);
    	Assert.assertTrue(loginPage.isCreateNewAccountButtonDisplayed(),"Create New account button not diaplayed");
    	
    }
    
    @DataProvider(name = "loginData")
    public Object[][] getLoginData() {
        return new Object[][] {
        	    {"wavopas203@crodity.com", "wavopas203@crodity.com1", true},
                {"user1@example.com", "password1", false},
                {"user2@example.com", "password2", false},
                {"invalidemail", "password", false},
                {"           ", "password", false},
                {"invalidusername", "         ", false}
                // Add more test data as needed
        };
    }
     @Test(dataProvider = "loginData")
    public void testFacebookLogin(String email, String password, boolean isValid) {
        FacebookLoginPage loginPage = new FacebookLoginPage(driver);
        loginPage.enterEmail(email);
        loginPage.enterPassword(password);
        loginPage.clickLogin();

        // Assertion for valid data
        if (isValid==true) {
        	Assert.assertTrue(loginPage.isUserProfileVisible(), "User should be navigated to the account on use of valid credentials");
          
        }
        else
        {
        	   // Assertion for invalid data
        	Assert.assertTrue(loginPage.getErrorBox(), "Error box should be displayed for invalid login");
        }
       
        
    }
    }




