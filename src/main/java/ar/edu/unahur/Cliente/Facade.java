package ar.edu.unahur.Cliente;

import ar.edu.unahur.Categoria.Categoria;
import ar.edu.unahur.Productos.Producto;

public abstract class Facade {

    Categoria categoria;

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }



    public float costoDeEnvio(){
        categoria.precio();
    }



    public void tipoDeEntrega(){}


    public void  pago(){}


    public void condicion(){}










}
