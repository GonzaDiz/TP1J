package unitTests;
import org.junit.Assert;
import org.junit.Test;

import src.Garantia;

public class GarantiaTest {

	@Test
	public void testModificarPrecio100Devuelve110() {
		Garantia garantia = new Garantia();
		Assert.assertEquals(100*1.1, garantia.modificarPrecio(100),0);
	}
	
	@Test 
	public void testmodificarPrecio4999Devuelve4999MasEl10Porciento() {
		Garantia garantia = new Garantia();
		Assert.assertEquals(4999*1.1,garantia.modificarPrecio(4999),0);
	}
}
