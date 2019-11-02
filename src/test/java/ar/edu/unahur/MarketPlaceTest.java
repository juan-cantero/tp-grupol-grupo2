package ar.edu.unahur;

import ar.edu.unahur.facade.mockdata.LibroMock;
import ar.edu.unahur.facade.mockdata.MockData;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class MarketPlaceTest {

  List<LibroMock> libros;

  @Before
  public void getLibros() throws IOException {
    libros = MockData.getLibroMocks();
  };

  @Test
  public void printLibros() {

    libros.stream().forEach(libroMock -> System.out.println(libroMock.getPrecio()));

  }
}
