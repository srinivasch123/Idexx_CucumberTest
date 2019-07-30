package com.phptravels.Base;

import com.phptravels.Pages.HomePage;
import com.phptravels.SauceLabs.SauceLabsConnection;
import com.phptravels.Utilities.TestErrorExceptions;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


public class BaseClass {
    public static WebDriver driver;
    public static Properties prop;

    public void setupApplication(String environment,String browser) throws Exception
    {

        Reporter.log("=====Browser Session Started=====", true);

        /* Initiating Property class */
        prop = new Properties();

        /* Instantiate local or remote web driver */
        driver = driverProvider(environment,browser);

        Reporter.log("=====Application Started=====", true);
    }

    public void closeApplication(){
        driver.quit();
        Reporter.log("=====Browser Session End=====", true);

    }

    public WebDriver getDriver() {
        return driver;
    }

    public static String getProperty(String property){
        prop = new Properties();
        try{
            InputStream input = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\env\\base.properties");
            prop.load(input);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return prop.getProperty(property);

    }

    public WebDriver driverProvider(String driverProvider, String browser) throws Exception {
        //take value from feature file
        String webDriverProvider = driverProvider;
        if ("local".equals(webDriverProvider)) {
            driver = BrowserFactory.startBrowser(browser);

        } else if ("saucelabs".equals(webDriverProvider)) {
            driver = SauceLabsConnection.sauceLabsSetup(browser);

        } else {
            throw new TestErrorExceptions("Execution type not specified");
        }
        //Set implicit wait from properties file
        driver.manage().timeouts().implicitlyWait
                (Integer.parseInt(getProperty("implicit.wait")), TimeUnit.SECONDS);
        return driver;
    }
}
