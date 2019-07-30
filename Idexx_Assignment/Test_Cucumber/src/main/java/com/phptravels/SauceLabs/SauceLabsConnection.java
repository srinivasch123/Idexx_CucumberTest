package com.phptravels.SauceLabs;

import com.phptravels.Base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.URL;

public class SauceLabsConnection extends BaseClass {
    private static WebDriver driver;
    public static WebDriver sauceLabsSetup(String browserName) throws Exception{

        if (browserName.equalsIgnoreCase("firefox")) {
            driver = instantiateBrowser("firefox",getProperty("firefox.version"));
        }

        else if (browserName.equalsIgnoreCase("Chrome")) {
            driver = instantiateBrowser("Chrome",getProperty("chrome.version"));
        }

        else if (browserName.equalsIgnoreCase("InternetExplorer")) {
            driver = instantiateBrowser("InternetExplorer",getProperty("ie.version"));
        }
        driver.get(getProperty("aut.url"));
        return driver;
    }

    public static WebDriver instantiateBrowser(String browserName, String browserVersion) throws Exception {
        String URL = "https://" + System.getenv("SAUCE_USERNAME") + ":"
                + System.getenv("SAUCE_ACCESS_KEY") + "@ondemand.eu-central-1.saucelabs.com:443/wd/hub";
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("name", "ApplicationUnderTest");
        caps.setCapability("platform", getProperty("os"));
        caps.setCapability("browserName", browserName);
        caps.setCapability("version", browserVersion);
        driver = new RemoteWebDriver(new URL(URL), caps);
        return driver;
    }
}
