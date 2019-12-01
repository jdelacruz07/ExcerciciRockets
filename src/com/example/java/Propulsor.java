package com.example.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Propulsor {
	static int powerPropulsor;
	static Scanner sc = new Scanner(System.in);
	
	static List<Integer> velocityBackup;
	static List<Integer> velocityBackup2;
	static List<Integer> velocityBackup3;
	static List<Integer> velocityBackup4;
	static List<Integer> velocityBackup5;
	static List<Integer> velocityBackup6;
	static List<Integer> velocityBackupTotal = new ArrayList() {{ add(0); add(0); add(0); }};
	static List<Integer> velocityBackupTotal2 = new ArrayList() {{ add(0); add(0); add(0); add(0); add(0); add(0);	}};
	static int[] power1 = { 10, 30, 80 };
	static int[] power2 = { 30, 40, 50, 50, 30, 10 };
	static int times;
	static int powerMax1;
	static int powerMax2;
	static int powerMax3;
	
	public void acelerateRocketOne() throws InterruptedException {
		Rocket rocket = new Rocket();
		Propulsor propulsor = new Propulsor();
		System.out.println("//////                   ACELERA                    ///////////");
		System.out.println("Cohete --> 1 " + velocityBackupTotal);
		System.out.println("Cuantas veces quieres acelerar?");
		times = sc.nextInt();
		(new Thread(new HelloRunnable())).start();
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				velocityBackup = propulsor.timesAccelerate(power1[0], times, velocityBackupTotal.get(0));
				System.out.println("Salida --> 1 " + velocityBackup);
			}
		};
		Runnable r2 = new Runnable() {
			@Override
			public void run() {
				velocityBackup2 = propulsor.timesAccelerate(power1[1], times, velocityBackupTotal.get(1));
				System.out.println("Salida --> 2 " + velocityBackup2);
			}
		};
		Runnable r3 = new Runnable() {
			@Override
			public void run() {
				velocityBackup3 = propulsor.timesAccelerate(power1[2], times, velocityBackupTotal.get(2));
				System.out.println("Salida --> 3 " + velocityBackup3);
			}
		};
		Thread t1 = new Thread(r1, "Thread t1");
		Thread t2 = new Thread(r2, "Thread t2");
		Thread t3 = new Thread(r3, "Thread t3");
		t1.start();
		t2.start();
		t3.start();
		Thread.sleep(1000);
		velocityBackupTotal.clear();
		velocityBackupTotal.add(velocityBackup.get(0));
		velocityBackupTotal.add(velocityBackup2.get(0));
		velocityBackupTotal.add(velocityBackup3.get(0));
		System.out.println("Salida Rocket One " + velocityBackupTotal);
		System.out.println("Salida Velocidad Rocket 1 --> " + rocket.giveVelocity(velocityBackupTotal));
	}

	public void acelerateRocketTwo() throws InterruptedException {
		Rocket rocket = new Rocket();
		Propulsor propulsor = new Propulsor();
		System.out.println("//////                   ACELERA                    ///////////");
		System.out.println("Cohete --> 2 " + velocityBackupTotal2);
		System.out.println("Cuantas veces quieres acelerar?");
		times = sc.nextInt();
		(new Thread(new HelloRunnable())).start();
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				velocityBackup = propulsor.timesAccelerate(power2[0], times, velocityBackupTotal2.get(0));
				System.out.println("Salida --> 1 " + velocityBackup);
			}
		};
		Runnable r2 = new Runnable() {
			@Override
			public void run() {
				velocityBackup2 = propulsor.timesAccelerate(power2[1], times, velocityBackupTotal2.get(1));
				System.out.println("Salida --> 2 " + velocityBackup);
			}
		};
		Runnable r3 = new Runnable() {
			@Override
			public void run() {
				velocityBackup3 = propulsor.timesAccelerate(power2[2], times, velocityBackupTotal2.get(2));
				System.out.println("Salida --> 3 " + velocityBackup);
			}
		};
		Runnable r4 = new Runnable() {
			@Override
			public void run() {
				velocityBackup4 = propulsor.timesAccelerate(power2[3], times, velocityBackupTotal2.get(3));
				System.out.println("Salida --> 1 " + velocityBackup);
			}
		};
		Runnable r5 = new Runnable() {
			@Override
			public void run() {
				velocityBackup5 = propulsor.timesAccelerate(power2[4], times, velocityBackupTotal2.get(4));
				System.out.println("Salida --> 2 " + velocityBackup);
			}
		};
		Runnable r6 = new Runnable() {
			@Override
			public void run() {
				velocityBackup6 = propulsor.timesAccelerate(power2[5], times, velocityBackupTotal2.get(5));
				System.out.println("Salida --> 3 " + velocityBackup);
			}
		};
		Thread t1 = new Thread(r1, "Thread t1");
		Thread t2 = new Thread(r2, "Thread t2");
		Thread t3 = new Thread(r3, "Thread t3");
		Thread t4 = new Thread(r4, "Thread t4");
		Thread t5 = new Thread(r5, "Thread t5");
		Thread t6 = new Thread(r6, "Thread t6");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		Thread.sleep(1000);
		velocityBackupTotal2.clear();
		velocityBackupTotal2.add(velocityBackup.get(0));
		velocityBackupTotal2.add(velocityBackup2.get(0));
		velocityBackupTotal2.add(velocityBackup3.get(0));
		velocityBackupTotal2.add(velocityBackup4.get(0));
		velocityBackupTotal2.add(velocityBackup5.get(0));
		velocityBackupTotal2.add(velocityBackup6.get(0));
		System.out.println("Salida Rocket 2 --> " + velocityBackupTotal2);
		System.out.println("Salida Velocidad Rocket 2 --> " + rocket.giveVelocity(velocityBackupTotal2));
	}

	public ArrayList<Integer> timesAccelerate(int powerMax, int times, int powerReal) {
		Rocket rocket = new Rocket();
		ArrayList<Integer> velocity = new ArrayList<>();
		int powerPropulsorTimes = 0;
		for (int i = 0; i < times; i++) {
			powerPropulsorTimes = aceelerate(powerMax, powerReal);
			powerReal = powerPropulsorTimes;
		}
		velocity.add(powerPropulsorTimes);
		rocket.giveVelocity(velocity);
		return velocity;
	}

	public void brakeRocket() throws InterruptedException {
		Rocket rocket = new Rocket();
		System.out.println("///////                  FRENA                       ////////////////////////////");
		Propulsor propulsor = new Propulsor();
		System.out.println("Entrada " + velocityBackupTotal);
		System.out.println("Cuantas veces quieres desacelerar?");
		times = sc.nextInt();
		powerMax1 = velocityBackupTotal.get(0);
		powerMax2 = velocityBackupTotal.get(1);
		powerMax3 = velocityBackupTotal.get(2);
		velocityBackupTotal.clear();
		(new Thread(new HelloRunnable())).start();
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				int powerActually = 0;
				for (int i = 0; i < times; i++) {
					powerActually = propulsor.brake(powerMax1);
					powerMax1 = powerActually;
				}
				velocityBackupTotal.add(powerActually);
				System.out.println("Salida desaceleracion 1 " + powerActually);
			}
		};
		Runnable r2 = new Runnable() {
			@Override
			public void run() {
				int powerActually = 0;
				for (int i = 0; i < times; i++) {
					powerActually = propulsor.brake(powerMax2);
					powerMax2 = powerActually;
				}
				velocityBackupTotal.add(powerActually);
				System.out.println("Salida desaceleracion 2 " + velocityBackupTotal);
			}
		};
		Runnable r3 = new Runnable() {
			@Override
			public void run() {
				int powerActually = 0;
				for (int i = 0; i < times; i++) {
					powerActually = propulsor.brake(powerMax3);
					powerMax3 = powerActually;
				}
				velocityBackupTotal.add(powerActually);
				System.out.println("Salida desaceleracion 3 " + velocityBackupTotal);
			}
		};
		Thread t1 = new Thread(r1, "Thread t1");
		Thread t2 = new Thread(r2, "Thread t2");
		Thread t3 = new Thread(r3, "Thread t3");
		t1.start();
		t2.start();
		t3.start();
		Thread.sleep(1000);
		System.out.println("Salida Rocket 1 --> " + velocityBackupTotal);
		System.out.println("Salida de desaceleracion Rocket 1 --> " + rocket.giveVelocity(velocityBackupTotal));
	}

	public int aceelerate(int powerMax, int powerReal) {
		powerPropulsor = powerReal;
		if (powerPropulsor >= 0 && powerPropulsor < powerMax) {
			powerPropulsor = powerReal + 10;
		} else {
			powerPropulsor = powerMax;
		}
		return powerPropulsor;
	}

	public int brake(int powerMax) {
		if (powerMax >= 10) {
			powerPropulsor = powerMax - 10;
		} else {
			powerPropulsor = 0;
		}
		return powerPropulsor;
	}

}
