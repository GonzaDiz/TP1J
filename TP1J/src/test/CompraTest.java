package test;

import org.junit.Test;
import org.junit.Assert;

import src.Compra;
import src.Producto;

public class CompraTest {
	
	private static final double DELTA = 1e-15;
	
	@Test
	public void testGetPrecioTotalDeUnaCompraConEnvioYUnProductoDe100PesosDevuelve200() {
		Compra compraConEnvio = Compra.crearNuevaCompraConEnvio();
		Producto producto = new Producto("Toner HP 1020",100);
		compraConEnvio.agregarProductoEnCompra(producto);
		Assert.assertEquals(200, compraConEnvio.getPrecioTotal(),DELTA);
	}
	
	@Test
	public void testGetPrecioTotalDeUnaCompraConGarantiaYUnProductoDe200PesosDevuelve220() {
		Compra compraConGarantia = Compra.crearNuevaCompraConGarantia();
		Producto producto = new Producto("Toner CE505",200);
		compraConGarantia.agregarProductoEnCompra(producto);
		Assert.assertEquals(200*1.1, compraConGarantia.getPrecioTotal(),DELTA);
	}

}
