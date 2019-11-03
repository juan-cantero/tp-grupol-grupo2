package ar.edu.unahur.facade.tiposDePago.cuotas;

public class Cuota implements Cuotable {
  private Cuotable cuotable;

  public void setCuotable(Cuotable cuotable) {
    this.cuotable = cuotable;
  }

  @Override
  public int numeroDeCuotas() {
    return cuotable.numeroDeCuotas();
  }

  @Override
  public Double interes() {
    return cuotable.interes();
  }
}
