import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String idRocket1 = "32WESSDS";
		int idPropulsor1 = 123456789;
		int propulsor1 = 3;
		ingresaDatos(idRocket1, idPropulsor1, propulsor1);

		String idRocket2 = "LDSFJA32";
		int idPropulsor2 = 987654321;
		int propulsor2 = 6;
		ingresaDatos(idRocket2, idPropulsor2, propulsor2);

		
//		System.out.println();
//		System.out.println("Propulsor 1 " + rocket.idPropulsor + " No propulsores " + rocket.propulsor);
		

	}

	static ArrayList ingresaDatos(String idRocket, int idPropulsor, int propulsor) {
		int countDigit = 0;
		
		do {
//			System.out.println("Dame el nombre del propulsor \n Debe contener 8 caracteres");
//			Scanner sc = new Scanner(System.in);
//			idRocket1 = sc.next();
			countDigit = idRocket.length();
			System.out.println(countDigit);
		} while (countDigit != 8);
		Rocket rocket = new Rocket(idRocket, idPropulsor, propulsor);
		System.out.println("Id rocket " + " " + rocket.idRocket);
		System.out.println("Propulsor 1 " + rocket.idPropulsor + " No propulsores " + rocket.propulsor);
		ArrayList<Rocket> list = new ArrayList<>();
		list.add(rocket);
		System.out.println(list);
		return list;
	}

}
