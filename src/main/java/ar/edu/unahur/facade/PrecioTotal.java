package ar.edu.unahur.facade;

import ar.edu.unahur.facade.tiposDePago.TipoDePago;
import ar.edu.unahur.facade.tipos_de_entrega.TipoDeEntrega;

public class PrecioTotal {
    private CarritoDeCompras carrito;
    private TipoDeEntrega entrega;
    private TipoDePago pago;

    public PrecioTotal(CarritoDeCompras carrito, TipoDeEntrega entrega, TipoDePago pago) {
        this.carrito = carrito;
        this.entrega = entrega;
        this.pago = pago;
    }

    public Double precioFinal(){
        return Double.valueOf(String.format("%.2f",
                pago.Total(carrito.total() + entrega.costoAdicional())));
    }

}
