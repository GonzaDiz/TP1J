package src;

import excepciones.PorcentajeInvalidoError;

public class ConCupon extends Cupon {

	public ConCupon(int porcentaje) {
		if (porcentaje < 0 || porcentaje > 100) throw new PorcentajeInvalidoError();
		this.porcentajeDescuento = porcentaje;
	}

	@Override
	public double modificarPrecio(double precioTotal) {
		return (precioTotal * (1 - (porcentajeDescuento/100.0)));
	}
	

}
