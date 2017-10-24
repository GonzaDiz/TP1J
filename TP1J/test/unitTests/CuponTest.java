package unitTests;

import org.junit.Assert;
import org.junit.Test;

import excepciones.PorcentajeInvalidoError;
import src.Cupon;

public class CuponTest {
	
	@Test
	public void testModificarPrecio100PorSinCuponDevuelve100() {
		Cupon sinCupon = new Cupon();
		Assert.assertEquals(100.0, sinCupon.modificarPrecio(100.0), 0);
	}
	
	@Test
	public void testModificarPrecioPrecio50PorCuponDe10PorcientoDevuelve45() {
		Cupon conCupon = new Cupon(10);
		Assert.assertEquals(45, conCupon.modificarPrecio(50),0);
		
	}
	
	@Test(expected = PorcentajeInvalidoError.class)
	public void testCrearUnCuponConPorcentajeNegativoLanzaLaExcepcionPorcentajeInvalidoError() {
		Cupon cupon = new Cupon(-40);
	}
	
	@Test(expected = PorcentajeInvalidoError.class)
	public void testCrearUnCuponConPorcentajeMayorA100LanzaPorcentajeInvalidoError(){
		Cupon cupon = new Cupon(110);
	}

}
