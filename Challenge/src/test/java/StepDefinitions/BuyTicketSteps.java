package StepDefinitions;

import Hooks.InitialHook;
import Pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class BuyTicketSteps extends InitialHook {

    HomePage home = new HomePage();
    TripsPage tripsPage = new TripsPage();
    SeatsPage seatsPage = new SeatsPage();
    PassengerPage passenger = new PassengerPage();
    PaymentPage payment = new PaymentPage();

    @Given("Enter to the url {string}")
    public void enterToTheUrl(String url) {
        createWebDriver(url);
    }

    @And("Select departure location {string}")
    public void selectDepartureLocation(String departure) {
        home.clickOnDepartureLocation();
        home.selectLocation(departure);
    }

    @And("Select destination location {string}")
    public void selectDestinationLocation(String destination) {
        home.clickOnDestinationLocation();
        home.selectLocation(destination);
    }

    @And("Chose a travel date {string}")
    public void choseATravelDate(String date) {
        home.selectDate(date);
    }

    @And("Click on search")
    public void clickOnSearch() {
        home.clickOnSearchButton();
    }

    @Then("Choose a trip from the displayed options")
    public void chooseATripFromTheDisplayedOptions() {
        tripsPage.selectTrip();
    }

    @And("Select seat")
    public void selectSeat() {
        seatsPage.selectSeat();
        seatsPage.continueWithTheSeat();
    }

    @And("Enter the passenger name {string}")
    public void enterThePassengerName(String name) {
        passenger.enterName(name);
    }

    @And("Enter the passenger lastName {string}")
    public void enterThePassengerLastName(String lastName) {
        passenger.enterLastName(lastName);
    }

    @And("Enter the passenger email {string}")
    public void enterThePassengerEmail(String email) {
        passenger.enterEmail(email);
    }

    @And("Click on next")
    public void clickOnNext() {
        passenger.clickNext();
    }

    @And("Enter the payment information {string} {string} {string} {string} {string} {string}")
    public void enterThePaymentInformation(String name, String lastName, String phone, String cardNumber, String cardDate, String CVC) {
        payment.selectDataFromFirstPassenger();
        payment.enterPhoneNumber(phone);
        payment.enterCardNumber(cardNumber);
        payment.enterCardDate(cardDate);
        payment.enterCVC(CVC);
        payment.enterCardName(name + " " + lastName);
        payment.finalizePurchase();
    }
}
