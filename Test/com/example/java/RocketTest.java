package com.example.java;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class RocketTest {

	@Test
	public void test() {
		Rocket rocket = new Rocket();
		boolean isCorrect = rocket.verifyIdRocket("fdf56565");
		assertEquals(true, isCorrect);
	}
	
	@Test
	public void test2() {
		Rocket rocket = new Rocket();
		String idRocket = "fdf56565";
		int numberPropulsor = 3; 
		List<Rocket> rocketList = new ArrayList<>();
		rocketList.addAll(rocket.doRocket(idRocket, numberPropulsor));
		rocketList.addAll(rocket.doRocket(idRocket, numberPropulsor));
		rocketList.addAll(rocket.doRocket(idRocket, numberPropulsor));
		rocketList.addAll(rocket.doRocket(idRocket, numberPropulsor));
		rocketList.addAll(rocket.doRocket(idRocket, numberPropulsor));
		int countRocket = rocketList.size();
		assertEquals(5, countRocket);
	}

}
