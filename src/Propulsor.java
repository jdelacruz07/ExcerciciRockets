import java.util.ArrayList;

public class Propulsor {
	static int powerPropulsor;

	public static ArrayList<Integer> timesAccelerate(int powerMax, int times, int powerReal) {

		ArrayList<Integer> velocity = new ArrayList<>();
		ArrayList<Integer> velocityBackup = new ArrayList<>();
		for (int i = 0; i < times; i++) {
			powerReal = accelerate(powerMax, powerReal);
			Rocket.giveVelocity(velocity);
			System.out.println("whattt                2 " + powerPropulsor);
		}
		velocity.add(powerReal);
		

		return velocity;

	}

	public static int accelerate(int powerMax, int powerReal) {
		powerPropulsor = powerReal;
		if (powerPropulsor >= 0 && powerPropulsor < powerMax) {
			powerPropulsor = powerReal + 10;

		} else {
			System.out.println("no more power ....... no power" + powerMax);
			powerPropulsor = powerMax;
		}

		return powerPropulsor;

	}

	public int brake(int powerMax) {
		if (powerMax >= 10) {
			powerPropulsor = powerMax - 10;
//				 System.out.println("Potencia actual " + powerPropulsor);
		} else {
//				 System.out.println("ha llegado a la potencia minima ???????????????" + powerPropulsor );
			powerPropulsor = 0;
		}

		return powerPropulsor;

	}
}
