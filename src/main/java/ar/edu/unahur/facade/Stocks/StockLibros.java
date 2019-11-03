package ar.edu.unahur.facade.Stocks;

import ar.edu.unahur.facade.mockdata.MockData;
import ar.edu.unahur.facade.productos.Libro;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StockLibros {
  private List<Libro> stockLibros;

  public StockLibros() {
    stockLibros = new ArrayList<>();
  }

  public void cargarLibros() {
    try {
      stockLibros = MockData.crearLibros();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public Libro getLibro(int pos) {
    return stockLibros.get(pos);
  }

  public List<Libro> getStockLibros() {
    return stockLibros;
  }
}
