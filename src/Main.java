import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Rocket rocket = new Rocket();
		ArrayList<Rocket> rockets = new ArrayList<>();

		String idRocket = "32WESSDS";
		int numberPropulsor = 3;
		int idPropulsor = 123456789;
		int[] power1 = { 10, 30, 80 };
		if (rocket.verifyIdRocket(idRocket) == true)
			rockets.addAll(doRocket(idRocket, numberPropulsor));
		else {
			System.out.println("La longitud es incorrecta ");
		}

		idRocket = "LDSFJA32";
		numberPropulsor = 6;
		idPropulsor = 987654321;
		int[] power2 = { 30, 40, 50, 50, 30, 10 };
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

		System.out.println("//////                   ACELERA                    ///////////");

		Propulsor propulsor = new Propulsor();
		System.out.println("Cuantas veces quieres acelerar?");
		int times = sc.nextInt();

		ArrayList<Integer> velocityBackup = Propulsor.timesAccelerate(power1, times);
		ArrayList<Integer> velocityBackup2 = new ArrayList<>();
		ArrayList<Integer> velocityBackup3 = new ArrayList<>();
		ArrayList<Integer> velocityBackup4 = new ArrayList<>();

		System.out.println("///////                  FRENA                       ////////////////////////////");
		
		System.out.println(velocityBackup);
		for (int powerMax : velocityBackup) {
			System.out.println("Primer cohete desacelera desde " + powerMax);
			int powerActually = propulsor.brake(powerMax);
			velocityBackup2.add(powerActually);
		//	System.out.println("Potencia Actual " + powerActually);
			System.out.println("Backuop22222222222 " + velocityBackup2);
		}
		
		System.out.println("Backuop22222222222 " + velocityBackup2);
		for (int powerMax : velocityBackup2) {
			System.out.println("Primer cohete desacelera desde " + powerMax);
			int powerActually = propulsor.brake(powerMax);
			velocityBackup3.add(powerActually);
		//	System.out.println("Potencia Actual " + powerActually);
			System.out.println(velocityBackup3);
		}
		for (int powerMax : velocityBackup3) {
			System.out.println("Primer cohete desacelera desde " + powerMax);
			int powerActually = propulsor.brake(powerMax);
			velocityBackup4.add(powerActually);
		//	System.out.println("Potencia Actual " + powerActually);
			System.out.println(velocityBackup4);
		}
		
		

		float velocidad = (float) Math.sqrt(10 + 30 + 80);
		System.out.println(velocidad);

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
