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

  public CarritoDeCompras getCarrito() {
    return carrito;
  }

  public void setCarrito(CarritoDeCompras carrito) {
    this.carrito = carrito;
  }

  public TipoDeEntrega getEntrega() {
    return entrega;
  }

  public void setEntrega(TipoDeEntrega entrega) {
    this.entrega = entrega;
  }

  public TipoDePago getPago() {
    return pago;
  }

  public void setPago(TipoDePago pago) {
    this.pago = pago;
  }

  public Double precioFinal(){
        return Double.valueOf(String.format("%.2f",
                pago.Total(carrito.total() + entrega.costoAdicional())));
    }



}
