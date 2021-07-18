package com.jquery.pages.widgets_section;

import com.jquery.utility.CommonLibrary;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ControlGroupButton_Page {
    public ControlGroupButton_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    CommonLibrary library = new CommonLibrary();

    @FindBy(xpath = "//*[@id='car-type-button']/span[1]")
            WebElement carTypeButton;
    @FindBy(xpath = "//*[@id='ui-id-4']")
    WebElement selectCompactCarElement;
    @FindBy(xpath = "/html/body/div[1]/fieldset[1]/div/label[2]/span[1]")
    WebElement automaticButton;
    @FindBy(xpath = "/html/body/div[1]/fieldset[1]/div/label[3]")
    WebElement insuranceButton;
    @FindBy(xpath = "/html/body/div[1]/fieldset[1]/div/button")
    WebElement bookNowButton;

    public void rentalCarSelect() {
        carTypeButton.click();
        selectCompactCarElement.click();
        automaticButton.click();
        insuranceButton.click();
    }

        public void bookNow(){
            bookNowButton.click();
        }




    }

