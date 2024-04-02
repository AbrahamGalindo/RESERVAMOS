package Pages;

import Helpers.Helper;
import Hooks.InitialHook;
import org.openqa.selenium.By;

public class PassengerPage extends InitialHook {
    BasePage base = new BasePage();

    By inptName = By.id("passengers[0].firstName");
    By inptLastName = By.id("passengers[0].lastName");
    By inptEmail = By.id("passengers[0].email");
    By btnNext = By.xpath("//button[@class='main-button  ']");

    public void enterName(String name) {
        base.sendKeys(driver, inptName, name);
    }

    public void enterLastName(String lastName) {
        base.sendKeys(driver, inptLastName, lastName);
    }

    public void enterEmail(String email) {
        base.sendKeys(driver, inptEmail, email);
    }

    public void clickNext() {
        base.click(driver, btnNext);
    }
}
