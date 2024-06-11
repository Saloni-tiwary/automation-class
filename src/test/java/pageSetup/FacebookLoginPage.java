package pageSetup;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPage {
    WebDriver driver;
    
    //By emailField = By.xpath("xyz");

    @FindBy(id = "email")
    WebElement emailField;

    @FindBy(id = "pass")
    WebElement passwordField;

    @FindBy(xpath="//button[@name='login']")
    WebElement loginButton;
    
    @FindBy(xpath="//a[@data-testid='open-registration-form-button']")
    WebElement createNewAccountButton;
    
    @FindBy(xpath = "//div[@id='error_box']")
     WebElement errorBox;
    
    @FindBy(xpath="//div[@aria-label='Account Controls and Settings']")
    WebElement userProfile;

    public FacebookLoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterEmail(String email) {
        emailField.clear();
        emailField.sendKeys(email);
    }

    public void enterPassword(String password) {
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void clickLogin() {
        loginButton.click();
        
    }
    
    public boolean getErrorBox() {
        return errorBox.isDisplayed();//true
    }
    
    public boolean isUserProfileVisible() {
    	return userProfile.isDisplayed();    }//true

    public String getPageTitle() {
        return driver.getTitle();
    }

    public boolean isEmailFieldDisplayed() {
        return emailField.isDisplayed();
    }

    public boolean isPasswordFieldDisplayed() {
        return passwordField.isDisplayed();
    }

    public boolean isLoginButtonDisplayed() {
        return loginButton.isDisplayed();
    }
    
    public boolean isCreateNewAccountButtonDisplayed() {
    	return createNewAccountButton.isDisplayed();
    }

    
}
