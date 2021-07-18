package com.jquery.pages.widgets_section;

import com.jquery.utility.CommonLibrary;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DatePicker_Page {
    public DatePicker_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    CommonLibrary library = new CommonLibrary();

    @FindBy(id = "datepicker")
    WebElement datePicker;

    @FindBy(xpath = "//*[@id='ui-datepicker-div']/div/div")
    WebElement monthYear;

    @FindBy(xpath = "//*[@id='ui-datepicker-div']/div/a[2]/span")
    WebElement next;

    @FindBy(xpath = "//*[@id='ui-datepicker-div']/table/tbody/tr[4]/td[5]/a")
    WebElement date;

    String monthAndYear = "August 2022";
    String dates = "26";

    public void chooseDate() {
        datePicker.click();
        while (true) {
            String monthYearTitle = monthYear.getText();
            if (monthYearTitle.equals(monthAndYear)) {
                break;
            } else {
                next.click();
            }
        }
        date.click();
    }

    public String verifyDates(){
        String original = datePicker.getAttribute("value");
        System.out.println(original);
        return original;
    }
}