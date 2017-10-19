package src;


public class AlgoBay {
	
	private Catalogo catalogo;

	public AlgoBay() {
		this.catalogo = new Catalogo();
	}

	public int getCantidadDeProductos() {
		return catalogo.getCantidadDeProductos();
	}

	public Producto agregarProductoConPrecio(String nombre, int precio) {
		return catalogo.agregarProductoConPrecio(nombre,precio);
	}

	public Producto getProducto(String nombre) {
		return catalogo.getProducto(nombre);
	}

	public void agregarProductoEnCompra(Producto producto, Compra compra) {
		compra.agregarProductoEnCompra(producto);
		
	}

	public Compra crearNuevaCompra() {
		return Compra.crearNuevaCompra();
	}

	public int getPrecioTotalDe(Compra compra) {
		return compra.getPrecioTotal();
	}

	public Compra crearNuevaCompraConEnvio() {
		return Compra.crearNuevaCompraConEnvio();
	}

	public Compra crearNuevaCompraConGarantia() {
		return Compra.crearNuevaCompraConGarantia();
	}

	public Compra crearNuevaCompraConEnvioYGarantia() {
		return Compra.crearNuevaCompraConEnvioYGarantia();
	}

	public Cupon crearCuponConPorcentaje(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public void agregarCuponEnCompra(Cupon cupon20Porciento, Compra compraConEnvio) {
		// TODO Auto-generated method stub
		
	}


}
