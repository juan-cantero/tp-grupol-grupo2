package ar.edu.unahur.facade.tiposDePago;

public class PagoEfectivo implements TipoDePago {

  @Override
  public Double Total(Double subtotal) {
    return subtotal + 0.0;
  }
}
