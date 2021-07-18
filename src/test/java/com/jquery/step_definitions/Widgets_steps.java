package com.jquery.step_definitions;

import com.jquery.base.Hook;
import com.jquery.pages.Home_Page;
import com.jquery.pages.widgets_section.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;


public class Widgets_steps {
    Home_Page home_Page = new Home_Page(Hook.driver);
    AutoComp_Page autoComp_page = new AutoComp_Page(Hook.driver);
    Accordion_Page accordion_page = new Accordion_Page(Hook.driver);
    Button_Page button_page = new Button_Page(Hook.driver);
    CheckBoxRadio_Page checkBoxRadio_page = new CheckBoxRadio_Page(Hook.driver);
    ControlGroupButton_Page controlGroupButton_page = new ControlGroupButton_Page(Hook.driver);
    DatePicker_Page datePicker_page = new DatePicker_Page(Hook.driver);
    Dialog_Page dialog_page = new Dialog_Page(Hook.driver);
    Menu_Page menu_page = new Menu_Page(Hook.driver);
    ProgressBar_Page progressBar_page = new ProgressBar_Page(Hook.driver);
    Slider_Page slider_page = new Slider_Page(Hook.driver);
    ToolTip_Page toolTip_page = new ToolTip_Page(Hook.driver);

    @Given("User click Accordion button")
    public void user_click_accordion_button() {
        home_Page.clickAccordionButton();
    }

    @When("User click random section")
    public void user_click_random_section() {
        accordion_page.clicksEachSection();
    }

    @Then("User shows the content of the section")
    public void user_shows_the_content_of_the_section() {
        accordion_page.accordionDisplay();
    }

    @Given("User click Autocomplete button")
    public void user_click_autocomplete_button() {
        home_Page.clickAutoDropDownButton();
    }

    @When("User type into the field")
    public void user_type_into_the_field() throws InterruptedException {
        autoComp_page.autoComplete();
    }

    @Then("User check if the text are in tags field")
    public void user_check_if_the_text_are_in_tags_field() throws InterruptedException {
        String originalValue = autoComp_page.autoComplete();
        String afterFieldValue = autoComp_page.autoField();
        Assert.assertNotEquals(originalValue, afterFieldValue);

    }

    @Given("User click Button button")
    public void user_click_button_button() {
        home_Page.clickButtonButton();
    }

    @When("User clicks the buttons")
    public void user_clicks_the_buttons() throws InterruptedException {
        button_page.clickRandomButton();
    }

    @Then("User check if the buttons is clicked")
    public void user_check_if_the_buttons_is_clicked() {
        System.out.println("button is clicked");
    }

    @Given("User click CheckBoxRadio button")
    public void user_click_checkboxradio_button() {
        home_Page.clickCheckBoxRadioButton();

    }

    @When("User click checkboxes on each group")
    public void user_click_checkboxes_on_each_group() {
        checkBoxRadio_page.clickRadioType();
    }

    @Then("User check if the checkboxed are selected")
    public void user_check_if_the_checkboxed_are_selected() {
        checkBoxRadio_page.radioTypeIsSelected();
    }

    @Given("User click ControlGroup button")
    public void user_click_control_group_button() {
        home_Page.clickControlGroupButton();
    }

    @When("User select the each option")
    public void user_select_the_each_option() {
        controlGroupButton_page.rentalCarSelect();
    }

    @Then("User book the car")
    public void user_book_the_car() {
        controlGroupButton_page.bookNow();
    }

    @Given("User click DatePicker button")
    public void user_click_datepicker_button() {
        home_Page.clickDatePicker();
    }

    @When("User select the date")
    public void user_select_the_date() {
        datePicker_page.chooseDate();
    }

    @Then("User check if the date is selected")
    public void user_check_if_the_date_is_selected() {
        String original = datePicker_page.verifyDates();
        String givenDateAndMonth = "08/25/2022";
        Assert.assertEquals(original,givenDateAndMonth);

    }
    @Given("User click Dialog button")
    public void user_click_dialog_button() {
home_Page.clickDialogButton();
    }
    @When("User closed the dialog button")
    public void user_closed_the_dialog_button() {
dialog_page.closeIcon();
    }
    @Then("User check if dialog is closed")
    public void user_check_if_dialog_is_closed() {
dialog_page.checkDialogClosed();
    }

    @Given("User click menu button")
    public void user_click_menu_button() {
home_Page.clickMenuButton();
    }

    @When("User order classic rock music")
    public void user_order_classic_rock_music() throws InterruptedException {
menu_page.selectClassicRockMusic();
    }
    @Then("User check if selected correct music")
    public void user_check_if_selected_correct_music() {
menu_page.getSelectOption();
    }
    @Given("User click Progressbar button")
    public void user_click_progressbar_button() {
        home_Page.clickProgressBar();
    }
    @When("User check status of Progressbar")
    public void user_check_status_of_progressbar() {
progressBar_page.statusProgressBar();
    }
    @Then("User displays status of Progressbar")
    public void user_displays_status_of_progressbar() {
progressBar_page.displayStatusProgressBar();
    }

    @Given("User click Slider button")
    public void user_click_slider_button() {
home_Page.clickSliderButton();
    }
    @When("User Slide the slider to the end")
    public void user_slide_the_slider_to_the_end() {
        slider_page.moveSlider();
    }
    @Then("User check if the slider is at the end")
    public void user_check_if_the_slider_is_at_the_end() {
slider_page.getSlider();
    }


    @Given("User click into Tooltip button")
    public void user_click_into_tooltip_button() {
        home_Page.clickToolTipButton();
    }
    @When("User Selects Tooltips")
    public void user_selects_tooltips() throws InterruptedException {
toolTip_page.setToolTipHover();
    }
    @Then("User Displays the tooltips information")
    public void user_displays_the_tooltips_information() {
toolTip_page.displayHover();
    }
}
