package ar.edu.unahur.Condiciones.TipoEntrega;

import ar.edu.unahur.Condiciones.Producto;

public class Domicilio extends TipoDeEntrega{
    private String domicilio;

    public Domicilio(Producto producto){
        super(producto);
    }

    public void tipoEntrega(TipoDeEntrega entrega) {
        this.domicilio = "domicilio";
    }

    public String tipoEntrega(Producto producto) {
        return this.tipoEntrega(producto);
    }
}
