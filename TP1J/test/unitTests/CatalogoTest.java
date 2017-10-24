package unitTests;



import org.junit.Test;

import excepciones.NombreDeProductoErroneo;
import src.Catalogo;

public class CatalogoTest {
	
	@Test(expected = NombreDeProductoErroneo.class)
	public void testGetProductoDeUnProductoInexistenteLanzaUnaExcepcion() throws NombreDeProductoErroneo{
		Catalogo catalogo = new Catalogo();
		catalogo.agregarProductoConPrecio("Telefono G5",7000);
		catalogo.getProducto("Telefono G3");
	}

}
