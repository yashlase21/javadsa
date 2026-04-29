

class Mobile {
    private String brand ="Samsung";
    private boolean powerOn = false;

    class Battery {
        void turnOn(){
            if (!powerOn) {
                powerOn = true;
                System.out.println(brand + "Power is on");
            }else{
                System.out.println("Power is of");
            }
        }

        void trunOff(){
            if (powerOn) {
                powerOn = false;
                System.out.println(brand + "Power is off");
                
            }else{
                System.out.println(brand + "Power is off");
            }
        }

    }

}

public class InnerClass{
     public static void main(String[] args){
        Mobile m = new Mobile();

        Mobile.Battery b = m.new Battery();
        b.turnOn();
        b.trunOff();
        
    }

}
   