import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Rocket> list = new ArrayList<>();
		
		String idRocket = "32WESSDS";
		int numberPropulsor = 3;
		int idPropulsor = 123456789;
		list.add(ingresaDatos(idRocket, numberPropulsor));

		idRocket = "LDSFJA32";
		numberPropulsor = 6;
		idPropulsor = 987654321;
		list.add(ingresaDatos(idRocket, numberPropulsor));

		
//		System.out.println(list.size());
		
		for (Rocket rocket : list) {
			System.out.println(rocket.idRocket + " " + rocket.numberPropulsor);
		};

	}

	static Rocket ingresaDatos(String idRocket, int numberPropulsor) {
		int countDigit = 0;
		
		do {
//			System.out.println("Dame el nombre del propulsor \n Debe contener 8 caracteres");
//			Scanner sc = new Scanner(System.in);
//			idRocket1 = sc.next();
			countDigit = idRocket.length();
//			System.out.println(countDigit);
		} while (countDigit != 8);
		Rocket rocket = new Rocket(idRocket, numberPropulsor);
		return rocket;
	}

}
