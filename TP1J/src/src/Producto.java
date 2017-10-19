package src;


public class Producto {
	private String nombre;
	private int precio;
	
	public Producto(String nombre, int precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	public Object getNombre() {
		return nombre;
	}

	public int getPrecio() {
		return precio;
	}

}
