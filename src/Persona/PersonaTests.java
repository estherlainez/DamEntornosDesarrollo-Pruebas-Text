package Persona;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class PersonaTests {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testMayorEdad() {
		Persona p1= new Persona("Pepe",25,'H',60,1.70);
		int edad=p1.getEdad();
		assertEquals(p1.mayorEdad(edad),true);
	}
	
	void testSexo() {
		Persona p1= new Persona("Maria",25,'M',60,1.70);
		char sexo=p1.getSexo();
		assertEquals(p1.comprobarSexo(sexo),false);
	}
	
	void testImc() {
		Persona p1= new Persona("Pepe",25,'H',60,1.70);
		double peso=p1.getPeso();
		double altura=p1.getAltura();
		assertEquals(p1.calcularIMC(peso, altura),20.76);
	}
	
		
	
}
