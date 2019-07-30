package com.phptravels.Pages;

import com.phptravels.Base.Waits;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultsPage {
    private static Waits expWait = new Waits();

    @FindBy(xpath="/html/body/nav/div/div[2]/ul[1]/li[1]/a/span")
    private WebElement hotelTab;

    @FindBy(xpath="//*[@id=\"listing\"]/tbody/tr/td/div[3]/form/button")
    private WebElement detailsButton;

    @FindBy(xpath="//*[@id=\"listing\"]/tbody/tr/td/div[2]/div/a/i")
    private WebElement locationIcon;

    public SearchResultsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public SearchResultsPage verifyHotelTabIsHighlighted() {
        expWait.isElementVisible(hotelTab);
        hotelTab.isSelected();
        return this;
    }

    public SearchResultsPage verifyLocationIconIsPresent() {
        locationIcon.isDisplayed();
        return this;
    }

    public SearchResultsPage verifyDetailsButtonIsPresent() {
        detailsButton.isDisplayed();
        return this;
    }
}
