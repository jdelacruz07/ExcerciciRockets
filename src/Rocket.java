import java.util.ArrayList;

public class Rocket {

	String idRocket;
	int numberPropulsor;

	public Rocket(String Rocket, int numberPropulsor) {
		// TODO Auto-generated constructor stub
		this.idRocket = Rocket;
		this.numberPropulsor = numberPropulsor;
	}

	public Rocket() {
		// TODO Auto-generated constructor stub
	}

	public static float giveVelocity(ArrayList<Integer> velocity) {

		int power = 0;
		float powerActually2 = 0;
		for (int i : velocity) {
			power = power + i;
			powerActually2 = (float) Math.sqrt(power);
		}
		System.out.println("Velocidad xxxxxxxxxxxxxxxxxx " + powerActually2);
		return powerActually2;

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

}
