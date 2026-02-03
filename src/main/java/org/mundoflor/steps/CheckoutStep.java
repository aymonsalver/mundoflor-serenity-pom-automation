package org.mundoflor.steps;

import net.serenitybdd.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;
import org.mundoflor.models.UserData;
import org.mundoflor.pages.CheckoutPage;
import org.mundoflor.utils.ExcelReader;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutStep {

    @Page
    CheckoutPage checkoutPage;


    String dataExcel = "src/test/resources/data/checkout_data.xlsx";

    UserData userData = ExcelReader.readData(dataExcel);


    @Step("Realizar checkout" )
    public void checkout(){
        checkoutPage.getINPUT_FIRST_NAME().sendKeys(userData.getFirstName());
        checkoutPage.getINPUT_LAST_NAME().sendKeys(userData.getLastName());
        checkoutPage.getINPUT_ADDRESS().sendKeys(userData.getAddress());
        checkoutPage.getINPUT_PHONE().sendKeys(userData.getPhone());
        checkoutPage.getINPUT_EMAIL().sendKeys(userData.getEmail());
        checkoutPage.getINPUT_REMITENTE().sendKeys(userData.getRemitente());
        checkoutPage.getCHECKBOX_TERMS().click();
        checkoutPage.getBTN_PLACE_ORDER().click();
    }

    @Step("Realizar checkout sin datos" )
    public void checkoutSinDatos(){
        checkoutPage.getBTN_PLACE_ORDER().click();
    }

    @Step("Validar mensaje de error" )
    public void validarMensajeError(){
        WebDriverWait wait = new WebDriverWait(checkoutPage.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkoutPage.getLBL_ERROR_MESSAGES())));
        Assert.assertTrue("El mensaje de error no se muestra", checkoutPage.getLBL_ERROR_MESSAGES().isDisplayed());
    }
}
