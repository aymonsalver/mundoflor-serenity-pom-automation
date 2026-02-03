package stepDefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.annotations.Steps;
import org.mundoflor.steps.CartStep;
import org.mundoflor.steps.CheckoutStep;
import org.mundoflor.steps.ConfirmationStep;
import org.mundoflor.steps.HomeStep;

public class CompraProductoStepDefinition {

    @Steps
    HomeStep homeStep;

    @Steps
    CartStep cartStep;

    @Steps
    CheckoutStep checkoutStep;

    @Steps
    ConfirmationStep confirmationStep;

    //=================Antecedentes=================//
    @Dado("que el usuario abre la pagina de MundoFlor")
    public void queElUsuarioAbreLaPaginaDeMundoFlor() {
        homeStep.abrirNavegador();
    }



    //=================Escenario: @producto_agregado_exitosamente =================//
    @Cuando("el usuario agrega el producto al carrito de compras")
    public void agregaElProductoAlCarritoDeCompras() {
        homeStep.agregarAlCarrito();
    }

    @Entonces("que el usuario esta en el carrito de compras y tiene al menos un producto agregado")
    public void queElUsuarioEstaEnElCarritoDeCompras() {
        cartStep.verificarProductoEnElCarrito();
    }



    //=================Escenario: @carrito_vacio=========================//
    @Cuando("el usuario elimina el producto del carrito de compras")
    public void elUsuarioEliminaElProductoDelCarritoDeCompras() {
        cartStep.eliminarProductoDelCarrito();
    }

    @Entonces("el usuario debera ver el mensaje {string}")
    public void elUsuarioDeberaVerElMensaje(String texto) {
        cartStep.verificarCarritoVacio(texto);
    }



    //=================Escenario: @proceso_checkout=================//
    @Cuando("el usuario procede al checkout al hacer clic en Finalizar compra")
    public void elUsuarioProcedeAlCheckoutAlHacerClicEnFinalizarCompra() {
        cartStep.procederAlCheckout();
    }

    @Cuando("completa la informacion requerida para el envio y pago")
    public void completaLaInformacionRequeridaParaElEnvioYPago() {
        checkoutStep.checkout();
    }

    @Entonces("el usuario debera ver el mensaje de confirmacion {string}")
    public void elUsuarioDeberaVerElMensajeDeConfirmacion(String texto) {
        confirmationStep.verificarConfirmacionDePedido(texto);
    }



    //=================Escenario: @proceso_checkout_fallido=================//
    // Se repiten los dos primeros pasos del Escenario: @proceso_checkout  //
    @Cuando("no diligencia informacion obligatoria para el envio y pago")
    public void noDiligenciaInformacionObligatoriaParaElEnvioYPago() {
        checkoutStep.checkoutSinDatos();
    }

    @Entonces("el usuario debera ver mensajes de error indicando los campos obligatorios que faltan por diligenciar")
    public void elUsuarioDeberaVerMensajesDeErrorIndicandoLosCamposObligatoriosQueFaltanPorDiligenciar() {
        checkoutStep.validarMensajeError();
    }

}
