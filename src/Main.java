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
		
		System.out.println("/////////////////////////////////////////////////////////////////////////////////");

		Propulsor propulsor = new Propulsor();
		int powerLength = power1.length;
		System.out.println("Tamaño del arreglo de la potencia es "+ powerLength);
		System.out.println("Cuantas veces quieres acelerar?");
		
		
		ArrayList<Integer> velocity = new ArrayList<>();
		int powerReal = 0 ;
		int timesAccelerate = sc.nextInt();
		timesAccelerate = 10 * (timesAccelerate-1);
		while (powerReal <= timesAccelerate) {
			for (int powerMax : power1) {
				System.out.println("Primer cohete acelera hasta "+ powerMax);
				int powerCount =	propulsor.aceelerate(powerMax, powerReal);
				velocity.add(powerCount);
				System.out.println("Velocidad  ......" + velocity);
			}
			int power = 0 ;
			float powerActually2 = 0;
			for (int i : velocity) {
				power = power + i;
				powerActually2 = (float)  Math.sqrt(power);
			} 
			System.out.println("Velocidad xxxxxxxxxxxxxxxxxx " + powerActually2 );
			velocity.clear();
			powerReal = powerReal + 10;
			
		}
		System.out.println("/////////////////////////////////////////////////////////////////////////////////");
		 
		for (int powerMax : power1) {
			System.out.println("Primer cohete desacelera desde "+ powerMax);
			int powerActually = propulsor.brake(powerMax);
			System.out.println("Potencia Actual " + powerActually);
		}

		float velocidad = (float) Math.sqrt(10+30+80);
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
		
		System.out.print(rocket.idRocket + " "+ rocket.numberPropulsor +  " " );
		for (int i : power) {
			System.out.print(i);
			System.out.print(" ");
		}
		
		System.out.println(" ");


	

		
	
		
	}
}
