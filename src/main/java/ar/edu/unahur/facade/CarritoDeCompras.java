package ar.edu.unahur.facade;

import ar.edu.unahur.facade.productos.Producto;

import java.util.LinkedList;
import java.util.List;

public class CarritoDeCompras {

    List<Producto> productosCargados;

    public CarritoDeCompras() {
        productosCargados = new LinkedList<>();
    }

    public Double total(){
        return   productosCargados.stream()
                .mapToDouble(p -> p.getPrecio())
                .sum();
    }

    public void agregarProducto(Producto producto){
        this.productosCargados.add(producto);

    }

    public void eliminarProducto(Producto producto){
        this.productosCargados.remove(producto);

    }






}
