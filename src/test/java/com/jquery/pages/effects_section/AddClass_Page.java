package com.jquery.pages.effects_section;

import com.jquery.utility.CommonLibrary;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddClass_Page {
    public AddClass_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    CommonLibrary library = new CommonLibrary();

    @FindBy(xpath = "//*[@id='effect']")
    WebElement effect;

    @FindBy(xpath = "//*[@id='button']")
    WebElement runEffectButton;

    public void clickRunEffectButton() throws InterruptedException {
        String animatingEffect = runEffectButton.getAttribute("style");
        System.out.println(animatingEffect);
        runEffectButton.click();
        Thread.sleep(1000);
    }

    public void getEffectChange() {
        String effectChanged = runEffectButton.getAttribute("style");
        System.out.println(effectChanged);
    }

}
