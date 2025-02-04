package com.endes.figuras;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PuntoTest {
	Punto punto;
	Punto punto2;
	@BeforeEach
	void setUp() throws Exception {
		System.out.println("@BeforeEach");
		punto = new Punto(5.5, 10);
		punto2= new Punto(10, 35);
		
	}

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
