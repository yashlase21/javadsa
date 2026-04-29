// 2. The Driver class containing the main method
public class CarsDriver {
    public static void main(String[] args) {
        // Create the object (ClassName objectName = new ClassName())
        Car a = new Car(); 
        
        // Assign values
        a.price = 350000;
        a.speed = 150;
        a.name = "SUV";
        a.color = "RED";
        a.number = "MH44522";

        // Call the method
        a.displayCars();
    }
}