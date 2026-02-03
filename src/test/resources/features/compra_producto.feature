#language: es

  @compra_producto
  Característica: Compra de un producto en la pagina de MundoFlor

      Yo como usuario de la pagina de MundoFlor
      Quiero validar el proceso de compra de un producto
      Para comprobar que los flujos de compra funcionan correctamente


      Antecedentes:
        Dado que el usuario abre la pagina de MundoFlor


      @producto_agregado_exitosamente
      Escenario: Producto agregado exitosamente al carrito de compras
        Cuando el usuario agrega el producto al carrito de compras
        Entonces que el usuario esta en el carrito de compras y tiene al menos un producto agregado


      @carrito_vacio
      Escenario: Carrito de compras vacio
        Cuando el usuario agrega el producto al carrito de compras
        Entonces que el usuario esta en el carrito de compras y tiene al menos un producto agregado
        Y el usuario elimina el producto del carrito de compras
        Entonces el usuario debera ver el mensaje "Tu carrito está vacío."


      @proceso_checkout
      Escenario: Proceso de checkout exitoso
        Cuando el usuario agrega el producto al carrito de compras
        Entonces que el usuario esta en el carrito de compras y tiene al menos un producto agregado
        Y el usuario procede al checkout al hacer clic en Finalizar compra
        Y completa la informacion requerida para el envio y pago
        Entonces el usuario debera ver el mensaje de confirmacion "¿Cómo quieres pagar?"


      @proceso_checkout_fallido
      Escenario: Proceso de checkout fallido por informacion incompleta
        Cuando el usuario agrega el producto al carrito de compras
        Entonces que el usuario esta en el carrito de compras y tiene al menos un producto agregado
        Y el usuario procede al checkout al hacer clic en Finalizar compra
        Y no diligencia informacion obligatoria para el envio y pago
        Entonces el usuario debera ver mensajes de error indicando los campos obligatorios que faltan por diligenciar
