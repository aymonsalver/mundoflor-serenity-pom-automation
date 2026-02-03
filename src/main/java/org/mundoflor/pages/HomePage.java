package org.mundoflor.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageObject {

    @FindBy(xpath = "(//span[normalize-space()='Añadir al carrito'])[1]")
    WebElement BTN_ADD_TO_CART;

    @FindBy(css="#cart .dropdown-toggle.mini-cart")
    WebElement BTN_DROPDOWN_CART;

    @FindBy(css="#cart .dropdown-menu a.view-cart")
    WebElement BTN_VIEW_CART;



    public WebElement getBTN_ADD_TO_CART() {
        return BTN_ADD_TO_CART;
    }

    public WebElement getBTN_DROPDOWN_CART() {
        return BTN_DROPDOWN_CART;
    }

    public WebElement getBTN_VIEW_CART() {
        return BTN_VIEW_CART;
    }
}
