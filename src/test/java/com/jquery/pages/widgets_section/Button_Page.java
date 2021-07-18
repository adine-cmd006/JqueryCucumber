package com.jquery.pages.widgets_section;

import com.jquery.utility.CommonLibrary;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Button_Page {
    public Button_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    CommonLibrary library = new CommonLibrary();

    @FindBy(xpath = "(//button[text()='A button element'])[1]")
    WebElement buttonOne;

    public void clickRandomButton() throws InterruptedException {
        if(buttonOne.getAttribute("value").equalsIgnoreCase("A button element")){
            Thread.sleep(3000);
            buttonOne.click();
            System.out.println(buttonOne.getAttribute("value"));
        }

    }
}
