package ar.edu.unahur.facade.tipos_de_entrega;

public class Entrega implements TipoDeEntrega{

  private TipoDeEntrega tipoDeEntrega;

  public void setTipoDeEntrega(TipoDeEntrega tipoDeEntrega) {
    this.tipoDeEntrega = tipoDeEntrega;
  }

  @Override
  public Double costoAdicional() {
    return tipoDeEntrega.costoAdicional();
  }

}
