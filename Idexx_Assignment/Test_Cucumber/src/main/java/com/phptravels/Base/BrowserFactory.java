package com.phptravels.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory extends BaseClass{
static WebDriver driver;
    public static WebDriver startBrowser(String browserName) {

        if (browserName.equalsIgnoreCase("firefox")){
            driver = new FirefoxDriver();
        }
        else if (browserName.equalsIgnoreCase("Chrome")){
            System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\Drivers\\chromedriver1.exe");
            driver = new ChromeDriver();
        }
        else if (browserName.equalsIgnoreCase("InternetExplorer")){
            driver = new InternetExplorerDriver();
        }
        driver.manage().window().maximize();
        driver.get(getProperty("aut.url"));
        return driver;
    }
}
