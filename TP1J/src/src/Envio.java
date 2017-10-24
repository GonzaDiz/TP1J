package src;

public class Envio implements Servicio {

	public double modificarPrecio(double precio) {
		if (precio > 5000) return precio;
		return (precio+100);
	}
}
