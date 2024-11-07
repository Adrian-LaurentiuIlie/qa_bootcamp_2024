package juiceShop.pages;

import juiceShop.frameworkUtils.Utils;
import org.openqa.selenium.*;

public class RegistrationPage extends BasePage {

    private static final String REGISTER_HEADER = "body > app-root > div > mat-sidenav-container > mat-sidenav-content > app-register > div > mat-card > h1";
    private static final String REGISTER_EMAIL = "emailControl";
    private static final String REGISTER_PASSWORD = "passwordControl";
    private static final String REGISTER_CONFIRM = "repeatPasswordControl";
    private static final String SECURITY_QUESTION = "#mat-select-value-1 > span";
    private static final String SECURITY_OPTION1 = "#mat-option-0 > span";
    private static final String SECURITY_ANSWERER = "securityAnswerControl";
    private static final String REGISTER_SUBMIT_BUTTON = "registerButton";
    private static final String REGISTER_STATIC_TEXT = "User Registration";
    private static final String COOKIES_MODAL = "body > div.cc-window.cc-floating.cc-type-info.cc-theme-classic.cc-bottom.cc-right.cc-color-override--1225450786 > div > a";
    private static final String LANGUAGE_MODAL = "#cdk-overlay-5 > snack-bar-container > div > div > simple-snack-bar > div > button";

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    public String getRegisterHeader(){
        return driver.findElement(By.cssSelector(REGISTER_HEADER)).getText();
    }

    public String getRegisterPageStatic(){
        return REGISTER_STATIC_TEXT;
    }

    public void register(String email, String password, String securityAnsware){
        //WebElement langaugeButton = driver.findElement(By.cssSelector(LANGUAGE_MODAL));
        //langaugeButton.click();

        WebElement emailField = driver.findElement(By.id(REGISTER_EMAIL));
        WebElement passwordField = driver.findElement(By.id(REGISTER_PASSWORD));
        WebElement passwordConfirm = driver.findElement(By.id(REGISTER_CONFIRM));

        emailField.clear();
        emailField.sendKeys(email);
        passwordField.clear();
        passwordField.sendKeys(password);
        passwordConfirm.clear();
        passwordConfirm.sendKeys(password);

        WebElement securityQuestionDropDown = driver.findElement(By.cssSelector(SECURITY_QUESTION));
        securityQuestionDropDown.click();
        WebElement securityQuestionQ1 = driver.findElement(By.cssSelector(SECURITY_OPTION1));
        securityQuestionQ1.click();
        WebElement securityAnswareField = driver.findElement(By.id(SECURITY_ANSWERER));
        securityAnswareField.clear();
        securityAnswareField.sendKeys(securityAnsware);
        WebElement cookiesButton = driver.findElement(By.cssSelector(COOKIES_MODAL));
        cookiesButton.click();
        WebElement submitButton = driver.findElement(By.id(REGISTER_SUBMIT_BUTTON));
        Utils.scrollToElement(driver, submitButton);
        submitButton.click();

    }

}
