abstract class Vehicle{
    abstract void start();

    void fule(){
        System.out.println("Vehicle start with fuel");
    }
}

class car extends Vehicle{

    @Override
    void start(){
        System.out.println("Vehicle starts with key");
    }

    }

public class Abstract{

    public static void main(String[] args) {

        car c = new car();
        c.start();
        
    }
}