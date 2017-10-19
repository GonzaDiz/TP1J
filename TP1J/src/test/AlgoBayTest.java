package test;

import org.junit.Assert;
import org.junit.Test;

import src.AlgoBay;
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
	public void testGetProductoAPartirDelNombreVictorinoxDevuelveElProductoVictorinox() {
		Object producto;
		Producto victorinox = new Producto("Victorinox", 599.99);
		AlgoBay algoBay = new AlgoBay();
		algoBay.agregarProductoConPrecio("Victorinox", 599.99);
		producto = algoBay.getProducto("Victorinox");
		Assert.assertEquals(victorinox, producto);
	}
	

}
