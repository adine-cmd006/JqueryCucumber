package com.jquery.pages.widgets_section;

import com.jquery.utility.CommonLibrary;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dialog_Page {
    public Dialog_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    CommonLibrary library = new CommonLibrary();

   @FindBy(xpath = "//*[@title='Close']")
    WebElement closeButton;

   public void closeIcon(){
       closeButton.click();
    }

    public void checkDialogClosed(){
       closeButton.isEnabled();

    }

}
