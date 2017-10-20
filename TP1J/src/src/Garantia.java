package src;

public class Garantia extends Servicio {

	@Override
	double modificarPrecio(double precio) {
		return (precio*1.1);
	}

}
