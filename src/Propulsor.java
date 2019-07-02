import java.util.ArrayList;

public class Propulsor {
	static int powerPropulsor;
	
	public static void timesAccelerate(int[] power, int times) {
		
		ArrayList<Integer> velocity = new ArrayList<>();
		int powerReal = 10 ;
		times = 10 * (times);
		while (powerReal <= times) {
			for (int powerMax : power) {
				System.out.println("Primer cohete acelera hasta "+ powerMax);
				int powerCount = aceelerate(powerMax, powerReal);
				velocity.add(powerCount);
				System.out.println("Potencia Actual  ......" + velocity);
			}
			
			Rocket.giveVelocity (velocity);
			
			velocity.clear();
			powerReal = powerReal + 10;
			
		}
		
	}
	
	
	
	
	public static int aceelerate(int powerMax, int powerReal) {
		powerPropulsor = powerReal;
			if (powerPropulsor >= 0 && powerPropulsor <= powerMax ){
				System.out.println("Potencia actual " + powerPropulsor);
				powerPropulsor = powerReal;
				
			} else {
				System.out.println("no more power ....... no power" + powerMax );
				powerPropulsor = powerMax;
			}
		
		return powerPropulsor;

	}
	
	public int brake(int powerMax) {
		powerPropulsor = powerMax;
		while ( powerPropulsor >= 10 ) {
			if (powerPropulsor >= 10 ){
				powerPropulsor = powerPropulsor - 10;
		//		System.out.println("Potencia actual " + powerPropulsor);
			} else {
		//		System.out.println("ha llegado a la potencia minima  ???????????????" + powerPropulsor );
			}
			
		}
		System.out.println("potencia minima   ???????????????" + powerPropulsor  );
		return powerPropulsor;
		
	}
}
