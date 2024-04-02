package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BasePage {
    public WebElement waitForElement(WebDriver driver, By element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(300));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public WebElement waitForElement(WebDriver driver, WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(300));
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public WebElement waitForElementClickable(WebDriver driver, By element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(300));
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public List<WebElement> findElements(WebDriver driver, String text) {
        waitForElement(driver, By.xpath("//*[contains(text(),'" + text + "')]"));
        return driver.findElements(By.xpath("//*[contains(text(),'" + text + "')]"));
    }

    public List<WebElement> findElements(WebDriver driver, By element) {
        waitForElement(driver, element);
        return driver.findElements(element);
    }

    public void click(WebDriver driver, By element) {
        waitForElement(driver, element).click();
    }

    public void click(WebDriver driver, WebElement element) {
        waitForElement(driver, element).click();
    }

    public void click(WebDriver driver, String text) {
        waitForElement(driver, By.xpath("//*[contains(text(),'" + text + "')]")).click();
    }

    public void sendKeys(WebDriver driver, By element, String text) {
        clear(driver, element);
        waitForElement(driver, element).sendKeys(text);
    }

    public void clear(WebDriver driver, By element) {
        waitForElement(driver, element).clear();
    }

    public void switchFrame(WebDriver driver, String title) {
        WebElement iframe_element = driver.findElement(By.xpath("//iframe[@title='" + title + "']"));
        driver.switchTo().frame(iframe_element);
    }

    public void switchToMain(WebDriver driver) {
        driver.switchTo().defaultContent();
    }
}
