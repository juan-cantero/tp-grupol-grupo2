package ar.edu.unahur.facade.productos;

public class Producto {
  private final int ID;
  private float precio;


  public Producto(int id, float precio) {
    this.ID = id;
    this.precio = precio;

  }

  public int getId() {
    return ID;
  }

  public float getPrecio() {
    return precio;
  }



  public void setPrecio(int precio) {
    this.precio = precio;
  }
}
