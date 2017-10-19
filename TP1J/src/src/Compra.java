package src;

import java.util.ArrayList;

public class Compra {
	
	private ArrayList<Producto> productosAComprar;
	private double precioTotal;
	
	public Compra() {
		this.productosAComprar = new ArrayList<Producto>();
		this.precioTotal = 0;
	}

	public static Compra crearNuevaCompra() {
		Compra compra = new Compra();
		return compra;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

}
