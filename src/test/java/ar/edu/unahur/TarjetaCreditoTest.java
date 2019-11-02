package ar.edu.unahur;

import ar.edu.unahur.facade.tarjetas_de_credito.Visa;
import ar.edu.unahur.facade.validadores_de_tarjetas.ValidadorTarjetaVisa;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.LocalDate;

public class TarjetaCreditoTest {
  Visa tarjeta;
  ValidadorTarjetaVisa validador;

  @BeforeTest
  public void setUp() {
    tarjeta =
            new Visa("jose perez",
                    "Visa", "22225555644564545","567890",
                    LocalDate.of(2022,11,03));
    validador = new ValidadorTarjetaVisa(tarjeta);
    validador.ingresarUltimosTresDigitos(890);

  }

  @Test
  public void esFechaValida() {
    Assert.assertTrue(validador.esFechaValida());
  }

  @Test
  public void esClaveValida() {
    Assert.assertTrue(validador.esClaveValida());

  }

  @Test
  public void esTarjetaValida() {
    Assert.assertTrue(validador.esTarjetaValida());
  }
}
