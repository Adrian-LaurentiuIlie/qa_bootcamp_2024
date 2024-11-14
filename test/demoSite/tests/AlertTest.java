package demoSite.tests;

import juiceShop.frameworkUtils.Utils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AlertTest extends BaseTest{

    @Test
    public void alertTest(){
        driver.get(baseUrl);
        driver.findElement(By.cssSelector("#svelte > div.container-fluid > div.main.row > div.sidebar > a:nth-child(1)")).click();

        Utils.waitForElement(driver, 5, By.id("alert-trigger")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();

    }

    @Test
    public void hoverTesr() {
        driver.get(baseUrl);
        Utils.waitForElement(driver, 5, By.cssSelector("#svelte > div.container-fluid > div.main.row > div.sidebar > a:nth-child(3)")).click();
        WebElement button = Utils.waitForElement(driver, 5, By.cssSelector("#svelte > div.container-fluid > div.main.row > div.content > div > button"));

        Actions actions = new Actions(driver);
        actions.moveToElement(button).build().perform();

        Utils.waitForElement(driver, 5, By.cssSelector("#Dog")).click();
    }
}
