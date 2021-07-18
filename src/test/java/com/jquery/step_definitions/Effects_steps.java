package com.jquery.step_definitions;

import com.jquery.base.Hook;
import com.jquery.pages.Home_Page;
import com.jquery.pages.effects_section.AddClass_Page;
import com.jquery.pages.effects_section.ColorAnimation_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.awt.*;

public class Effects_steps {
    Home_Page home_Page = new Home_Page(Hook.driver);
    AddClass_Page addClass_page = new AddClass_Page(Hook.driver);
    ColorAnimation_Page colorAnimation_page = new ColorAnimation_Page(Hook.driver);

    @Given("User click Add Class button")
    public void user_click_add_class_button() {
        home_Page.clickAddClassButton();
    }
    @When("User run effect")
    public void user_run_effect() throws InterruptedException {
        addClass_page.clickRunEffectButton();
    }
    @Then("User verify the effect change")
    public void user_verify_the_effect_change() throws InterruptedException {
        addClass_page.getEffectChange();
    }
    @Given("User click Color Animation button")
    public void user_click_color_animation_button() {
home_Page.clickColorAnimationButton();

    }
    @When("User click Toggle Effect")
    public void user_click_toggle_effect() {
colorAnimation_page.clickToggleEffect();

    }
    @Then("User displays what color used in animation")
    public void user_displays_what_color_used_in_animation() {
String beforeEffect = colorAnimation_page.clickToggleEffect();
String afterEffect = colorAnimation_page.getEffectChanged();
Assert.assertNotEquals(beforeEffect,afterEffect);

    }
}
