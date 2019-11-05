package ar.edu.unahur.facade;

import ar.edu.unahur.facade.productos.Libro;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Filtro {

  public static void MostrarPorRangoDePrecios(List<Libro> libros, Double precioMin, Double precioMax) {
      List<Libro> librosPorPrecios = libros.stream()
              .filter(libro -> libro.getPrecio() >= precioMin &&
                      libro.getPrecio() <= precioMax)
              .collect(Collectors.toList());
      librosPorPrecios.forEach(System.out::println);
  }

  public static void MostrarPorGenero(List<Libro> libros) {
    List<Libro> librosPorGenero = libros.stream()
            .sorted(Comparator.comparing(Libro::getGenero))
            .collect(Collectors.toList());
    librosPorGenero.forEach(libro -> System.out.println(libro));
  }


}
