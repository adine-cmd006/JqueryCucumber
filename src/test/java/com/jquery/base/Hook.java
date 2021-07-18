package com.jquery.base;

import com.jquery.helper.WebDriverFactory;
import com.jquery.utility.CommonLibrary;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static com.jquery.helper.WebDriverFactory.createWebDriver;
import static com.jquery.base.Hook.*;

public class Hook {

    public static WebDriver driver;
    public WebDriverFactory webDriverFactory;
    CommonLibrary library = new CommonLibrary();

    @Before
    public void beforeEachScenario() throws IOException {
        driver = createWebDriver();

        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("src/test/java/com/jquery/utility/global.properties");
        prop.load(fis);
        library.getUrl(prop.getProperty("url"));

        library.windowMaximize();


        String currentUrl = driver.getCurrentUrl();
        String expectedUrl = "https://jqueryui.com/";
        String title = driver.getTitle();
        System.out.println("title = " + title);
        Assert.assertEquals(currentUrl, expectedUrl);
    }

    @After
    public void afterEachScenario() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }


}
