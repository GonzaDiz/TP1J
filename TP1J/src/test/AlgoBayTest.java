package test;

import org.junit.Assert;
import org.junit.Test;

import src.AlgoBay;
import src.Compra;
import src.Producto;

public class AlgoBayTest {
	
	@Test
	public void testCrearAlgoBay() {
		AlgoBay algoBay = new AlgoBay();
		Assert.assertNotNull(algoBay);
	}
	
	@Test
	public void testGetCantidadDeProductosDeAlgoBaySinProductosDevuelve0() {
		Object cantidadProductos;
		AlgoBay algoBay = new AlgoBay();
		cantidadProductos =  algoBay.getCantidadDeProductos();
		Assert.assertEquals(0, cantidadProductos);
	}
	
	@Test
	public void testGetCantidadDeProductosDeAlgoBayConUnProductoDevuelve1(){
		Object cantidadProductos;
		AlgoBay algoBay = new AlgoBay();
		algoBay.agregarProductoConPrecio("Spinner Verde", 100);
		cantidadProductos = algoBay.getCantidadDeProductos();
		Assert.assertEquals(1,cantidadProductos);
	}
	
	@Test
	public void testGetCantidadDeProductosDeAlgoBayCondosProductosDevuelve2() {
		Object cantidadProductos;
		AlgoBay algoBay = new AlgoBay();
		algoBay.agregarProductoConPrecio("Spinner Azul", 105);
		algoBay.agregarProductoConPrecio("Max Steel", 300);
		cantidadProductos = algoBay.getCantidadDeProductos();
		Assert.assertEquals(2, cantidadProductos);
	}
	
	@Test 
	public void testGetProductoAPartirDelNombreVictorinoxDevuelveProductoConNombreVictorinox() {
		Producto producto;
		AlgoBay algoBay = new AlgoBay();
		algoBay.agregarProductoConPrecio("Victorinox", 600);
		producto = algoBay.getProducto("Victorinox");
		Assert.assertEquals("Victorinox", producto.getNombre());
	}
	
	@Test
	public void testCrearCompraNoEsNull() {
		Compra compra;
		AlgoBay algoBay = new AlgoBay();
		compra = algoBay.crearNuevaCompra();
		Assert.assertNotNull(compra);
	}
	
	@Test
	public void testGetPrecioTotalDeUnaNuevaCompraEs0() {
		AlgoBay algoBay = new AlgoBay();
		Compra compra = algoBay.crearNuevaCompra();
		Assert.assertEquals(0, algoBay.getPrecioTotalDe(compra));
	}
	
	@Test 
	public void testGetPrecioTotalDeUnaNuevaCompraConUnProductoDe100PesosDevuelve100Pesos() {
		AlgoBay algoBay = new AlgoBay();
		Producto producto = algoBay.agregarProductoConPrecio("Spinner Azul", 100);
		Compra compra = algoBay.crearNuevaCompra();
		compra.agregarProductoEnCompra(producto);
		Assert.assertEquals(100, algoBay.getPrecioTotalDe(compra));
	}
	

}
