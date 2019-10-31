package ar.edu.unahur.Condiciones.Tipopago;

import ar.edu.unahur.Condiciones.Producto;

public class Tarjeta extends TipoPago {
    private String tarjeta;

    public Tarjeta(Producto producto){
        super(producto);
    }

    public String tipoDePago(Producto producto) {
        return this.tarjeta = "tarjeta";
    }
}
