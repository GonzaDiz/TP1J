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

	public void agregarProductoEnCompra(Producto productoZapatillaNike, Compra compraConEnvioYGarantia) {
		// TODO Auto-generated method stub
		
	}

	public Compra crearNuevaCompra() {
		return Compra.crearNuevaCompra();
	}

	public double getPrecioTotalDe(Compra compra) {
		return compra.getPrecioTotal();
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
