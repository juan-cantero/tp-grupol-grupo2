package ar.edu.unahur.facade.tarjetas_de_credito;

import java.time.LocalDate;

public class TarjetaDeCredito {

  private final String NOMBRE_DUENIO;
  private final String COMPANIA;
  private final String ID;
  private final String KEY;
  private final LocalDate DATE;


  public TarjetaDeCredito(String NOMBRE_DUENIO, String COMPANIA, String ID, String KEY, LocalDate DATE) {
    this.NOMBRE_DUENIO = NOMBRE_DUENIO;
    this.COMPANIA = COMPANIA;
    this.ID = ID;
    this.KEY = KEY;
    this.DATE = DATE;
  }

  public String getID() {
    return ID;
  }

  public String getKEY() {
    return KEY.substring(KEY.length()-3, KEY.length());
  }

  public LocalDate getDATE() {
    return DATE;
  }
}
