class MobileDriver{
	public static void main(String[] args) {
		Mobile m1 = new Mobile();

		m1.brand = "Nokia"; 
    	m1.price = 500;
    	m1.ram = 12;
    	m1.noCamera = 3;
    	m1.os = "Androide";

    	System.out.println("Brand: " + m1.brand);
        System.out.println("Price: " + m1.price);
        System.out.println("ram: " + m1.ram);
        System.out.println("noCamera: " + m1.noCamera);
        System.out.println("os: " + m1.os);
        System.out.println("-----------------------");
	}
}