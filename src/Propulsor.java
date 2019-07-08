import java.util.ArrayList;

public class Propulsor {
	static int powerPropulsor;

	public static ArrayList<Integer> timesAccelerate(int powerMax, int times, int powerReal) {

		ArrayList<Integer> velocity = new ArrayList<>();
		int powerPropulsorTimes = 0;
		for (int i = 0; i < times; i++) {
			powerPropulsorTimes = aceelerate(powerMax, powerReal);
			powerReal = powerPropulsorTimes;
		}

		velocity.add(powerPropulsorTimes);
		Rocket.giveVelocity(velocity);

		return velocity;

	}

	public static int aceelerate(int powerMax, int powerReal) {
		powerPropulsor = powerReal;
		if (powerPropulsor >= 0 && powerPropulsor < powerMax) {
			powerPropulsor = powerReal + 10;

		} else {
//			System.out.println("no more power ....... no power" + powerMax);
			powerPropulsor = powerMax;
		}

		return powerPropulsor;

	}

	public int brake(int powerMax) {
		if (powerMax >= 10) {
			powerPropulsor = powerMax - 10;
//			System.out.println("Potencia actual " + powerPropulsor);
		} else {
//			System.out.println("ha llegado a la potencia minima ???????????????" + powerPropulsor);
			powerPropulsor = 0;
		}

		return powerPropulsor;

	}
}
