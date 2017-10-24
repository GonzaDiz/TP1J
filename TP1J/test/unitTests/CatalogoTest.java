package unitTests;



import org.junit.Assert;
import org.junit.Test;

import excepciones.NombreDeProductoError;
import excepciones.PrecioDeProductoNegativoError;
import src.Catalogo;
import src.Producto;

public class CatalogoTest {
	
	@Test 
	public void testAgregarProducctoConPrecioNoDevuelveNull() {
		Catalogo catalogo = new Catalogo();
		Producto producto = catalogo.agregarProductoConPrecio("SSD Kingstong 120GB", 2500);
		Assert.assertNotNull(producto);
	}
	
	@Test(expected = NombreDeProductoError.class)
	public void testGetProductoDeUnProductoInexistenteLanzaUnaExcepcion() throws NombreDeProductoError{
		Catalogo catalogo = new Catalogo();
		catalogo.agregarProductoConPrecio("Telefono G5",7000);
		catalogo.getProducto("Telefono G3");
	}
	
	@Test
	public void testGetCantidadDeProductosDeUnCatalogoCon3ProductosDevuelve3() {
		Catalogo catalogo = new Catalogo();
		catalogo.agregarProductoConPrecio("Impresora Epson", 3000);
		catalogo.agregarProductoConPrecio("Monitor LG 22", 3100);
		catalogo.agregarProductoConPrecio("GT 1030 2GB", 1499.99);
		Assert.assertEquals(3, catalogo.getCantidadDeProductos());
	}

	@Test
	public void testGetProductoConNombreLapiceraDevuelveLapicera() {
		Catalogo catalogo = new Catalogo();
		catalogo.agregarProductoConPrecio("Lapicera", 5);
		Producto producto = catalogo.getProducto("Lapicera");
		Assert.assertEquals("Lapicera", producto.getNombre());
	}
	
	@Test
	public void testGetProductoConPrecio5DevuelveUnProductoConPrecio5() {
		Catalogo catalogo = new Catalogo();
		catalogo.agregarProductoConPrecio("Lapicera", 5);
		Producto producto = catalogo.getProducto("Lapicera");
		Assert.assertEquals(5, producto.getPrecio(),0);
	}
	
	@Test(expected = PrecioDeProductoNegativoError.class)
	public void testAgregarProductoConPrecioNegativoLanzaExcepcionPrecioDeProductoNegativoError() {
		Catalogo catalogo = new Catalogo();
		catalogo.agregarProductoConPrecio("Billetera Rip Curl", -40);
	}
}
