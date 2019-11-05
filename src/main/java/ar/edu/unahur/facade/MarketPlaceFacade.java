package ar.edu.unahur.facade;

import ar.edu.unahur.facade.Stocks.StockLibros;
import ar.edu.unahur.facade.tarjetas_de_credito.TarjetaDeCredito;
import ar.edu.unahur.facade.tiposDePago.PagoEfectivo;
import ar.edu.unahur.facade.tiposDePago.PagoTarjeta;
import ar.edu.unahur.facade.tiposDePago.TipoDePago;
import ar.edu.unahur.facade.tiposDePago.cuotas.Cuota;
import ar.edu.unahur.facade.tipos_de_entrega.EntregaFactory;
import ar.edu.unahur.facade.tipos_de_entrega.TipoDeEntrega;

import java.time.LocalDate;
import java.util.List;

public class MarketPlaceFacade {
  private StockLibros stockLibros;
  private TarjetaDeCredito tarjeta;
  private CarritoDeCompras carrito;
  private TipoDePago tipoDePago;
  private TipoDeEntrega tipoDeEntrega;
  private PrecioTotal precioTotal;

  public MarketPlaceFacade(StockLibros stockLibros,
                           CarritoDeCompras carrito) {
    this.stockLibros = stockLibros;

    this.carrito = carrito;
  }

  public void cargarStock() {
    stockLibros.cargarLibros();
  }

  public void cargarDatosTarjeta(String NOMBRE_DUENIO, String COMPANIA, String ID, String KEY, LocalDate DATE) {
    tarjeta = new TarjetaDeCredito(NOMBRE_DUENIO, COMPANIA, ID, KEY, DATE);
  }

  public void pagoEnEfectivo() {
    this.tipoDePago = new PagoEfectivo();
  }

  public void pagoConTarjeta(Cuota cuotas) {
    tipoDePago = new PagoTarjeta(cuotas);
  }

  public void acordarTipoDeEntrega(String tipoEntrega) {
    this.tipoDeEntrega = EntregaFactory.getTipoEntrega(tipoEntrega);
  }

  public void cargarProducto(int numeroProducto) {
    carrito.agregarProducto(stockLibros.getLibro(numeroProducto));
  }

  public void mostrarPorRangoDePrecios(Double precioMin, Double precioMax){
    Filtro.MostrarPorRangoDePrecios(stockLibros.getStockLibros(),precioMin, precioMax);
  }

  public void mostrarPorGenero() {
    Filtro.MostrarPorGenero(stockLibros.getStockLibros());
  }

  public Double getTotal() {
      precioTotal = new PrecioTotal(carrito,tipoDeEntrega,tipoDePago);
      return precioTotal.precioFinal();
  }


}
