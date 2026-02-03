package org.mundoflor.pages;


import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CartPage extends PageObject {

    @FindBy(xpath = "//a[contains(@class,'checkout-button button alt wc-forward')]")
    WebElement BTN_PROCEED_TO_CHECKOUT;

    @FindBy(css = "td.product-name a")
    WebElement LBL_PRODUCT_NAME;

    @FindBy(css = "td.product-name a")
    List<WebElement> LBL_LIST_PRODUCT_NAMES;

    @FindBy(xpath = "//tr[@class='cart_item']//td[@class='product-remove']//a[@class='remove']")
    WebElement BTN_REMOVE_PRODUCT;

    @FindBy(xpath = "//div[contains(@class,'cart-empty') and contains(@class,'woocommerce-info')]")
    WebElement LBL_CART_EMPTY;


    public WebElement getBTN_PROCEED_TO_CHECKOUT() {
        return BTN_PROCEED_TO_CHECKOUT;
    }

    public WebElement getLBL_PRODUCT_NAME() {
        return LBL_PRODUCT_NAME;
    }

    public List<WebElement> getLBL_LIST_PRODUCT_NAMES() {
        return LBL_LIST_PRODUCT_NAMES;
    }

    public WebElement getBTN_REMOVE_PRODUCT() {
        return BTN_REMOVE_PRODUCT;
    }

    public WebElement getLBL_CART_EMPTY() {
        return LBL_CART_EMPTY;
    }
}
