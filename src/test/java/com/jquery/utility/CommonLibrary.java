package com.jquery.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import static com.jquery.base.Hook.*;

public class CommonLibrary {

    Actions action;

    public void windowMaximize(){
        driver.manage().window().maximize();
    }

    public void getUrl(String url){
        driver.get(url);
    }




    public int[] getLocation(WebElement element) {
        int x = element.getRect().getX();
        int y = element.getRect().getY();
        return new int[]{x, y};
    }


    public void switchIFrame(WebElement element) {
        driver.switchTo().frame(element);
    }

    public void dragAndDrop(WebDriver driver, WebElement source, int xOffset, int yOffset) {
        Actions action = new Actions(driver);
        action.dragAndDropBy(source, xOffset, yOffset).perform();
    }

    public void dragAndDrop(WebDriver driver, WebElement source, WebElement target) {
        Actions action = new Actions(driver);
        action.dragAndDrop(source, target).perform();
    }

    public void scrollThePageDown(WebDriver driver, CharSequence keys) {
        Actions actions = new Actions(driver);
        actions.sendKeys(keys).build().perform();
    }

    public void fluentWait(WebDriver driver) {
        FluentWait wait = new FluentWait(driver);
        wait.withTimeout(Duration.ofSeconds(5));
        wait.pollingEvery(Duration.ofSeconds(2));

    }
    public WebElement moveToElement(WebElement target){
        Actions actions = new Actions(driver);
        actions.moveToElement(target).build().perform();
        return target;
    }

}