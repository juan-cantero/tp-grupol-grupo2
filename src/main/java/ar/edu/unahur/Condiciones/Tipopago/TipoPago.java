package ar.edu.unahur.Condiciones.Tipopago;
import ar.edu.unahur.Condiciones.Producto;
public abstract class TipoPago extends Producto{
    private Producto producto;

    public TipoPago(TipoPago producto){
            this.producto = producto;
    }

    public abstract tipoDePago(Producto producto) ;


}
