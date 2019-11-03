package ar.edu.unahur.facade.tipos_de_entrega;


public class EntregaADomicilio implements TipoDeEntrega {

  @Override
  public Double costoAdicional() {
    return 100.00;
  }
}
