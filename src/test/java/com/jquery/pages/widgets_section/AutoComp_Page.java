package com.jquery.pages.widgets_section;

import com.jquery.utility.CommonLibrary;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AutoComp_Page {
    public AutoComp_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    CommonLibrary library = new CommonLibrary();
    @FindBy(xpath = "//*[@id='tags']")
    WebElement autoField;
    @FindBy(xpath = "//*[@id='ui-id-1']/li")
    List<WebElement> autoSuggestedElements;

    public String autoComplete() throws InterruptedException {
        autoField.clear();
        autoField.sendKeys("ja");
        String originalAutoField=autoField.getAttribute("value");
        Thread.sleep(3000);
        for (WebElement autoSuggest : autoSuggestedElements) {
            if (autoSuggest.getText().equalsIgnoreCase("java")) {
                autoSuggest.click();
                break;
            }
        }
        return originalAutoField;
    }

    public String autoField() throws InterruptedException {
        Thread.sleep(3000);
        String autoFieldValue = autoField.getAttribute("value");
        System.out.println(autoField.getAttribute("value"));
        return autoFieldValue;
    }

}
