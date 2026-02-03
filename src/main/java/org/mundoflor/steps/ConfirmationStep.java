package org.mundoflor.steps;

import net.serenitybdd.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;
import org.mundoflor.pages.ConfirmationPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ConfirmationStep {

    @Page
    ConfirmationPage confirmationPage;


    @Step("Verificar confirmación de pedido" )
    public void verificarConfirmacionDePedido(String text){
        WebDriverWait wait = new WebDriverWait(confirmationPage.getDriver(),  Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(confirmationPage.getLBL_CONFIRMATION_MESSAGE()));
        String actualText = confirmationPage.getLBL_CONFIRMATION_MESSAGE().getText().trim();
        Assert.assertEquals("Error: los textos no coinciden", text, actualText);
    }
}
