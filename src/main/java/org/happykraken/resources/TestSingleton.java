package org.happykraken.resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class TestSingleton {
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static Wait<WebDriver> fluentwait;

    public static void initChromeInstance() {
        String home = System.getProperty("user.home");
        System.setProperty("webdriver.chrome.driver", home + "/Sandbox/chromedriver");
        driver = new ChromeDriver();
        driverSettings();
    }

    public static void endInstance() {
        if (driver != null) {
            driver.quit();
        }
        driver = null;
    }

    public static void driverSettings() {
        wait = new WebDriverWait(driver, 10);
        fluentwait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10000))
                .pollingEvery(Duration.ofSeconds(1000))
                .ignoring(Exception.class);
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static WebDriverWait getWait() {
        return wait;
    }

    public static Wait<WebDriver> getFluentwait() {
        return fluentwait;
    }
}
