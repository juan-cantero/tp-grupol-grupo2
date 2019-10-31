package ar.edu.unahur.Condiciones.Tipopago;

import ar.edu.unahur.Condiciones.Producto;

public class Efectivo<TipoPago> extends TipoPago {

    private String efectivo;

    public Efectivo(Producto producto){
        super(producto);
    }

    public void tipoDePago(TipoPago tipoPago) {
        this.efectivo = "efectivo";
    }

    public String tipoDePago(Producto producto) {
        return this.tipoDePago(producto);
    }
}
