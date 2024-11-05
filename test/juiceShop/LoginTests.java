package juiceShop;

import frameworkUtils.Selectors;
import frameworkUtils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class LoginTests {

    static final String baseUrl = Utils.getConfigProperty("baseUrl");

    WebDriver driver;

    @DataProvider(name = "RegistrationDataProvider")
    public Iterator<Object[]> registerDp () {
        Collection<Object[]> dp = new ArrayList<>();
        dp.add(new String[] {"alex@alex.com", "Alex98876%", "alex"});
        return dp.iterator();
    }

    @BeforeMethod
    public void initBrowser(){
        driver = Utils.getDriver();
        driver.manage().window().fullscreen();
    }

    @Test
    public void mainPage(){
        driver.get(baseUrl + "/#/");
        WebElement pageText = driver.findElement(By.cssSelector(Selectors.ALL_PRODUCTS_SELECTOR));
        Assert.assertEquals(pageText.getText(), "All Products");
    }

    @Test
    public void login01(){

        driver.get(baseUrl + "/#/login");

        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        //WebElement dismissModalElement = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#mat-dialog-0 > app-welcome-banner > div > div:nth-child(3) > button.mat-focus-indicator.close-dialog.mat-raised-button.mat-button-base.mat-primary.ng-star-inserted")));
        //WebElement dismissModalElement = driver.findElement(By.cssSelector("#mat-dialog-0 > app-welcome-banner > div > div:nth-child(3) > button.mat-focus-indicator.close-dialog.mat-raised-button.mat-button-base.mat-primary.ng-star-inserted"));

        WebElement dismissModalElement = Utils.waitForElement(driver, 5, By.cssSelector(Selectors.MODAL_OK_BUTTON));
        dismissModalElement.click();

        WebElement loginElement = driver.findElement(By.id(Selectors.USERNAME_ID));
        loginElement.sendKeys("alex@alex.com");
        WebElement passwordElement = driver.findElement(By.id(Selectors.PASSWORD_ID));
        passwordElement.sendKeys("Adc123$");
        WebElement submitButton = driver.findElement(By.id(Selectors.SUBMIT_ID));
        submitButton.click();

    }

    @Test(dataProvider  = "RegistrationDataProvider")
    public void loginRegister(String username, String password, String securityAnswere){
        driver.get(baseUrl + "/#/login");

        WebElement dismissModalElement = Utils.waitForElement(driver, 5, By.cssSelector(Selectors.MODAL_OK_BUTTON));
        dismissModalElement.click();

        WebElement registerLink = driver.findElement(By.cssSelector(Selectors.REGISTER_URL));
        registerLink.click();

        Assert.assertEquals(driver.findElement(By.cssSelector(Selectors.REGISTER_HEADER)).getText(), "User Registration");

        WebElement usernameElement = driver.findElement(By.id(Selectors.REGISTER_EMAIL));
        usernameElement.clear();
        usernameElement.sendKeys(username);

        WebElement passwordElement = driver.findElement(By.id(Selectors.REGISTER_PASSWORD));
        passwordElement.clear();
        passwordElement.sendKeys(password);

        WebElement passwordConfirmElement = driver.findElement(By.id(Selectors.REGISTER_CONFIRM));
        passwordConfirmElement.clear();
        passwordConfirmElement.sendKeys(password);

        WebElement securityQuestion = driver.findElement(By.cssSelector(Selectors.SECURITY_QUESTION));
        securityQuestion.click();

        WebElement securityQuestionChoice = driver.findElement(By.cssSelector(Selectors.SECURITY_OPTION1));
        securityQuestionChoice.click();

        WebElement securityAnswerer = driver.findElement(By.id(Selectors.SECURITY_ANSWERER));
        securityAnswerer.clear();
        securityAnswerer.sendKeys(securityAnswere);

        WebElement submitButton = driver.findElement(By.id(Selectors.REGISTER_SUBMIT_BUTTON));
        submitButton.click();
    }

    @AfterMethod
    public void closeBrowser(){
        try{
            driver.close();
        }catch (Exception ex){
            driver.quit();
        }
    }
}
