package org.mundoflor.steps;

import net.serenitybdd.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;
import org.mundoflor.pages.CartPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartStep {

    @Page
    CartPage cartPage;

    private WebDriverWait getWait() {
        return new WebDriverWait(cartPage.getDriver(), Duration.ofSeconds(30));
    }


    @Step("Verificar producto en el carrito" )
    public void verificarProductoEnElCarrito(){
        getWait().until(ExpectedConditions.visibilityOf(cartPage.getLBL_PRODUCT_NAME()));
        cartPage.getLBL_PRODUCT_NAME().isDisplayed();
    }

    @Step("Verificar varios productos en el carrito" )
    public void verificarVariosProductosEnElCarrito(){
        cartPage.getLBL_LIST_PRODUCT_NAMES();
    }

    @Step("Proceder al checkout" )
    public void procederAlCheckout(){
        getWait().until(ExpectedConditions.elementToBeClickable(cartPage.getBTN_PROCEED_TO_CHECKOUT()));
        cartPage.getBTN_PROCEED_TO_CHECKOUT().click();
    }

    @Step("Eliminar producto del carrito" )
    public void eliminarProductoDelCarrito(){
        getWait().until(ExpectedConditions.elementToBeClickable(cartPage.getBTN_REMOVE_PRODUCT()));
        cartPage.getBTN_REMOVE_PRODUCT().click();
    }

    @Step("Verificar carrito vacio" )
    public void verificarCarritoVacio(String text){
        getWait().until(ExpectedConditions.visibilityOf(cartPage.getLBL_CART_EMPTY()));
        String actualText = cartPage.getLBL_CART_EMPTY().getText().trim();
        Assert.assertEquals("Error: los textos no coinciden", text, actualText);
    }

}
