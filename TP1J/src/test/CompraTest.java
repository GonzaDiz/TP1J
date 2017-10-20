package test;

import org.junit.Test;
import org.junit.Assert;

import src.Compra;
import src.Producto;

public class CompraTest {
	
	@Test
	public void testGetPrecioTotalDeUnaCompraConEnvioYUnProductoDe100PesosDevuelve200() {
		Compra compraConEnvio = Compra.crearNuevaCompraConEnvio();
		Producto producto = new Producto("Toner HP 1020",100);
		compraConEnvio.agregarProductoEnCompra(producto);
		Assert.assertEquals(200, compraConEnvio.getPrecioTotal());
	}
	
	@Test
	public void testGetPrecioTotalDeUnaCompraConGarantiaYUnProductoDe200PesosDevuelve220() {
		Compra compraConGarantia = Compra.crearNuevaCompraConGarantia();
		Producto producto = new Producto("Toner CE505",200);
		compraConGarantia.agregarProductoEnCompra(producto);
		Assert.assertEquals(220, compraConGarantia.getPrecioTotal());
	}

}
