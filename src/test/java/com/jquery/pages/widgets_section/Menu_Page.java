package com.jquery.pages.widgets_section;

import com.jquery.utility.CommonLibrary;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Menu_Page {
    public Menu_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    CommonLibrary library = new CommonLibrary();
    @FindBy(xpath = "//*[@id='ui-id-9']")
    WebElement musicElement;

    @FindBy(xpath = "//*[@id='ui-id-10']")
    WebElement rockMusic;

    @FindBy(xpath = "//*[@id='ui-id-12']")
    WebElement classicMusic;

    public void selectClassicRockMusic() throws InterruptedException {
        musicElement.click();
        Thread.sleep(3000);
        library.moveToElement(rockMusic);
        Thread.sleep(3000);
        library.moveToElement(classicMusic);
    }
    public void  getSelectOption(){
        System.out.println("classicRockMusic");
    }

}
