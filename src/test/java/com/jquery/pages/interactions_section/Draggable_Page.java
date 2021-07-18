package com.jquery.pages.interactions_section;

import com.jquery.utility.CommonLibrary;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static com.jquery.base.Hook.*;

public class Draggable_Page {
    public Draggable_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //CommonLibrary called
    CommonLibrary library = new CommonLibrary();
    int X = 221;
    int Y = 0;

    @FindBy(id = "draggable")
    WebElement dragElement;

    public void dragItToXAndYLocation() {
        library.dragAndDrop(driver, dragElement, X, Y);
    }

    public int getAfterDraggedLocation() {
        int xLocation = dragElement.getRect().getX();
        return xLocation;
    }


}
