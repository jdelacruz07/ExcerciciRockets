
public class Propulsor {
	int powerPropulsor;
	
	public int aceelerate(int powerMax, int powerReal) {
		powerPropulsor = powerReal;
//		while (powerPropulsor >= 0 && powerPropulsor < powerMax) {
			if (powerPropulsor >= 0 && powerPropulsor <= powerMax ){
		//		powerPropulsor = powerPropulsor + 10; 
				System.out.println("Potencia actual " + powerPropulsor);
				powerPropulsor = powerReal;
				
			} else {
				System.out.println("no more power ....... no power" + powerMax );
				powerPropulsor = powerMax;
			}
//		}
//		System.out.println("no more power ..........." + powerMax  );
		
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
