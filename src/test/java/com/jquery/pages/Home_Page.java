package com.jquery.pages;

import com.jquery.utility.CommonLibrary;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
    public Home_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    CommonLibrary library = new CommonLibrary();

    public int xOriginalLocation;

    @FindBy(linkText = "Draggable")
    WebElement draggableButton;
    @FindBy(css = "iframe.demo-frame")
    WebElement iframe;
    @FindBy(id = "draggable")
    WebElement dragElement;

    @FindBy(linkText = "Droppable")
    WebElement droppableButton;

    @FindBy(linkText = "Resizable")
    WebElement resizableButton;

    @FindBy(xpath = "//*[@id='resizable']/div[3]")
    WebElement resizeElement;

    @FindBy(linkText = "Selectable")
    WebElement selectableButton;

    @FindBy(linkText = "Sortable")
    WebElement sortableButton;

    @FindBy(linkText = "Accordion")
    WebElement accordionButton;

    @FindBy(linkText = "Autocomplete")
    WebElement autoCompleteButton;

    @FindBy(linkText = "Button")
    WebElement buttonButton;

    @FindBy(linkText = "Checkboxradio")
    WebElement checkboxradioButton;

    @FindBy(linkText = "Controlgroup")
    WebElement controlGroupButton;

    @FindBy(linkText = "Datepicker")
    WebElement datePicker;

    @FindBy(linkText = "Dialog")
    WebElement dialogButton;

    @FindBy(linkText = "Menu")
    WebElement menuButton;

    @FindBy(linkText = "Progressbar")
    WebElement progressBarButton;

    @FindBy(linkText = "Slider")
    WebElement sliderButton;

    @FindBy(linkText = "Tooltip")
    WebElement toolTipButton;

    @FindBy(linkText = "Position")
    WebElement positionButton;

    @FindBy(linkText = "Widget Factory")
    WebElement widgetFactoryButton;

    @FindBy(linkText = "Add Class")
    WebElement addClassButton;

    @FindBy(linkText = "Color Animation")
    WebElement colorAnimationButton;

    public int clickDraggableButton() {
        //driver click the draggable
        draggableButton.click();
        library.switchIFrame(iframe);
        int[] x_y_location = library.getLocation(dragElement);
        xOriginalLocation = x_y_location[0];
        return xOriginalLocation;
    }

    public void clickDroppableButton() {
        droppableButton.click();
        library.switchIFrame(iframe);
    }

    public int clickResizeButton() {
        resizableButton.click();
        library.switchIFrame(iframe);
        int[] x_y_location = library.getLocation(resizeElement);
        xOriginalLocation = x_y_location[0];
        return xOriginalLocation;
    }

    public void clickSelectableButton() {
        selectableButton.click();
        library.switchIFrame(iframe);
    }

    public void clickSortableButton() {
        sortableButton.click();
        library.switchIFrame(iframe);
    }

    public void clickAccordionButton() {
        accordionButton.click();
        library.switchIFrame(iframe);
    }

    public void clickAutoDropDownButton() {
        autoCompleteButton.click();
        library.switchIFrame(iframe);
    }

    public void clickButtonButton() {
        buttonButton.click();
        library.switchIFrame(iframe);
    }

    public void clickCheckBoxRadioButton() {
        checkboxradioButton.click();
        library.switchIFrame(iframe);
    }

    public void clickControlGroupButton() {
        controlGroupButton.click();
        library.switchIFrame(iframe);
    }

    public void clickDatePicker() {
        datePicker.click();
        library.switchIFrame(iframe);
    }

    public void clickDialogButton() {
        dialogButton.click();
        library.switchIFrame(iframe);
    }

    public void clickMenuButton() {
        menuButton.click();
        library.switchIFrame(iframe);
    }

    public void clickProgressBar() {
        progressBarButton.click();
        library.switchIFrame(iframe);
    }

    public void clickSliderButton() {
        sliderButton.click();
        library.switchIFrame(iframe);
    }

    public void clickToolTipButton() {
        toolTipButton.click();
        library.switchIFrame(iframe);
    }

    public void clickPositionButton() {
        positionButton.click();
        library.switchIFrame(iframe);
    }

    public void clickWidgetFactoryButton() {
        widgetFactoryButton.click();
        library.switchIFrame(iframe);
    }

    public void clickAddClassButton() {
        addClassButton.click();
        library.switchIFrame(iframe);
    }

    public void clickColorAnimationButton() {
        colorAnimationButton.click();
        library.switchIFrame(iframe);
    }
}
