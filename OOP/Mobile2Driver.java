class Mobile2Driver {
    public static void main(String[] args) {
        Mobile2 m = new Mobile2();
        m.brand = "Samsung";
        m.model = "S23";
        m.color = "Blue";
        m.price = 110000;
        m.battery = 1500;
        m.ram = "1/2 TB";
        m.rom = 5;
        System.out.println("----------------------------");

        m.displayMobile();

        Mobile2 m1 = new Mobile2();
        m1.brand = "Apple";
        m1.model = "16 Pro Max";
        m1.color = "Silver";
        m1.price = 160000;
        m1.battery = 1000;
        m1.ram = "1 TB";
        m1.rom = 4;
        System.out.println("-----------------------------");
        m1.displayMobile();
    }
}
