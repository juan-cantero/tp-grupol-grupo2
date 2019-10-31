package ar.edu.unahur.Condiciones;

import ar.edu.unahur.Condiciones.Categoria.Categoria;
import ar.edu.unahur.Condiciones.Condicion.Condicion;


public class Producto {
    private String nombre;
    private float precio;
    Categoria categoria;
    private float costoDeEnvio;

    public Producto() {
    }

    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public float getCostoDeEnvio() {
        return costoDeEnvio;
    }


    public  String condicion(Condicion condicion) {
        return condicion.condicion();
    }

    public  String tipoDeEntrega() {
         ;
    }

    public  String tipoDePago() {
        return costoDeEnvio;
    }


    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", categoria=" + categoria +
                ", costoDeEnvio=" + costoDeEnvio +
                '}';
    }
}
