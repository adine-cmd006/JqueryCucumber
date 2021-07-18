package com.jquery.pages.utilities_section;

import com.jquery.utility.CommonLibrary;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Position_Page {
    public Position_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    CommonLibrary library = new CommonLibrary();
    @FindBy(xpath = "//*[@id='positionable1']")
WebElement positionable;

    @FindBy(xpath = "//*[@id='my_horizontal']")
    WebElement myHorizontalElement;

    @FindBy(xpath = "//*[@id='at_horizontal']")
    WebElement atHorizontalElement;

    public int getPositionLocation() {
        int positionLocation = positionable.getRect().getX();
        return positionLocation;

    }
    public int adjustPositionLocation(){
        Select myHorizontal = new Select(myHorizontalElement);
        myHorizontal.selectByVisibleText("center");

        Select atHorizontal = new Select(atHorizontalElement);
        atHorizontal.selectByVisibleText("center");

        int adjustedLocation = positionable.getRect().getX();
        return adjustedLocation;
    }
}


