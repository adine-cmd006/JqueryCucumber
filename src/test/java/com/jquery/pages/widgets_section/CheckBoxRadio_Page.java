package com.jquery.pages.widgets_section;

import com.jquery.utility.CommonLibrary;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CheckBoxRadio_Page {
    public CheckBoxRadio_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    CommonLibrary library = new CommonLibrary();
    @FindBy(xpath = "/html/body/div/fieldset[2]/label[3]")
    WebElement radioElement;

    public void clickRadioType() {
        radioElement.click();
        }



    public void radioTypeIsSelected() {
        System.out.println(radioElement.isSelected());
    }

}
