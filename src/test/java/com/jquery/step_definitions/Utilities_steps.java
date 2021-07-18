package com.jquery.step_definitions;

import com.jquery.base.Hook;
import com.jquery.pages.Home_Page;
import com.jquery.pages.utilities_section.Position_Page;
import com.jquery.pages.utilities_section.WidgetFactory_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Utilities_steps {
    Home_Page home_Page = new Home_Page(Hook.driver);
    Position_Page position_page = new Position_Page(Hook.driver);
    WidgetFactory_Page widgetFactory_page = new WidgetFactory_Page(Hook.driver);

    @Given("User click Position button")
    public void user_click_position_button() {
home_Page.clickPositionButton();
    }
    @When("User get the location of position")
    public void user_get_the_location_of_position() {
position_page.getPositionLocation();
    }
    @Then("User verify if the position location changed")
    public void user_verify_if_the_position_location_changed() {
        int original = position_page.getPositionLocation();
        int adjusted = position_page.adjustPositionLocation();
        Assert.assertNotEquals(original,adjusted);
    }

    @Given("User click Widget Factory button")
    public void user_click_widget_factory_button() {
home_Page.clickWidgetFactoryButton();

    }
    @When("User selects Go green button")
    public void user_selects_go_green_button() {
widgetFactory_page.setGreenButton();

    }
    @Then("User change the color and check if it is still green")
    public void user_change_the_color_and_check_if_it_is_still_green() {
        String greenColor = widgetFactory_page.setGreenButton();
        String colorChange = widgetFactory_page.changeGreenColor();
        Assert.assertNotEquals(greenColor,colorChange);

    }
}
