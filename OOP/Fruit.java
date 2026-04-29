class Fruit{
	String name;
	double price;
	String test;
	String origin;
	String color;

	public Fruit DisplayName(){
		System.out.println(name);
		System.out.println(this);
		return this;
	}

	public Fruit DisplayPrice(){
		System.out.println(price);
		System.out.println(this);
		return this;
	}

	public Fruit DisplayTest(){
		System.out.println(test);
		System.out.println(this);
		return this;
	}

}