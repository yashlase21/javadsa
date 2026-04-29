class Thread1 implements Runnable {

    public void run() {

        int i = 0;

        while(i <= 5) {
            System.out.println("Runnable Thread11111 is Running " + i);
            i++;
        }

    }
}

class Thread2 implements Runnable {

    public void run() {

        int i = 0;

        while(i <= 5) {
            System.out.println("Runnable Thread2222 is Running " + i);
            i++;
        }

    }
}

public class RunnableExample {

    public static void main(String[] args) {

        Thread1 t = new Thread1();
        Thread t1 = new Thread(t);

        Thread2 r = new Thread2();
        Thread t2 = new Thread(r);

        t1.start();   // start thread 1
        t2.start();   // start thread 2

    }
}