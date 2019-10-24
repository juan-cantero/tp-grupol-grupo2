package ar.edu.unahur.Productos;

public class TipoDeEntrega {
    private String tipoEntrega;


    public String getTipoEntrega() {
        return tipoEntrega;
    }

    public void setTipoEntrega(String tipoEntrega) {

        if (tipoEntrega == "aDomicilio" || tipoEntrega == "alCorreo" ||tipoEntrega == "a" ){
            this.tipoEntrega = tipoEntrega;}

    }
}
