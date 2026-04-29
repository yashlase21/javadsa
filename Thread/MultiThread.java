class Thread1 extends Thread{

    public void run(){
        int i = 1;
        while(true) {
        System.out.println("Thread 1 is running 1111 " +i);
        i++;
    }
   }
    
}

class Thread2 extends Thread{
    public void run(){
        int i = 1;
        while(true) {
            System.out.println("Thread 2 is running 2222 "+i);
            i++;
        }
    }
}

public class MultiThread{
    public static void main(String[] args) {
        Thread1 t = new Thread1();
        Thread2 g = new Thread2();

        t.start();
        g.start();

    }
}