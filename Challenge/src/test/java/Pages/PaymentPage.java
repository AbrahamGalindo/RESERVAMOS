package Pages;

import Helpers.Helper;
import Hooks.InitialHook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PaymentPage extends InitialHook {
    BasePage base = new BasePage();
    Helper helper = new Helper();

    By chkDataFirstPassenger = By.xpath("//span[@class='css-10ju7we']");
    By inptPhone = By.id("phone");
    By inptCardNumber = By.xpath("//input[@aria-label='Campo del número de tarjeta']");
    By inptCardDate = By.xpath("//input[@aria-label='Campo de la fecha de caducidad']");
    By inptCVC = By.xpath("//input[@aria-label='Campo del código de seguridad']");
    By inptCardName = By.xpath("//input[@placeholder='Juan Pérez']");

    public void selectDataFromFirstPassenger() {
        helper.wait(12000);
        base.click(driver, chkDataFirstPassenger);
    }

    public void enterPhoneNumber(String phone) {
        base.sendKeys(driver, inptPhone, phone);
    }

    public void enterCardNumber(String cardNumber) {
        base.switchFrame(driver, "Iframe del número de tarjeta asegurada");
        base.sendKeys(driver, inptCardNumber, cardNumber);
        base.switchToMain(driver);
    }

    public void enterCardDate(String cardDate) {
        base.switchFrame(driver, "Iframe de la fecha de caducidad de la tarjeta asegurada");
        base.sendKeys(driver, inptCardDate, cardDate);
        base.switchToMain(driver);
    }

    public void enterCVC(String cvc) {
        base.switchFrame(driver, "Iframe del código de seguridad de la tarjeta asegurada");
        base.sendKeys(driver, inptCVC, cvc);
        base.switchToMain(driver);
    }

    public void enterCardName(String cardName) {
        base.sendKeys(driver, inptCardName, cardName);
    }

    public void finalizePurchase() {
        base.click(driver, "Finalizar compra por ");
        clearDriver();
    }
}
