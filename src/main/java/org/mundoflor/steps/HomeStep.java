package org.mundoflor.steps;

import net.serenitybdd.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.mundoflor.pages.HomePage;

public class HomeStep {

    @Page
    HomePage homePage;



    @Step("Abrir navegador" )
    public void abrirNavegador() {
        homePage.openUrl("https://www.floristeriamundoflor.com/");
    }

    @Step("Agregar al carrito" )
    public void agregarAlCarrito(){
        homePage.getBTN_ADD_TO_CART().click();
    }

    @Step("Ir al carrito" )
    public void irAlCarrito(){
        homePage.getBTN_DROPDOWN_CART().click();
        homePage.getBTN_VIEW_CART().click();
    }
}
