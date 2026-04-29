// 1. Define the Car class (Class names should be singular and capitalized)
class Car {
    // Attributes (Fields)
    double price;
    int speed;
    String name;
    String color;
    String number;

    // Method to display details (Fixed typo: displayCars)
    void displayCars() {
        System.out.println("Car Name: " + name);
        System.out.println("Color: " + color);
        System.out.println("Plate Number: " + number);
        System.out.println("Price: $" + price);
        System.out.println("Max Speed: " + speed + " km/h");
    }
}

