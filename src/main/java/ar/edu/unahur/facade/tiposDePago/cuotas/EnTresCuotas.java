package ar.edu.unahur.facade.tiposDePago.cuotas;

public class EnTresCuotas implements Cuotable {
  @Override
  public int numeroDeCuotas() {
    return 3;
  }

  @Override
  public Double interes() {
    return 1.25;
  }
}
