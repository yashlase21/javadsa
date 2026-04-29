
 class MobileDriver {
    public static void main(String[] args) {
        Mobile m1 = new Mobile();

        m1.brand = "Apple";
        m1.model = "16 Pro Max";
        m1.color = "Silver";
        m1.price = 160000;
        m1.battery = 1000;
        m1.ram = "1 TB";
        m1.rom = 4;
        System.out.println("                   ");
        System.out.println("Brand : " + m1.brand);
        System.out.println("Model : " + m1.model);
        System.out.println("Color : " + m1.color);
        System.out.println("Price : " + m1.price);
        System.out.println("Battery : " + m1.battery);
        System.out.println("RAM : " + m1.ram);
        System.out.println("ROM : " + m1.rom);
        System.out.println("-------------------------------");


        Mobile m2 = new Mobile();

        m2.brand = "Samsung";
        m2.model = "S23";
        m2.color = "Blue";
        m2.price = 110000;
        m2.battery = 1500;
        m2.ram = "1/2 TB";
        m2.rom = 5;

        System.out.println("Brand : " + m2.brand);
        System.out.println("Model : " + m2.model);
        System.out.println("Color : " + m2.color);
        System.out.println("Price : " + m2.price);
        System.out.println("Battery : " + m2.battery);
        System.out.println("RAM : " + m2.ram);
        System.out.println("ROM : " + m2.rom);
        System.out.println("--------------------------------");

        Mobile m3 = new Mobile();

        m3.brand = "Nokia";
        m3.model = "Lumia";
        m3.color = "Yellow";
        m3.price = 25000;
        m3.battery = 600;
        m3.ram = "12";
        m3.rom = 3;

        System.out.println("Brand : " + m3.brand);
        System.out.println("Model : " + m3.model);
        System.out.println("Color : " + m3.color);
        System.out.println("Price : " + m3.price);
        System.out.println("Battery : " + m3.battery);
        System.out.println("RAM : " + m3.ram);
        System.out.println("ROM : " + m3.rom);
        System.out.println("--------------------------------");
    }
}
