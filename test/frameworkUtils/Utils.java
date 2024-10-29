package frameworkUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Utils {

    private static final String configFile = "config.properties";

    public static WebDriver getDriver(){

        WebDriver driver;
        Properties configProperties = new Properties();
        String browser = "";

        try {
            configProperties.load(new FileInputStream(configFile));
            browser = configProperties.getProperty("browser");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        switch (browser){
            case "chrome" : {
                driver = new ChromeDriver();
                break;
            }
            case "firefox" : {
                driver = new FirefoxDriver();
                break;
            }
            case "edge" : {
                driver = new EdgeDriver();
                break;
            }
            default:{
                driver = new ChromeDriver();
            }
        }
        return driver;
    }

}
