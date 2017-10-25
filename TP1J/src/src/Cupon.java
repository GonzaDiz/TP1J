package src;

import excepciones.PorcentajeInvalidoError;

public  class Cupon {
	
	private int porcentajeDescuento;
	
	public Cupon() {
		this.porcentajeDescuento = 0;
	}
	
	public Cupon (int porcentaje) {
		if (porcentaje < 0 || porcentaje > 100) throw new PorcentajeInvalidoError();
		this.porcentajeDescuento = porcentaje;
	}
	
	public double modificarPrecio(double precioTotal) {
		return (precioTotal * (1 - (porcentajeDescuento/100.0)));
	}

	public int getPorcentajeDescuento() {
		return porcentajeDescuento;
	}

}
