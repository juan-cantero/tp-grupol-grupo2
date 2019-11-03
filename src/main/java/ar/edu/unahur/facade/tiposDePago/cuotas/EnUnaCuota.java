package ar.edu.unahur.facade.tiposDePago.cuotas;

public class EnUnaCuota implements Cuotable {

  @Override
  public int numeroDeCuotas() {
    return 1;
  }

  @Override
  public Double interes() {
    return 1.10;
  }
}
