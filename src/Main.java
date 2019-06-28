import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		showdata(rockets);

	
	}

	public static ArrayList<Rocket> doRocket(String idRocket, int numberPropulsor) {
		Rocket rocket = new Rocket(idRocket, numberPropulsor);
		ArrayList<Rocket> rockets = new ArrayList<>();
		rockets.add(rocket);
		return rockets;
	}
	
	public static void showdata(ArrayList<Rocket> rockets) {
		Rocket rocketzero = new Rocket();
		Propulsor propulsor = new Propulsor();
		int[] power1 = { 10, 30, 80 };
		int[] power2 = { 30, 40, 50, 50, 30, 10 };
//		int powerMax1 = 0;
//		int powerMax2 = 0;
//		
//		for (int i = 0; i < power1.length; i++) {
//			if (powerMax1 >= power1[i]) {
//			} else {
//				powerMax1 = power1[i];
//			}
//					
//		}
//		
//		for (int i = 0; i < power2.length; i++) {
//			if (powerMax2 >= power2[i]) {
//			} else {
//				powerMax2 = power2[i];
//			}
//			
//		}
//		System.out.println("potetncia maxima" + powerMax1);
//		System.out.println("potetncia maxima" + powerMax2);
		
		rocketzero = rockets.get(0);
		System.out.print(rocketzero.idRocket + " "+ rocketzero.numberPropulsor+  " " );
		for (int i : power1) {
			System.out.print(i);
			System.out.print(" ");
		}
//		System.out.println(powerMax1);
		System.out.println(" ");
		
		rocketzero = rockets.get(1);
		System.out.print(rocketzero.idRocket + " "+ rocketzero.numberPropulsor+ "  " );
		for (int i : power2) {
			System.out.print(i);
			System.out.print(" ");
		}
		System.out.println(" ");

		for (int i : power1) {
			System.out.println("Primer cohete acelera hasta "+ i);
			propulsor.aceelerate(i);
		}

		for (int i : power2) {
			System.out.println("Segundo cohete acelera hasta "+ i);
			propulsor.aceelerate(i);
		}

		System.out.println("///////////////////////////////////////////////////////////////");
		for (int i : power1) {
			System.out.println("Primer cohete acelera hasta "+ i);
			propulsor.brake(i);
		}
		
		for (int i : power2) {
			System.out.println("Segundo cohete acelera hasta "+ i);
			propulsor.brake(i);
		}

		
	}
}
