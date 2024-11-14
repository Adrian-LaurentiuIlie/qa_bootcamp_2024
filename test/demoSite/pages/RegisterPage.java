package demoSite.pages;

import juiceShop.frameworkUtils.Utils;
import juiceShop.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage extends BasePage {

    private static final String GO_TO_REGISTER_SELECTOR = "#svelte > div.container-fluid > div.main.row > div.content > p:nth-child(3) > div > a";
    private static final String USERNAME_SELECTOR = "username";
    private static final String PASSWORD_SELECTOR = "password";
    private static final String CONFIRM_PASSWORD_SELECTOR = "password2";
    private static final String DETAILS_MR_SELECTOR = "Mr";
    private static final String DETAILS_MS_SELECTOR = "Ms";
    private static final String FIRST_NAME_SELECTOR = "input-first-name";
    private static final String LAST_NAME_SELECTOR = "input-last-name";
    private static final String EMAIL_SELECTOR = "input-email";
    private static final String DATE_OF_BIRTH_SELECTOR = "input-dob";
    private static final String NATIONALITY_SELECTOR = "input-nationality";
    private static final String TERMS_AND_CONDITIONS_SELECTOR = "terms";
    private static final String REGISTRATION_BUTTON_SELECTOR = "#svelte > div.container-fluid > div.main.row > div.content > div > div > div > form > div:nth-child(13) > button";

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public void register(String username, String password, String details, String firstName, String lastName, String email, String dateOfBirth, String nationality){
        Utils.waitForElement(driver, 5, By.id(USERNAME_SELECTOR));
        WebElement usernameField = driver.findElement(By.id(USERNAME_SELECTOR));
        usernameField.clear();
        usernameField.sendKeys(username);

        Utils.waitForElement(driver, 5, By.id(PASSWORD_SELECTOR));
        WebElement passwordField = driver.findElement(By.id(PASSWORD_SELECTOR));
        passwordField.clear();
        passwordField.sendKeys(password);

        Utils.waitForElement(driver, 5, By.id(CONFIRM_PASSWORD_SELECTOR));
        WebElement confirmPasswordField = driver.findElement(By.id(CONFIRM_PASSWORD_SELECTOR));
        confirmPasswordField.clear();
        confirmPasswordField.sendKeys(password);

        Utils.waitForElement(driver, 5, By.id(DETAILS_MR_SELECTOR));
        WebElement detailsMrField = driver.findElement(By.id(DETAILS_MR_SELECTOR));
        Utils.waitForElement(driver, 5, By.id(DETAILS_MS_SELECTOR));
        WebElement detailsMsField = driver.findElement(By.id(DETAILS_MS_SELECTOR));
        if(details == "Mr"){
            detailsMrField.click();
        }else if (details == "Ms") {
            detailsMsField.click();
        }

        Utils.waitForElement(driver, 5, By.id(FIRST_NAME_SELECTOR));
        WebElement firstNameField = driver.findElement(By.id(FIRST_NAME_SELECTOR));
        firstNameField.clear();
        firstNameField.sendKeys(firstName);

        Utils.waitForElement(driver, 5, By.id(LAST_NAME_SELECTOR));
        WebElement lastNameField = driver.findElement(By.id(LAST_NAME_SELECTOR));
        lastNameField.clear();
        lastNameField.sendKeys(lastName);

        Utils.waitForElement(driver, 5, By.id(EMAIL_SELECTOR));
        WebElement emailField = driver.findElement(By.id(EMAIL_SELECTOR));
        emailField.clear();
        emailField.sendKeys(email);

        Utils.waitForElement(driver, 5, By.id(DATE_OF_BIRTH_SELECTOR));
        WebElement dateOfBirthField = driver.findElement(By.id(DATE_OF_BIRTH_SELECTOR));
        dateOfBirthField.clear();
        dateOfBirthField.sendKeys(dateOfBirth);

        Utils.waitForElement(driver, 5, By.id(NATIONALITY_SELECTOR));
        WebElement nationalityField = driver.findElement(By.id(NATIONALITY_SELECTOR));
        nationalityField.sendKeys(nationality);

        Utils.waitForElement(driver, 5, By.id(TERMS_AND_CONDITIONS_SELECTOR));
        WebElement termsAndConditionsField = driver.findElement(By.id(TERMS_AND_CONDITIONS_SELECTOR));
        Utils.scrollToElement(driver, termsAndConditionsField);
        Utils.waitToBeClickable(driver, termsAndConditionsField);
        //termsAndConditionsField.click();

        Utils.waitForElement(driver, 5, By.cssSelector(REGISTRATION_BUTTON_SELECTOR));
        WebElement registrationButtonField = driver.findElement(By.cssSelector(REGISTRATION_BUTTON_SELECTOR));
        Utils.scrollToElement(driver,registrationButtonField);
        Utils.waitToBeClickable(driver, registrationButtonField);
        //registrationButtonField.click();
    }

    public void goToRegister(){
        Utils.waitForElement(driver, 5, By.cssSelector(GO_TO_REGISTER_SELECTOR));
        WebElement goToRegisterElement = driver.findElement(By.cssSelector(GO_TO_REGISTER_SELECTOR));
        goToRegisterElement.click();
    }
}
