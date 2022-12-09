package com.generation.PruebasUnitaria;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculadoraTests {
	
	Calculadora calc =new Calculadora(true);
	@Test
	@DisplayName("Metodo que prueba si la suma es correcta")
	void pruebaSuma() {
		//Calculadora calc = new Calculadora(true);
		calc.suma(2, 2);
		
		assertEquals(4,calc.suma(2, 2));
	}
	
	@Test
	@DisplayName("Probar si la calculadora esta encendida")
	void pruebaIsOn() {
		//Calculadora calc =new Calculadora(true);
		
		assertTrue(calc.isOn());
	}
	
	@Test
	@DisplayName("Prueba de division")
	void pruebaDiv() {
		assertEquals(2.5, calc.division(5, 2));
	}
}
