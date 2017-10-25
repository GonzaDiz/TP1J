package unitTests;

import org.junit.Assert;
import org.junit.Test;

import excepciones.PrecioDeProductoNegativoError;
import src.Producto;

public class ProductoTest {
	
	@Test
	public void testCrearUnProductoNoDevuelveNull() {
		Producto producto = new Producto("Nombre Producto", 5.99);
		Assert.assertNotNull(producto);
	}
	
	@Test(expected = PrecioDeProductoNegativoError.class)
	public void testCrearUnProductoConPrecioNegativoLanzaPrecioDeProductoNegativoError() {
		new Producto("Mouse Sentey",-4);
	}

}
