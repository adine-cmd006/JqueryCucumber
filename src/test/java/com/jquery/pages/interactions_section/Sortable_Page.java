package com.jquery.pages.interactions_section;

import com.jquery.utility.CommonLibrary;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.jquery.base.Hook.driver;

public class Sortable_Page {
    public Sortable_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //CommonLibrary called
    CommonLibrary library = new CommonLibrary();
    @FindBy(xpath = "//*[@id='sortable']/li[2]")
    WebElement sortableItemOne;

    @FindBy(xpath = "//*[@id='sortable']/li[6]")
    WebElement sortableItemFour;

    @FindBy(xpath = "//*[@id='sortable']/li")
    List<WebElement> sortableItemsList;


    public void sortItems() {
        library.dragAndDrop(driver,sortableItemOne,sortableItemFour);
    }

    public void printItemsListAreChanged() {
        String sortArray[] = new String[sortableItemsList.size()];
        for (int i = 0; i < sortableItemsList.size(); i++) {
            sortArray[i] = sortableItemsList.get(i).getText();
            System.out.println(sortArray[i]);
        }
    }
}
