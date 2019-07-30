package com.phptravels.Base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits extends BaseClass {

    public void isElementClickable(WebElement elementName){
        WebDriverWait wait = new WebDriverWait(driver,Integer.parseInt(getProperty("wait")));
        wait.until(ExpectedConditions.elementToBeClickable(elementName));
    }

    public void isElementVisible(WebElement elementName){
        WebDriverWait wait = new WebDriverWait(driver,Integer.parseInt(getProperty("wait")));
        wait.until(ExpectedConditions.visibilityOf(elementName));
    }
}
