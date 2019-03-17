package Ejercicio_Productos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoTests {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCalcular() {
		Producto s1= new Producto("Lentejas",1.50);
		double suPrecio;
		suPrecio=s1.Calcular(2);
		assertEquals(suPrecio,3);
	}
	
}
