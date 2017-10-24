package unitTests;



import org.junit.Assert;
import org.junit.Test;

import src.Compra;
import src.ConCupon;
import src.Cupon;
import src.Producto;

public class CompraTest {
	
	private static final double DELTA = 1e-15;
	
	@Test
	public void testCrearCompraNoEsNull() {
		Compra compra = Compra.crearNuevaCompra();
		Assert.assertNotNull(compra);
	}
	
	@Test
	public void testCrearCompraConEnvioNoEsNull() {
		Compra compraConEnvio = Compra.crearNuevaCompraConEnvio();
		Assert.assertNotNull(compraConEnvio);
	}
	
	@Test
	public void testCrearCompraConGarantiaNoEsNull() {
		Compra compraConGarantia = Compra.crearNuevaCompraConGarantia();
		Assert.assertNotNull(compraConGarantia);
	}
	
	@Test
	public void testCrearCompraConGarantiaYEnvioNoEsNull() {
		Compra compraConGarantiaYenvio = Compra.crearNuevaCompraConEnvioYGarantia();
		Assert.assertNotNull(compraConGarantiaYenvio);
	}
	
	@Test
	public void testGetPrecioTotalDeUnaCompraConUnProductoDe499Devuelve499() {
		Compra compra = Compra.crearNuevaCompra();
		Producto producto = new Producto("Resma A4 300g", 499);
		compra.agregarProducto(producto);
		Assert.assertEquals(499, compra.getPrecioTotal(),DELTA);
	}
	
	@Test
	public void testGetPrecioTotalDeUnaCompraConEnvioYUnProductoDe100PesosDevuelve200() {
		Compra compraConEnvio = Compra.crearNuevaCompraConEnvio();
		Producto producto = new Producto("Toner HP 1020",100);
		compraConEnvio.agregarProducto(producto);
		Assert.assertEquals(200, compraConEnvio.getPrecioTotal(),DELTA);
	}
	
	@Test
	public void testGetPrecioTotalDeUnaCompraConGarantiaYUnProductoDe200PesosDevuelve220() {
		Compra compraConGarantia = Compra.crearNuevaCompraConGarantia();
		Producto producto = new Producto("Toner CE505",200);
		compraConGarantia.agregarProducto(producto);
		Assert.assertEquals(200*1.1, compraConGarantia.getPrecioTotal(),DELTA);
	}
	
	@Test
	public void testGetPrecioTotalDeUnaCompraConGarantiaUnCuponDe10PorcientoSobreUnProductoDe100Devuelve99() {
		
		Compra compraConGarantia = Compra.crearNuevaCompraConGarantia();
		Producto producto = new Producto("Pack Resaltadores",100);
		Cupon cupon = new ConCupon(10);
		compraConGarantia.agregarCupon(cupon);
		compraConGarantia.agregarProducto(producto);
		Assert.assertEquals((100*1.1)*0.9, compraConGarantia.getPrecioTotal(),DELTA);
	}
	
	@Test
	public void testGetPrecioTotalDeUnaCompraConUnProductoDe1000YUnCuponDe40PorCientoDevuelve600() {
		Compra compra = Compra.crearNuevaCompra();
		Producto producto = new Producto("Fuente",1000);
		Cupon cupon = new ConCupon(40);
		compra.agregarCupon(cupon);
		compra.agregarProducto(producto);
		Assert.assertEquals(1000*0.6, compra.getPrecioTotal(),DELTA);
	}
	
	@Test
	public void testGetPrecioTotalDeUnaCompraDe400ConEnvioDevuelve500() {
		Compra compraConEnvio = Compra.crearNuevaCompraConEnvio();
		Producto producto = new Producto("Teclado logitech",200);
		Producto producto2 = new Producto("Cuaderno",200);
		compraConEnvio.agregarProducto(producto2);
		compraConEnvio.agregarProducto(producto);
		Assert.assertEquals(400+100, compraConEnvio.getPrecioTotal(),DELTA);
	}
	
	@Test
	public void testGetPrecioTotalDeUnaCompraConEnvioGarantiaYCuponDe20() {
		Compra compraConEnvioYGarantia = Compra.crearNuevaCompraConEnvioYGarantia();
		Producto producto = new Producto("Resma A4", 499.43);
		compraConEnvioYGarantia.agregarProducto(producto);
		Cupon cupon = new ConCupon(20);
		compraConEnvioYGarantia.agregarCupon(cupon);
		Assert.assertEquals((499.43*1.1+100)*0.8, compraConEnvioYGarantia.getPrecioTotal(),DELTA);
		
	}
	
	@Test
	public void testGetPrecioTotalDeUnaCompraConEnvioMayorA5000BonificaElEnvio() {
		Compra compraConEnvio = Compra.crearNuevaCompraConEnvio();
		Producto producto = new Producto ("Laptop DELL I7", 18999.99);
		compraConEnvio.agregarProducto(producto);
		Assert.assertEquals(18999.99,compraConEnvio.getPrecioTotal(),DELTA);
	}
	

}
