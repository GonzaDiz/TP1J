package src;

import java.util.ArrayList;

public class Compra {
	
	private ArrayList<Producto> productosAComprar;
	private int precioTotal;
	
	public Compra() {
		this.productosAComprar = new ArrayList<Producto>();
		this.precioTotal = 0;
	}

	public static Compra crearNuevaCompra() {
		Compra compra = new Compra();
		return compra;
	}

	public int getPrecioTotal() {
		return precioTotal;
	}

	public void agregarProductoEnCompra(Producto producto) {
		productosAComprar.add(producto);
		precioTotal = precioTotal + producto.getPrecio();
	}

	public static Compra crearNuevaCompraConEnvio() {
		// TODO Auto-generated method stub
		return null;
	}

	public static Compra crearNuevaCompraConGarantia() {
		// TODO Auto-generated method stub
		return null;
	}

	public static Compra crearNuevaCompraConEnvioYGarantia() {
		// TODO Auto-generated method stub
		return null;
	}

}
