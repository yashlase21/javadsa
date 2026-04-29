interface Vehical{
			void start();
}

class Bmw implements Vehical{
			public void start(){
				System.out.println("Bmw is starting");
			}
}

public class Car{
	public static void main(String[] args) {
		Bmw b = new Bmw();

		b.start();
	}
}