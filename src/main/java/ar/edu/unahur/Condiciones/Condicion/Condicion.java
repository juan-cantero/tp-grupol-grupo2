package ar.edu.unahur.Condiciones.Condicion;

import ar.edu.unahur.Condiciones.Producto;

public abstract class Condicion extends Producto {
    private Producto producto;


    public Condicion(Producto producto) {
        this.producto = producto;
    }

    public String condicion(){
        return producto.condicion();
    }


}
