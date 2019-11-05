package ar.edu.unahur.facade.tipos_de_entrega;

public class EntregaFactory {

  public static TipoDeEntrega getTipoEntrega(String tipoEntrega) {

    if (tipoEntrega.equalsIgnoreCase("sucursal")) {
      return new RetiraSucursal();
    }
    else if (tipoEntrega.equalsIgnoreCase("domicilio")) {
      return new EntregaADomicilio();
    }
    return null;
  }

}
