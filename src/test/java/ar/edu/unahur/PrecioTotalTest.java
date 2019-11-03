package ar.edu.unahur;

import ar.edu.unahur.facade.CarritoDeCompras;
import ar.edu.unahur.facade.PrecioTotal;
import ar.edu.unahur.facade.Stocks.StockLibros;
import ar.edu.unahur.facade.tiposDePago.PagoTarjeta;
import ar.edu.unahur.facade.tiposDePago.cuotas.EnTresCuotas;
import ar.edu.unahur.facade.tipos_de_entrega.Entrega;
import ar.edu.unahur.facade.tipos_de_entrega.EntregaADomicilio;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PrecioTotalTest {
  PrecioTotal calctotal;
  StockLibros stockLibros;
  CarritoDeCompras carrito;
  PagoTarjeta pagoTarjeta;
  Entrega entrega;

  @BeforeTest
  public void setUp() {
    stockLibros = new StockLibros();
    stockLibros.cargarLibros();

    carrito = new CarritoDeCompras();

    pagoTarjeta = new PagoTarjeta();
    pagoTarjeta.setCuotable(new EnTresCuotas());

    entrega = new Entrega();
    entrega.setTipoDeEntrega(new EntregaADomicilio());

    carrito.agregarProducto(stockLibros.getLibro(0));
    carrito.agregarProducto(stockLibros.getLibro(1));

    calctotal = new PrecioTotal(carrito,entrega,pagoTarjeta);

  }

  @Test
  public void calcTotal() {
    Double expected = 222.5;
    Assert.assertEquals(calctotal.precioFinal(),expected);
  }

}
