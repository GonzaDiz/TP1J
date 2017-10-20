package src;

public class Garantia extends Servicio {

	@Override
	int modificarPrecio(int precio) {
		return (precio*1.1);
	}

}
