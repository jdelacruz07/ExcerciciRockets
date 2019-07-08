import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static ArrayList<Integer> velocityBackup = new ArrayList();
	static ArrayList<Integer> velocityBackup2 = new ArrayList();
	static ArrayList<Integer> velocityBackup3 = new ArrayList();
	static ArrayList<Integer> velocityBackup4 = new ArrayList();
	static ArrayList<Integer> velocityBackup5 = new ArrayList();
	static ArrayList<Integer> velocityBackup6 = new ArrayList();

	static ArrayList<Integer> velocityBackupTotal  = new ArrayList();
	static ArrayList<Integer> velocityBackupTotal2 = new ArrayList();
	static int times;
	static Scanner sc = new Scanner(System.in);
	static int[] power1 = { 10, 30, 80 };
	static int[] power2 = { 30, 40, 50, 50, 30, 10 };

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Rocket rocket = new Rocket();
		ArrayList<Rocket> rockets = new ArrayList<>();
		velocityBackupTotal.add(0);
		velocityBackupTotal.add(0);
		velocityBackupTotal.add(0);
		velocityBackupTotal2.add(0);
		velocityBackupTotal2.add(0);
		velocityBackupTotal2.add(0);
		velocityBackupTotal2.add(0);
		velocityBackupTotal2.add(0);
		velocityBackupTotal2.add(0);
		
		String idRocket = "32WESSDS";
		int numberPropulsor = 3;
		int idPropulsor = 123456789;
		if (rocket.verifyIdRocket(idRocket) == true)
			rockets.addAll(doRocket(idRocket, numberPropulsor));
		else {
			System.out.println("La longitud es incorrecta ");
		}

		idRocket = "LDSFJA32";
		numberPropulsor = 6;
		idPropulsor = 987654321;
		if (rocket.verifyIdRocket(idRocket) == true)
			rockets.addAll(doRocket(idRocket, numberPropulsor));
		else {
			System.out.println("La longitud es incorrecta ");
		}

		System.out.println(rockets.size());

		rocket = rockets.get(0);
		showdata(rocket, power1);

		rocket = rockets.get(1);
		showdata(rocket, power2);

		int selection = 0;
		do {
			System.out.println("1) Acelerar Rocket One ");
			System.out.println("2) Acelerar Rocket Two ");
			System.out.println("3) Desacelerar Rocket One ");
			System.out.println("4) Salir ");
			selection = sc.nextInt();
			switch (selection) {
			case 1:
				accelerateRocketOne();
				break;
			case 2:
				accelerateRocketTwo();
				break;
			case 3:
				brakeRocketOne();
				break;
			case 4:
				break;

			default:
				break;
			}
		} while (selection != 4);

	}

	private static void brakeRocketOne() {
		// TODO Auto-generated method stub
		Propulsor propulsor = new Propulsor();
		System.out.println("Entrada Rocket 1 --> " + velocityBackupTotal);
		System.out.println("Cuantas veces quieres desacelerar?");
		times = sc.nextInt();

		ArrayList<Integer> velocityBackup2 = new ArrayList<>();
		velocityBackup.clear();
		velocityBackup.addAll(velocityBackupTotal);

		for (int i = 0; i < times; i++) {
			for (int powerMax : velocityBackup) {
				int powerActually = propulsor.brake(powerMax);
				velocityBackup2.add(powerActually);
			}
			velocityBackup.clear();
			velocityBackup.addAll(velocityBackup2);
			velocityBackup2.clear();
		}

		velocityBackupTotal.clear();
		velocityBackupTotal.addAll(velocityBackup);
		System.out.println("Salida de desaceleracion " + velocityBackup);
	}

	private static void accelerateRocketOne() throws InterruptedException {
		// TODO Auto-generated method stub
		Propulsor propulsor = new Propulsor();
		System.out.println("Entrada Rocket1 --> "+ velocityBackupTotal);
		System.out.println("Cuantas veces quieres acelerar Rocket One? ");
		times = sc.nextInt();
		System.out.println("errrroooooooooooorr" + velocityBackupTotal);
		(new Thread(new HelloRunnable())).start();
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				// perform some work inside the thread
				velocityBackup = Propulsor.timesAccelerate(power1[0], times, velocityBackupTotal.get(0));
				System.out.println("Hello from " + Thread.currentThread().getName() + " NOT USING LAMBDA");
			} 
		};
		Runnable r2 = new Runnable() {
			@Override
			public void run() {
				// perform some work inside the thread
				velocityBackup2 = Propulsor.timesAccelerate(power1[1], times, velocityBackupTotal.get(1));
				System.out.println("Hello from " + Thread.currentThread().getName() + " NOT USING LAMBDA");
			}
		};
		Runnable r3 = new Runnable() {
			@Override
			public void run() {
				// perform some work inside the thread
				velocityBackup3 = Propulsor.timesAccelerate(power1[2], times, velocityBackupTotal.get(2));
				System.out.println("Hello from " + Thread.currentThread().getName() + " NOT USING LAMBDA");
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
		velocityBackupTotal.addAll(velocityBackup);
		velocityBackupTotal.addAll(velocityBackup2);
		velocityBackupTotal.addAll(velocityBackup3);

		System.out.println("Salida --> Rocket 1 " + velocityBackupTotal);
	}

	private static void accelerateRocketTwo() throws InterruptedException {
		// TODO Auto-generated method stub
		Propulsor propulsor = new Propulsor();
		System.out.println("Entrada Rocket2 --> "+ velocityBackupTotal2);
		System.out.println("Cuantas veces quieres acelerar Rocket two?");
		times = sc.nextInt();

		(new Thread(new HelloRunnable())).start();
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				// perform some work inside the thread
				velocityBackup = Propulsor.timesAccelerate(power2[0], times, velocityBackupTotal2.get(0));
				System.out.println("Hello from " + Thread.currentThread().getName() + " NOT USING LAMBDA");
			}
		};
		Runnable r2 = new Runnable() {
			@Override
			public void run() {
				// perform some work inside the thread
				velocityBackup2 = Propulsor.timesAccelerate(power2[1], times, velocityBackupTotal2.get(1));
				System.out.println("Hello from " + Thread.currentThread().getName() + " NOT USING LAMBDA");
			}
		};
		Runnable r3 = new Runnable() {
			@Override
			public void run() {
				// perform some work inside the thread
				velocityBackup3 = Propulsor.timesAccelerate(power2[2], times, velocityBackupTotal2.get(2));
				System.out.println("Hello from " + Thread.currentThread().getName() + " NOT USING LAMBDA");
			}
		};
		Runnable r4 = new Runnable() {
			@Override
			public void run() {
				// perform some work inside the thread
				velocityBackup4 = Propulsor.timesAccelerate(power2[3], times, velocityBackupTotal2.get(3));
				System.out.println("Hello from " + Thread.currentThread().getName() + " NOT USING LAMBDA");
			}
		};
		Runnable r5 = new Runnable() {
			@Override
			public void run() {
				// perform some work inside the thread
				velocityBackup5 = Propulsor.timesAccelerate(power2[4], times, velocityBackupTotal2.get(4));
				System.out.println("Hello from " + Thread.currentThread().getName() + " NOT USING LAMBDA");
			}
		};
		Runnable r6 = new Runnable() {
			@Override
			public void run() {
				// perform some work inside the thread
				velocityBackup6 = Propulsor.timesAccelerate(power2[5], times, velocityBackupTotal2.get(5));
				System.out.println("Hello from " + Thread.currentThread().getName() + " NOT USING LAMBDA");
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

		Thread.sleep(2000);

		velocityBackupTotal.clear();
		velocityBackupTotal2.addAll(velocityBackup);
		velocityBackupTotal2.addAll(velocityBackup2);
		velocityBackupTotal2.addAll(velocityBackup3);
		velocityBackupTotal2.addAll(velocityBackup4);
		velocityBackupTotal2.addAll(velocityBackup5);
		velocityBackupTotal2.addAll(velocityBackup6);

		System.out.println("Salida --> Rocket 2 " + velocityBackupTotal2);
	}

	public static ArrayList<Rocket> doRocket(String idRocket, int numberPropulsor) {
		Rocket rocket = new Rocket(idRocket, numberPropulsor);
		ArrayList<Rocket> rockets = new ArrayList<>();
		rockets.add(rocket);
		return rockets;
	}

	public static void showdata(Rocket rocket, int[] power) {
		Rocket rocketzero = new Rocket();

		System.out.print(rocket.idRocket + " " + rocket.numberPropulsor + " ");
		for (int i : power) {
			System.out.print(i);
			System.out.print(" ");
		}

		System.out.println(" ");

	}
}
