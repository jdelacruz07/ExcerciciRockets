package com.example.java;

import java.util.ArrayList;
import java.util.List;

public class Rocket {
	String idRocket;
	int numberPropulsor;

	public Rocket() {
		super();
	}

	public Rocket(String Rocket, int numberPropulsor) {
		this.idRocket = Rocket;
		this.numberPropulsor = numberPropulsor;
	}

	public boolean verifyIdRocket(String idRocket) {
		boolean isCorrect = false;
		int countDigit = 0;
		countDigit = idRocket.length();
		if (countDigit == 8) {
			isCorrect = true;
		} else {
			isCorrect = false;
		}
		return isCorrect;
	}

	public List<Rocket> doRocket(String idRocket, int numberPropulsor) {
		Rocket rocket = new Rocket(idRocket, numberPropulsor);
		List<Rocket> rockets = new ArrayList<>();
		rockets.add(rocket);
		return rockets;
	}

	public void showdata(Rocket rocket, int[] power) {
		System.out.print(rocket.idRocket + " " + rocket.numberPropulsor + " ");
		for (int i : power) {
			System.out.print(i);
			System.out.print(" ");
		}
		System.out.println(" ");
	}
	
	public float giveVelocity(List<Integer> velocity) {
		int power = 0;
		float powerActually2 = 0;
		for (int i : velocity) {
			power = power + i;
			powerActually2 = (float) Math.sqrt(power) * 100;
		}
		System.out.println("Velocidad xxxxxxxxxxxxxxxxxx " + powerActually2);
		return powerActually2;
	}

}
