package ar.edu.unahur.facade;
import ar.edu.unahur.facade.Stocks.StockLibros;
import java.time.LocalDate;

public class MarketPlaceApp {
  public static void main(String[] args) {
    MarketPlaceFacade marketPlace = new MarketPlaceFacade(new StockLibros(),new CarritoDeCompras());
    marketPlace.cargarStock();
    marketPlace.cargarDatosTarjeta("juan",
            "Visa", "645644", "123456", LocalDate.of(2022,03,04));
    marketPlace.cargarProducto(1);
    marketPlace.cargarProducto(2);
    marketPlace.cargarProducto(3);
    marketPlace.pagoEnEfectivo();
    marketPlace.acordarTipoDeEntrega("sucursal");
    marketPlace.mostrarPorRangoDePrecios(20.0,30.0);
    System.out.println(marketPlace.getTotal());

  }
}
