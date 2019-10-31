package ar.edu.unahur.Cliente;

import ar.edu.unahur.Condiciones.Categoria.Categoria;

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
