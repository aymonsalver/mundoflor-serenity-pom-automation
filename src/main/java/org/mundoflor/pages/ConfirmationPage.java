package org.mundoflor.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConfirmationPage extends PageObject {

    @FindBy(xpath ="//h1[contains(text(),'Pagar por el pedido')]")
    WebElement LBL_CONFIRMATION_MESSAGE;


    public WebElement getLBL_CONFIRMATION_MESSAGE() {
        return LBL_CONFIRMATION_MESSAGE;
    }
}
