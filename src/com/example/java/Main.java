package com.example.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws InterruptedException {
		int[] power1 = { 10, 30, 80 };
		int[] power2 = { 30, 40, 50, 50, 30, 10 };
		Rocket rocket = new Rocket();
		Propulsor propulsor = new Propulsor();
		List<Rocket> rockets = new ArrayList<>();
		String idRocket = "32WESSDS";
		int numberPropulsor = 3;
		informationRocket(rocket, rockets, idRocket, numberPropulsor);

		idRocket = "LDSFJA32";
		numberPropulsor = 6;
		informationRocket(rocket, rockets, idRocket, numberPropulsor);

		System.out.println("Numero de cohetes: " + rockets.size());
		rocket = rockets.get(0);
		rocket.showdata(rocket, power1);
		rocket = rockets.get(1);
		rocket.showdata(rocket, power2);
		
		selectionMenu(propulsor);
	}

	private static void informationRocket(Rocket rocket, List<Rocket> rockets, String idRocket,
			int numberPropulsor) {
		if (rocket.verifyIdRocket(idRocket) == true)
			rockets.addAll(rocket.doRocket(idRocket, numberPropulsor));
		else {
			System.out.println("La longitud es incorrecta ");
		}
	}

	private static void selectionMenu(Propulsor propulsor) throws InterruptedException {
		int selection;
		do {
			System.out.println("1) Acelera Rocket One ");
			System.out.println("2) Acelera Rocket Two ");
			System.out.println("3) Frena Rocket One ");
			System.out.println("4) Salir ");
			selection = sc.nextInt();
			switch (selection) {
			case 1:
				propulsor.acelerateRocketOne();
				break;
			case 2:
				propulsor.acelerateRocketTwo();
				break;
			case 3:
				propulsor.brakeRocket();
				break;
			default:
				break;
			}
		} while (selection != 4);
	}
	

}
