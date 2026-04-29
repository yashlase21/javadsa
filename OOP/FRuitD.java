class fruit{
	String name;
	double price;
	String test;
	String origin;
	String color;

	public fruit diplayName(){
		System.out.println(name);
		return this;
	}

	public fruit diplayPrice(){
		System.out.println(price);
		return this;
	}

	public fruit diplayColor(){
		System.out.println(color);
		return this;
	}
}

class FRuitD{
	public static void main(String[] args) {
		fruit d = new fruit();
		d.name = "Orange";
		d.price = 124.2;
		d.test = "Sweet";
		d.origin = "Land";
		d.color = "Red";

		d.diplayName()
		.diplayPrice()
		.diplayColor();
	}
}

