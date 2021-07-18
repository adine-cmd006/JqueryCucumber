package com.jquery.pages.utilities_section;

import com.jquery.utility.CommonLibrary;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WidgetFactory_Page {
    public WidgetFactory_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    CommonLibrary library = new CommonLibrary();

    @FindBy(xpath = "//*[@id='green']")
    WebElement greenButton;

    @FindBy(xpath = "//*[@id='my-widget1']")
    WebElement firstColorMe;

    @FindBy(xpath = "//*[@id='my-widget1']/button")
    WebElement changeTheFirstColorMe;

    public String setGreenButton() {
        greenButton.click();
        String firstColor = firstColorMe.getAttribute("style");
        return firstColor;
    }

    public String changeGreenColor(){
        changeTheFirstColorMe.click();
        String firstColorChangedFromGreen = firstColorMe.getAttribute("style");
        return firstColorChangedFromGreen;
    }
}
