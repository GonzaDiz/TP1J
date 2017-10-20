package src;

public class Envio extends Servicio {
	Int costoEnvio = 100;
	public int modificarPrecio(int precio) {
		if (precio > 5000) return precio;
		return (precio+100);
	}
}
