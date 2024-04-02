package Pages;

import Helpers.Helper;
import Hooks.InitialHook;
import org.openqa.selenium.By;

public class SeatsPage extends InitialHook {
    BasePage base = new BasePage();
    By btnSeat = By.xpath("//button[@class='seat-available']");

    public void selectSeat() {
        base.findElements(driver, btnSeat).get(0).click();
    }

    public void continueWithTheSeat() {
        base.click(driver, "Continuar con 1 asiento");
    }
}
