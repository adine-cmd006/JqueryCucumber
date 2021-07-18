package com.jquery.pages.widgets_section;

import com.jquery.utility.CommonLibrary;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static com.jquery.base.Hook.*;

public class Slider_Page {
    public Slider_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    CommonLibrary library = new CommonLibrary();

    @FindBy(xpath = "//*[@id='slider']/span")
    WebElement slider;

    public void moveSlider(){
    slider.click();
        library.dragAndDrop(driver,slider,400,0);
        System.out.println(slider.getAttribute("style"));
    }

    public boolean getSlider(){
        if(slider.getAttribute("style").equalsIgnoreCase("left: 70%;")){
            return true;
        }
        return false;
    }

}
