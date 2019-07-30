package com.phptravels.Pages;

import com.phptravels.Base.BaseClass;
import com.phptravels.Base.Waits;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.testng.Assert;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class HomePage extends BaseClass {
    private static Waits expWait = new Waits();

    @FindBy(xpath="//*[@id=\"cookyGotItBtn\"]")
    private WebElement cookieButton;

    @FindBy(xpath="//*[@id=\"s2id_location\"]/a/span[1]")
    private WebElement searchCity;

    @FindBy(xpath="//*[@id=\"select2-drop\"]/div/input")
    private WebElement searchField;

    @FindBy(xpath="//*[@id=\"select2-drop\"]/ul/li[1]/div")
    private WebElement hotelTitle;

    @FindBy(xpath="//*[@id=\"select2-drop\"]/ul/li[1]/ul/li/div")
    private WebElement hotelText;

    @FindBy(xpath="//*[@id=\"dpd1\"]/div/input")
    private WebElement checkIn;

    @FindBy(xpath="//*[@id=\"dpd2\"]/div/input")
    private WebElement checkOut;

    @FindBy(xpath="//*[@id=\"htravellersInput\"]")
    private WebElement countOfPeople;

    @FindBy(xpath="//*[@id=\"hadultInput\"]")
    private WebElement countOfAdults;

    @FindBy(xpath="//*[@id=\"hchildPlusBtn\"]")
    private WebElement countOfChild;

    @FindBy(xpath="//*[@id=\"thhotels\"]/form/div[5]/button")
    private WebElement searchButton;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public HomePage acceptConsent(){
        expWait.isElementClickable(cookieButton);
        cookieButton.click();
        return this;
    }

    public HomePage searchForHotelInSingapore(String location){
        searchCity.click();
        searchField.sendKeys(location);
        return this;
    }

    public HomePage selectHotelInSingapore(){
        expWait.isElementVisible(hotelTitle);
        Assert.assertEquals(hotelTitle.getText(),"HOTELS");
//        expWait.isElementVisible(hotelText);
//        if(hotelText.getText().equals(hotelName)){
            hotelText.click();
//        }
        return this;
    }

    public HomePage enterCheckInDate(Integer count){
        expWait.isElementVisible(checkIn);
        checkIn.click();
        String checkInDate = getDate(count);
        checkIn.clear();
        checkIn.sendKeys(checkInDate);
        return this;
    }

    public HomePage enterCheckOutDate(Integer count){
        checkOut.click();
        String checkOutDate = getDate(count);
        checkOut.clear();
        checkOut.sendKeys(checkOutDate);
        return this;
    }

    public String getDate(Integer count){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Calendar cal = Calendar.getInstance();
        //Adding days to the current date
        cal.add(Calendar.DAY_OF_MONTH, count);
        String newDate = sdf.format(cal.getTime());
        return newDate;
    }

    public HomePage enterCountOfAdults(String count){
        countOfPeople.click();
        countOfAdults.click();
        countOfAdults.clear();
        countOfAdults.sendKeys(count);
        return this;
    }

    public HomePage enterCountOfChild(){
        countOfChild.click();
        countOfPeople.click();
        return this;
    }

    public void searchHotel(){
        searchButton.click();
    }
}
