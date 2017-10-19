package src;


public class AlgoBay {
	
	private int cantidadDeProductos;

	public AlgoBay() {
		this.cantidadDeProductos = 0;
	}

	public Object getCantidadDeProductos() {
		return cantidadDeProductos;
	}

	public Producto agregarProductoConPrecio(String nombre, double precio) {
		this.cantidadDeProductos++;
		return null;
	}

	public Producto getProducto(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	public void agregarProductoEnCompra(Producto productoZapatillaNike, Compra compraConEnvioYGarantia) {
		// TODO Auto-generated method stub
		
	}

	public Compra crearNuevaCompra() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getPrecioTotalDe(Compra compra) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Compra crearNuevaCompraConEnvio() {
		// TODO Auto-generated method stub
		return null;
	}

	public Compra crearNuevaCompraConGarantia() {
		// TODO Auto-generated method stub
		return null;
	}

	public Compra crearNuevaCompraConEnvioYGarantia() {
		// TODO Auto-generated method stub
		return null;
	}

	public Cupon crearCuponConPorcentaje(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public void agregarCuponEnCompra(Cupon cupon20Porciento, Compra compraConEnvio) {
		// TODO Auto-generated method stub
		
	}


}
