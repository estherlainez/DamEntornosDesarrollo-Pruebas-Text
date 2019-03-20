package CuentaCorriente;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CuentaCorrienteTests {

	@Test
	void testNuevaCuenta() {
		CuentaCorriente miCuenta = new CuentaCorriente("Esther","44455566G");
		assertEquals (miCuenta.getSaldo(),0.00);
	}
	@Test
	void testIngreso() {
		CuentaCorriente cuenta= new CuentaCorriente("Marcos","11222333S");
		cuenta.ingresarDinero(200);
		assertEquals(cuenta.getSaldo(),200);
	}
	
	@Test
	void testSacarDinero() {
		CuentaCorriente cuenta= new CuentaCorriente("Marcos","11222333S");
		cuenta.ingresarDinero(1000);
		cuenta.sacarDinero(200);
		assertEquals(cuenta.getSaldo(),800);
	}

}
