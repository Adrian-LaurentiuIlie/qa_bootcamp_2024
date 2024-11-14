package demoSite.tests;

import demoSite.pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    @Test
    public void test01(){
        driver.get(baseUrl);
        LoginPage lp = new LoginPage(driver);
        lp.goToLogin();
    }

    @Test
    public void test02(){
        driver.get(baseUrl);
        LoginPage lp = new LoginPage(driver);
        lp.goToLogin();
        lp.login("zebra","zebrapassword", true);
    }
}
