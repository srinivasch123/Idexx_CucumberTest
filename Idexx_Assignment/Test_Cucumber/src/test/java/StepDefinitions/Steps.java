package StepDefinitions;

import com.phptravels.Base.BaseClass;
import com.phptravels.Pages.HomePage;
import com.phptravels.Pages.SearchResultsPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class Steps {
    static BaseClass baseClass;
    static HomePage homePage;
    static WebDriver driver;
    static SearchResultsPage searchResultsPage;

    @Given("^user is on the home page on \"(.*)\" and \"(.*)\"$")
    public void user_is_on_the_home_page_on_environment(String environment, String browser) throws Throwable {
        baseClass = new BaseClass();
        baseClass.setupApplication(environment,browser);
        driver = baseClass.getDriver();
    }

    @When("^searches for hotel using \"(.*)\", \"(.*)\", \"(.*)\" and \"(.*)\"$")
    public void searches_for_hotel_using_location(String location, Integer checkIn, Integer checkOut, String noofadults ) throws Throwable {
        homePage = new HomePage(driver);
        homePage.acceptConsent()
                .searchForHotelInSingapore(location)
                .selectHotelInSingapore()
                .enterCheckInDate(checkIn)
                .enterCheckOutDate(checkOut)
                .enterCountOfAdults(noofadults)
                .enterCountOfChild();
    }

    @Then("^search succeeds$")
    public void search_succeeds() throws Throwable {
        homePage.searchHotel();
        searchResultsPage = new SearchResultsPage(driver);
        searchResultsPage.verifyHotelTabIsHighlighted();
        searchResultsPage.verifyLocationIconIsPresent();
        searchResultsPage.verifyDetailsButtonIsPresent();
        baseClass.closeApplication();
    }

    /* commented code as the second page is not functioning properly. */
//    @Then("^user can see the price of Junior suite$")
//    public void user_can_see_the_price_of_Junior_suite() throws Throwable {
//
//        throw new PendingException();
//    }
//
//    @Then("^user can see the reviews from people$")
//    public void user_can_see_the_reviews_from_people() throws Throwable {
//
//        throw new PendingException();
//    }


}
