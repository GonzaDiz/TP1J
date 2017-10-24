package unitTests;

import org.junit.Assert;
import org.junit.Test;

import src.Envio;

public class EnvioTest {
	
	
	@Test
	public void testModificarPrecioBonificadoDevuelveElPrecioSinModificar() {
		Envio envio = new Envio();
		Assert.assertEquals(6000, envio.modificarPrecio(6000),0);
	}
	
	@Test
	public void testModificarPrecio4999Devuelve5099() {
		Envio envio = new Envio();
		Assert.assertEquals(5099, envio.modificarPrecio(4999),0);
	}

}
