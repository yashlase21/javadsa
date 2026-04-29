class pen{
	String name;
	String color;
	int size;
	int price;
	String brand;
}

class pendrive{
	public static void main(String[] args) {
		pen p1 = new pen();

		System.out.println(p1.brand);
		System.out.println(p1.name);
		System.out.println(p1.size);
		System.out.println(p1.price);
		System.out.println(p1.color);

		p1.brand="Cello";
		p1.name ="Ballpen";
		p1.size = 10;
		p1.color = "Black";
		p1.price = 122; 

		System.out.println(p1.brand);
		System.out.println(p1.name);
		System.out.println(p1.size);
		System.out.println(p1.price);
		System.out.println(p1.color);

	}
}