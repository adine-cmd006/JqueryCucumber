package com.jquery.pages.widgets_section;

import com.jquery.utility.CommonLibrary;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ToolTip_Page {
    public ToolTip_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    CommonLibrary library = new CommonLibrary();

    @FindBy(xpath = "/html/body/p[1]/a")
    WebElement toolTipHover;

    public void setToolTipHover() throws InterruptedException {
        library.moveToElement(toolTipHover);
        toolTipHover.click();
        Thread.sleep(2000);
    }

public void  displayHover(){
    System.out.println(toolTipHover.getAttribute("title"));
}






}
