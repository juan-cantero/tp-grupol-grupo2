package ar.edu.unahur.facade.tiposDePago;

import ar.edu.unahur.facade.tiposDePago.cuotas.Cuotable;

public  class PagoTarjeta implements TipoDePago {
  private Cuotable cuotable;

  public void setCuotable(Cuotable tipoCuotable) {
    cuotable = tipoCuotable;
  }

  @Override
  public Double Total(Double subtotal) {
    return subtotal * interes();
  }

  public  Double interes() {
    return cuotable.interes();
  };

  public int cuotas() {
    return cuotable.numeroDeCuotas();
  };
}
