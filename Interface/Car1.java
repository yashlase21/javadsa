interface Engine{
	void start();
}

interface Music{
	void playMusic();
}

class Car implements Engine,Music{
	public void start(){
		System.out.println("Engine is Starting");
	}
	public void playMusic(){
		System.out.println("Music is Starting");
	}
}

public class Car1{
	public static void main(String[] args) {
		Car c = new Car();
		c.playMusic();
		c.start();
	}
}