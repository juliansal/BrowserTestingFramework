package org.happykraken.resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
    public static WebDriver driver = TestSingleton.getDriver();
    public static WebDriverWait wait = TestSingleton.getWait();
    public static Wait<WebDriver> fluentwait = TestSingleton.getFluentwait();

    public void waitSeconds(int secs) {
        try {
            Thread.sleep(secs * 1000);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }



}

