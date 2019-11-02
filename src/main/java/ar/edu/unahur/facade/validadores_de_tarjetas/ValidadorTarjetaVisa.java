package ar.edu.unahur.facade.validadores_de_tarjetas;

import ar.edu.unahur.facade.tarjetas_de_credito.Visa;

import java.time.LocalDate;

public class ValidadorTarjetaVisa {

  private Visa tarjeta;
  private String ultimosTresDigitos;

  public ValidadorTarjetaVisa(Visa tarjeta) {
    this.tarjeta = tarjeta;
    this.ultimosTresDigitos = "";
  }

  public void ingresarUltimosTresDigitos(int ultimosTresDigitos) {
    this.ultimosTresDigitos = String.valueOf(ultimosTresDigitos);
  }

  public String getUltimosTresDigitos() {
    return ultimosTresDigitos;
  }

  public Boolean esFechaValida() {
    return tarjeta.getDATE().isAfter(LocalDate.now());
  }

  public boolean esClaveValida() {
    return tarjeta.getKEY().equals(getUltimosTresDigitos());
  }

  public boolean esTarjetaValida() {
    return esFechaValida() && esClaveValida();
  }

  public void LimpiarClave() {
    this.ultimosTresDigitos = "";
  }
}
