package ar.edu.unahur.facade;

import ar.edu.unahur.facade.Stocks.StockLibros;
import ar.edu.unahur.facade.productos.Libro;
import ar.edu.unahur.facade.tarjetas_de_credito.TarjetaDeCredito;
import ar.edu.unahur.facade.tiposDePago.PagoEfectivo;
import ar.edu.unahur.facade.tiposDePago.TipoDePago;
import ar.edu.unahur.facade.tipos_de_entrega.EntregaFactory;
import ar.edu.unahur.facade.tipos_de_entrega.TipoDeEntrega;

import java.time.LocalDate;
import java.util.List;

public class MarketPlaceApp {
  public static void main(String[] args) {


    StockLibros stockLibros = new StockLibros();
    stockLibros.cargarLibros();


    TarjetaDeCredito tarjeta =
            new TarjetaDeCredito("juan",
                    "Visa", "645644", "123456", LocalDate.of(2022,03,04));
    TipoDePago efectivo = new PagoEfectivo();


    TipoDeEntrega entrega = EntregaFactory.getTipoEntrega("domicilio");

    CarritoDeCompras carrito = new CarritoDeCompras();

    PrecioTotal precioTotal = new PrecioTotal(carrito,entrega,efectivo);


    Filtro.MostrarPorRangoDePrecios(stockLibros.getStockLibros(),20.0,30.0);

    entrega = EntregaFactory.getTipoEntrega("sucursal");

    precioTotal.setEntrega(entrega);

    carrito.agregarProducto(stockLibros.getLibro(1));
    carrito.agregarProducto(stockLibros.getLibro(2));
    carrito.agregarProducto(stockLibros.getLibro(3));

    System.out.println(precioTotal.precioFinal());


  }
}
