package ar.edu.unahur.facade.mockdata;


import ar.edu.unahur.facade.productos.Producto;

public class LibroMock {
  private  int id;
  private float precio;
  private String nombre;
  private String autor;
  private String genero;

  public LibroMock(int id, float precio, String nombre, String autor, String genero) {

    this.id = id;
    this.precio = precio;
    this.nombre = nombre;
    this.autor = autor;
    this.genero = genero;
  }

  public int getId() {
    return id;
  }

  public float getPrecio() {
    return precio;
  }

  public String getNombre() {
    return nombre;
  }

  public String getAutor() {
    return autor;
  }

  public String getGenero() {
    return genero;
  }

  @Override
  public String toString() {
    return "LibroMock{" +
            "ID=" + id +
            ", precio=" + precio +
            ", nombre='" + nombre + '\'' +
            ", autor='" + autor + '\'' +
            ", genero='" + genero + '\'' +
            '}';
  }
}
