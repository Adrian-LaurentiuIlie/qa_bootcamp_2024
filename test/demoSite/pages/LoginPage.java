package demoSite.pages;

import juiceShop.frameworkUtils.Utils;
import juiceShop.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

    private static final String GO_TO_LOGIN_SELECTOR = "#svelte > div.container-fluid > div.header.sticky-top.row > div:nth-child(2) > div > a";
    private static final String USERNAME_SELECTOR = "user";
    private static final String PASSWORD_SELECTOR = "pass";
    private static final String REMEMBER_ME_SELECTOR = "remember";
    private static final String SIGN_IN_BUTTON_SELECTOR = "#svelte > div.container-fluid > div.main.row > div.content > div > div > div > form > button";

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login(String username, String password, boolean remember){
        Utils.waitForElement(driver, 5, By.id(USERNAME_SELECTOR));
        WebElement usernameField = driver.findElement(By.id(USERNAME_SELECTOR));
        usernameField.clear();
        usernameField.sendKeys(username);

        Utils.waitForElement(driver, 5, By.id(PASSWORD_SELECTOR));
        WebElement passwordField = driver.findElement(By.id(PASSWORD_SELECTOR));
        passwordField.clear();
        passwordField.sendKeys(password);

        Utils.waitForElement(driver, 5, By.id(REMEMBER_ME_SELECTOR));
        WebElement rememberMe = driver.findElement(By.id(REMEMBER_ME_SELECTOR));
        if(remember){
            rememberMe.click();
        }

        Utils.waitForElement(driver, 5, By.cssSelector(SIGN_IN_BUTTON_SELECTOR));
        WebElement signInButton = driver.findElement(By.cssSelector(SIGN_IN_BUTTON_SELECTOR));
        signInButton.click();

    }

    public void goToLogin(){
        Utils.waitForElement(driver, 5, By.cssSelector(GO_TO_LOGIN_SELECTOR));
        WebElement goToLoginElement = driver.findElement(By.cssSelector(GO_TO_LOGIN_SELECTOR));
        goToLoginElement.click();
    }

}
