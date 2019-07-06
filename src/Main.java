import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

	static ArrayList<Integer> velocityBackup;
	static int times;

	public static void main(String[] args) throws InterruptedException {
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

		System.out.println("//////                   ACELERA                    ///////////");

		Propulsor propulsor = new Propulsor();
		System.out.println("Cuantas veces quieres acelerar?");
		times = sc.nextInt();

		(new Thread(new HelloRunnable())).start();
		Runnable r1 = new Runnable()
        {
            @Override
            public void run()
            {
                //perform some work inside the thread
                System.out.println("Hello from "+
                        Thread.currentThread().getName()
                        + " NOT USING LAMBDA");
                velocityBackup = Propulsor.timesAccelerate(power1, times);
                System.out.println("Salida --> 1 " + velocityBackup);
            }
        };

        Thread t1 = new Thread(r1, "Thread t1");
        t1.start();
        
        Thread.sleep(1000);
        
		System.out.println("///////                  FRENA                       ////////////////////////////");

		System.out.println("Entrada " + velocityBackup);
		System.out.println("Cuantas veces quieres desacelerar?");
		times = sc.nextInt();

		ArrayList<Integer> velocityBackup2 = new ArrayList<>();

		for (int i = 0; i < times; i++) {
			for (int powerMax : velocityBackup) {
				int powerActually = propulsor.brake(powerMax);
				velocityBackup2.add(powerActually);
			}
			System.out.println("Salida " + velocityBackup2);
			velocityBackup.clear();
			velocityBackup.addAll(velocityBackup2);
			velocityBackup2.clear();
		}

		float velocidad = (float) Math.sqrt(10 + 30 + 80);
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

		System.out.print(rocket.idRocket + " " + rocket.numberPropulsor + " ");
		for (int i : power) {
			System.out.print(i);
			System.out.print(" ");
		}

		System.out.println(" ");

	}
}
