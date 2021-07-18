package com.jquery.step_definitions;

import com.jquery.base.Hook;
import com.jquery.pages.Home_Page;
import com.jquery.pages.interactions_section.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Interactions_steps {
    Home_Page home_Page = new Home_Page(Hook.driver);
    Draggable_Page draggable_page = new Draggable_Page(Hook.driver);
    Droppable_Page droppable_page= new Droppable_Page(Hook.driver);
    Resizable_Page resizable_page= new Resizable_Page(Hook.driver);
    Selectable_Page selectable_page= new Selectable_Page(Hook.driver);
    Sortable_Page sortable_page=new Sortable_Page(Hook.driver);

    @Given("User click draggable button")
    public void user_click_draggable_button() {
        home_Page.clickDraggableButton();
    }

    @When("User drag the element to the XAndYLocation")
    public void user_drag_the_element_to_the_XAndYLocation() {
        draggable_page.dragItToXAndYLocation();
    }

    @Then("User verify if drag item is on the XAndYLocation")
    public void user_verify_if_drag_item_is_on_the_XAndYLocation() {
        int afterX = draggable_page.getAfterDraggedLocation();
        int beforeX = home_Page.xOriginalLocation;
        Assert.assertNotEquals(beforeX, afterX);
    }

    @Given("User click droppable button")
    public void user_click_droppable_button() {
        home_Page.clickDroppableButton();
    }

    @When("User drag the element and drop the element")
    public void user_drag_the_element_and_drop_the_element() {
        droppable_page.dragTheElementToTheDropElement();

    }

    @Then("User verify if drag item is on drop element")
    public void user_verify_if_drag_item_is_on_drop_element() {
        droppable_page.dragIsOnDropPoint();
    }

    @Given("User click resizable button")
    public void user_click_resizable_button() {
        home_Page.clickResizeButton();
    }

    @When("User resize the element to the point")
    public void user_resize_the_element_to_the_point() {
        resizable_page.reSizeTheElement();
    }

    @Then("User verify if resize item is on point")
    public void user_verify_if_resize_item_is_on_point() {
        int afterX = resizable_page.reSizeTheElement();
        int beforeX = home_Page.xOriginalLocation;
        Assert.assertNotEquals(beforeX, afterX);

    }

    @Given("User click selectable button")
    public void user_click_selectable_button() {
        home_Page.clickSelectableButton();
    }

    @When("User select random items")
    public void user_select_random_items() {
        selectable_page.selectTheItem();
    }

    @Then("User verify if items are selected")
    public void user_verify_if_items_are_selected() {
        selectable_page.verifyTheSelectItem();
    }

    @Given("User click sortable button")
    public void user_click_sortable_button() {
        home_Page.clickSortableButton();
    }

    @When("User sort the element randomly")
    public void user_sort_the_element_randomly() {
        sortable_page.sortItems();
    }

    @Then("User print changed item list")
    public void user_print_changed_item_list() {
        sortable_page.printItemsListAreChanged();
    }


}
