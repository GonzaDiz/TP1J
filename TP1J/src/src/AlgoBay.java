package src;


public class AlgoBay {
	
	private Catalogo catalogo;

	public AlgoBay() {
		this.catalogo = new Catalogo();
	}

	public int getCantidadDeProductos() {
		return catalogo.getCantidadDeProductos();
	}

	public Producto agregarProductoConPrecio(String nombre, double precio) {
		return catalogo.agregarProductoConPrecio(nombre,precio);
	}

	public Producto getProducto(String nombre) {
		return catalogo.getProducto(nombre);
	}

	public void agregarProductoEnCompra(Producto producto, Compra compra) {
		compra.agregarProducto(producto);
		
	}

	public Compra crearNuevaCompra() {
		return Compra.crearNuevaCompra();
	}

	public double getPrecioTotalDe(Compra compra) {
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

	public Cupon crearCuponConPorcentaje(int porcentaje) {
		Cupon cupon = new Cupon(porcentaje);
		return cupon;
	}

	public void agregarCuponEnCompra(Cupon cupon, Compra compra) {
		compra.agregarCupon(cupon);
	}


}
