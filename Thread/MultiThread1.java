class Thread1 extends Thread{
	public void run(){
		for (int i =1 ;i<=10 ;i++ ) {
			System.out.println("GOOD MOrnig Oggy");
		}
	}
}
class Thread2 extends Thread{
	public void run(){
		for (int i =1 ;i<=10 ;i++ ) {
			System.out.println("MOrnig!! Motu");
		}
	}
}
public class MultiThread1{
    public static void main(String[] args) {
        Thread1 t = new Thread1();
        Thread2 g = new Thread2();

        t.start();
        g.start();

    }
}
