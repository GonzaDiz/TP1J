package src;

public class ConCupon extends Cupon {

	public ConCupon(int porcentaje) {
		this.porcentajeDescuento = porcentaje;
	}

	@Override
	double modificarPrecio(double precioTotal) {
		return (precioTotal * (1 - (porcentajeDescuento/100.0)));
	}
	

}
