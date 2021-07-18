package com.jquery.pages.widgets_section;

import com.jquery.utility.CommonLibrary;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Accordion_Page {

        public Accordion_Page(WebDriver driver) {
            PageFactory.initElements(driver, this);
        }

        CommonLibrary library = new CommonLibrary();

    @FindBy(xpath = "//*[@id='accordion']/h3[3]")
    WebElement accordion;
    @FindBy(xpath = "//*[@id='ui-id-6']/p")
    WebElement accordionDisplayedText;

    public void clicksEachSection() {
        accordion.click();
    }

    public void accordionDisplay() {
        System.out.println(accordionDisplayedText.getText());

    }

}
