class A extends Thread{
	public void run(){
				System.out.print(Thread.currentThread().getName());
				System.out.print(Thread.currentThread().getPriority());
	}
}

public class ThreadPriority {
    public static void main(String[] args) {

        A t1 = new A();
        A t2 = new A();
        A t3 = new A();

        // set thread names
        t1.setName("Yash");
        t2.setName("Raj");
        t3.setName("Swayam");

        // set thread priorities
        t1.setPriority(5);
        t2.setPriority(10);
        t3.setPriority(8);

        // start threads
        t1.start();
        t2.start();
        t3.start();
    }
}


