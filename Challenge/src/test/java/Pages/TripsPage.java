package Pages;

import Helpers.Helper;
import Hooks.InitialHook;
import org.openqa.selenium.By;

public class TripsPage extends InitialHook {
    BasePage base = new BasePage();
    Helper helper = new Helper();

    By btnSelect = By.xpath("//div[@class='matrix-action']");

    public void selectTrip() {
        base.click(driver, base.findElements(driver, btnSelect).get(helper.generateRandomNumber(0, helper.getObjetcsNumber(base.findElements(driver, btnSelect)))));
        // base.click(driver, base.findElements(driver, "Elegir").get(helper.generateRandomNumber(0, helper.getObjetcsNumber(base.findElements(driver, "Elegir")) - 2)));
    }
}
