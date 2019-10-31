package ar.edu.unahur.Condiciones.TipoEntrega;

import ar.edu.unahur.Condiciones.Producto;

public abstract class TipoDeEntrega extends Producto {
    private Producto producto;

    public TipoDeEntrega(Producto producto){
        this.producto = producto;
    }

    public abstract String tipoEntrega(TipoDeEntrega tipoPago);

}
