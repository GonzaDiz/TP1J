package src;

import java.util.ArrayList;

public class Compra {
	
	private ArrayList<Producto> productosAComprar;
	private double precioTotal;
	private ArrayList<Servicio> servicios;
	private Cupon cupon;
	
	public Compra() {
		this.productosAComprar = new ArrayList<Producto>();
		this.precioTotal = 0;
		this.servicios = new ArrayList<Servicio>();
		this.cupon = new Cupon();
	}

	public static Compra crearNuevaCompra() {
		Compra compra = new Compra();
		return compra;
	}

	public double getPrecioTotal() {
		for (Servicio s : servicios ) {
			precioTotal = s.modificarPrecio(precioTotal);
		}
		precioTotal = cupon.modificarPrecio(precioTotal);
		return precioTotal;
	}

	public void agregarProducto(Producto producto) {
		productosAComprar.add(producto);
		precioTotal = precioTotal + producto.getPrecio();
	}

	public static Compra crearNuevaCompraConEnvio() {
		Compra compra = new Compra();
		compra.agregarEnvio();
		return compra;
	}

	private void agregarEnvio() {
		Envio envio = new Envio();
		servicios.add(envio);
	}

	public static Compra crearNuevaCompraConGarantia() {
		Compra compra = new Compra();
		compra.agregarGarantia();
		return compra;
	}

	private void agregarGarantia() {
		Garantia garantia = new Garantia();
		servicios.add(garantia);
	}

	public static Compra crearNuevaCompraConEnvioYGarantia() {
		Compra compra = new Compra();
		compra.agregarGarantia();
		compra.agregarEnvio();
		return compra;
	}

	public void agregarCupon(Cupon cupon) {
		if (this.cupon.getPorcentajeDescuento() < cupon.getPorcentajeDescuento()) {
			this.cupon = cupon;
		}
	}

}
