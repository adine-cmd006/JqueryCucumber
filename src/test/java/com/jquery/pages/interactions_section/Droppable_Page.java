package com.jquery.pages.interactions_section;

import com.jquery.utility.CommonLibrary;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.jquery.base.Hook.driver;

public class Droppable_Page {
    public Droppable_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //CommonLibrary called
    CommonLibrary library = new CommonLibrary();
    @FindBy(id = "draggable")
    WebElement draggableElement;

    @FindBy(id = "droppable")
    WebElement droppableElement;

    public void dragTheElementToTheDropElement() {
        //library.scrollThePageDown(driver, Keys.PAGE_DOWN);
        library.dragAndDrop(driver, draggableElement, droppableElement);
        library.fluentWait(driver);
    }
    public void dragIsOnDropPoint() {
        String dropText = droppableElement.getText();
        if (dropText.equals("Dropped!")) {
            System.out.println("PASS: File is dropped to target as expected");
        } else {
            System.out.println("FAIL: File couldn't be dropped to target as expected");
        }
    }
}
