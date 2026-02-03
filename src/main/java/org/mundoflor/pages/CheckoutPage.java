package org.mundoflor.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends PageObject {

    @FindBy(id = "billing_first_name")
    WebElement INPUT_FIRST_NAME;

    @FindBy(id = "billing_last_name")
    WebElement INPUT_LAST_NAME;

    @FindBy(id = "billing_address_1")
    WebElement INPUT_ADDRESS;

    @FindBy(id= "billing_phone")
    WebElement INPUT_PHONE;

    @FindBy(id = "billing_email")
    WebElement INPUT_EMAIL;

    @FindBy(id = "billing_remitente")
    WebElement INPUT_REMITENTE;

    @FindBy(id = "place_order")
    WebElement BTN_PLACE_ORDER;

    @FindBy(id = "terms")
    WebElement CHECKBOX_TERMS;

    @FindBy(css = "ul.woocommerce-error")
    WebElement LBL_ERROR_MESSAGES;



    public WebElement getINPUT_FIRST_NAME() {
        return INPUT_FIRST_NAME;
    }

    public WebElement getINPUT_LAST_NAME() {
        return INPUT_LAST_NAME;
    }

    public WebElement getINPUT_ADDRESS() {
        return INPUT_ADDRESS;
    }

    public WebElement getINPUT_PHONE() {
        return INPUT_PHONE;
    }

    public WebElement getINPUT_EMAIL() {
        return INPUT_EMAIL;
    }

    public WebElement getINPUT_REMITENTE() {
        return INPUT_REMITENTE;
    }

    public WebElement getBTN_PLACE_ORDER() {
        return BTN_PLACE_ORDER;
    }

    public WebElement getCHECKBOX_TERMS() {
        return CHECKBOX_TERMS;
    }

    public WebElement getLBL_ERROR_MESSAGES() {
        return LBL_ERROR_MESSAGES;
    }
}
