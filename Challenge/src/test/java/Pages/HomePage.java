package Pages;

import Helpers.Helper;
import Hooks.InitialHook;
import org.openqa.selenium.By;

public class HomePage extends InitialHook {
    BasePage base = new BasePage();

    By inptDepartureLocation = By.id("txtorigin-desktop");
    By inptDestinationLocation = By.id("txtdestination-desktop");
    By btnSearch = By.xpath("//button[@class='search-button ']");

    public void clickOnDepartureLocation() {
        base.click(driver, inptDepartureLocation);
    }

    public void clickOnDestinationLocation() {
        base.click(driver, inptDestinationLocation);
    }

    public void selectLocation(String location) {
        base.click(driver, location);
    }

    public void selectDate(String date) {
        base.click(driver, date);
    }

    public void clickOnSearchButton() {
        base.click(driver, btnSearch);
    }
}
