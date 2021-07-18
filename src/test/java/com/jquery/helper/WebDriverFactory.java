package com.jquery.helper;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {

    public static WebDriver createWebDriver() {
        String browser = System.getProperty("driver");
        System.out.println("driver:" + browser);
        if(browser != null) {
            switch (browser) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    return new ChromeDriver();
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    return new FirefoxDriver();
            }
        }else{
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver();
        }
        throw new RuntimeException("driver is not configured properly");
     }
}
