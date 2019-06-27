
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
	
	public boolean verifyIdRocket (String idRocket) {
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
