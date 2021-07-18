package com.jquery.pages.interactions_section;

import com.jquery.utility.CommonLibrary;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.jquery.base.Hook.driver;

public class Resizable_Page {
    public Resizable_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //CommonLibrary called
    CommonLibrary library = new CommonLibrary();
    int X = 221;
    int Y = 0;

    @FindBy(xpath = "//*[@id='resizable']/div[3]")
    WebElement resizeElement;

    public int reSizeTheElement() {
        library.dragAndDrop(driver, resizeElement, X, Y);
        int xLocation = resizeElement.getRect().getX();
        return xLocation;
    }
}
