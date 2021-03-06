package src;

import java.util.ArrayList;

import excepciones.ProductoInexistenteError;

public class Catalogo {
	
	private ArrayList<Producto> productos;
	
	public Catalogo() {
		this.productos = new ArrayList<Producto>();
	}

	public Producto agregarProductoConPrecio(String nombre,double precio) {
		Producto producto = new Producto(nombre,precio);
		productos.add(producto);
		return producto;
	}

	public int getCantidadDeProductos() {
		return productos.size();
	}

	public Producto getProducto(String nombre)  {

			for (Producto p : productos) {
				if(nombre.equals(p.getNombre())) {
					return p;
				}
			}	
			throw new ProductoInexistenteError();
	}

}
