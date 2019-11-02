package ar.edu.unahur.facade.productos;


public class Libro extends Producto {
    private String nombre;
    private String autor;
    private String genero;


    public Libro(int id, float precio, String nombre, String autor, String genero) {
        super(id, precio);
        this.nombre = nombre;
        this.autor = autor;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "nombre='" + nombre + '\'' +
                ", autor='" + autor + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }
}
