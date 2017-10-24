package src;

import excepciones.PrecioDeProductoNegativoError;

public class Producto {
	private String nombre;
	private double precio;
	
	public Producto(String nombre, double precio) {
		if (precio < 0) throw new PrecioDeProductoNegativoError();
		
		this.precio = precio;
		this.nombre = nombre;
	}
	
	public Object getNombre() {
		return nombre;
	}

	public double getPrecio() {
		return precio;
	}

}
