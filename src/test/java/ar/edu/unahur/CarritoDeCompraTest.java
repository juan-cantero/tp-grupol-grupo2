package ar.edu.unahur;

import ar.edu.unahur.facade.CarritoDeCompras;
import ar.edu.unahur.facade.mockdata.LibroMock;
import ar.edu.unahur.facade.mockdata.MockData;
import ar.edu.unahur.facade.productos.Libro;
import org.junit.Before;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

public class CarritoDeCompraTest {
  CarritoDeCompras carrito;
  List<Libro> libros;

  @BeforeTest
  public void setUp() throws IOException {
    carrito = new CarritoDeCompras();
    libros = MockData.crearLibros();
    carrito.agregarProducto(libros.get(0));
    carrito.agregarProducto(libros.get(1));
  }

  @Test
  public void total() {
    Double expected = 78.0;
    Assert.assertEquals(carrito.total(), expected);
  }




}
