package demoSite.tests;

import demoSite.pages.LoginPage;
import demoSite.pages.RegisterPage;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest{

    @Test
    public void test01(){
        driver.get(baseUrl);
        LoginPage lp = new LoginPage(driver);
        lp.goToLogin();
        RegisterPage rp = new RegisterPage(driver);
        rp.goToRegister();
    }

    @Test
    public void test02(){
        driver.get(baseUrl);
        LoginPage lp = new LoginPage(driver);
        lp.goToLogin();
        RegisterPage rp = new RegisterPage(driver);
        rp.goToRegister();
        rp.register("Adrian", "Adrian1234", "Mr", "Adrian-Laurentiu", "Ilie", "adrian@emial.com", "19052001", "Romania");
    }
}
