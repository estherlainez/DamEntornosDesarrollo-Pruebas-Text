package Ejercicio_Productos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PerecederoTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCalcular() {
		Perecedero s1= new Perecedero("Carne",18.50, 2);
		double precioFinal;
		double suPrecio;
		suPrecio=s1.Calcular(1);
		assertEquals(suPrecio,6.166666666666667);
	}
	
	
}
