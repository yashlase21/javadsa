class NbookDriver {
    public static void main(String[] args) {
        
        Nbook b1 = new Nbook();
        
        
        b1.brand = "Oxford";
        b1.price = 499.99;
        b1.width = 15.5;
        b1.type = "Hardcover";
        b1.weight = 800;

   
        System.out.println("Brand: " + b1.brand);
        System.out.println("Price: " + b1.price);
        System.out.println("Width: " + b1.width + " cm");
        System.out.println("Type: " + b1.type);
        System.out.println("Weight: " + b1.weight + " grams");
        System.out.println("-----------------------");
    }
}
