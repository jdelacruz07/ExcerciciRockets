package com.example.java;

import static org.junit.Assert.*;

import org.junit.Test;

public class PropulsorTest {

	@Test
	public void test() {
		Propulsor propulsor = new Propulsor();
		int accelerationMax = 50;
		int accelerationInit = 60;
		int aceleration = propulsor.aceelerate(accelerationMax, accelerationInit);
		assertEquals("Aceleracion Maxima", accelerationMax, aceleration);
	}

	@Test
	public void braketest() {
		Propulsor propulsor = new Propulsor();
		int powerMax = 0;
		int powerActual = propulsor.brake(powerMax);
		assertEquals(0, powerActual);
	}
	
	
}
