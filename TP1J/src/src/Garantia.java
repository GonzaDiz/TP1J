package src;

public class Garantia implements Servicio {

	@Override
	public double modificarPrecio(double precio) {
		return (precio*(1.0 + 10.0/100.0));
	}

}
