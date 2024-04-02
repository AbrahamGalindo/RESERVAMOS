package Hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InitialHook {

    public static WebDriver driver;

    public void createWebDriver(String url) {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }

    public void clearDriver() {
        driver.quit();
    }
}
