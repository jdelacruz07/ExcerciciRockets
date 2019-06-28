
public class Propulsor {
	int powerPropulsor;
	
	public void aceelerate(int powerMax) {
		int power = 0;
		while (power >= 0 && power <= powerMax) {
			if (power >= 0 && power <= powerMax  ){
				power +=10;
				System.out.println("Potencia actual " + power);
			} else {
				System.out.println("no more power ....... no power" + powerMax );
			}
		
		}
		System.out.println("no more power ..........." + powerMax  );

	}
	
	public void brake(int powerNow) {
		int power = 10;
		while ( powerNow > 0 ) {
			if (powerNow >= 10 ){
				powerNow = powerNow - 10;
				System.out.println("Potencia actual " + powerNow);
			} else {
				System.out.println("ha llegado a la potencia minima  ???????????????" + powerNow );
			}
			
		}
		System.out.println("potencia minima   ???????????????" + powerNow  );
		
	}
}
