class CarDriver{
	public static void main(String[] args) {
		Car ch1 = new Car();
		ch1.brand = "BMW";
		ch1.engin = "X-Ray";
		ch1.color = "Red";
		ch1.price = 500000;
		ch1.maxSpeed = 200;
		ch1.minSpeed = 10;

		System.out.println("Brand : "+ch1.brand);
		System.out.println("Engin : "+ch1.engin);
		System.out.println("Color : "+ch1.color);
		System.out.println("Price : "+ch1.price);
		System.out.println("Max Speed : "+ch1.maxSpeed);
		System.out.println("Min Speed : "+ch1.minSpeed);
		System.out.println("---------------------------------!");

		Car c1 = new Car();
		c1.brand = "TATA";
		c1.engin = "Y-Ray";
		c1.color = "Blue";
		c1.price = 50000;
		c1.maxSpeed = 180;
		c1.minSpeed = 10;

		System.out.println("Brand : "+c1.brand);
		System.out.println("Engin : "+c1.engin);
		System.out.println("Color : "+c1.color);
		System.out.println("Price : "+c1.price);
		System.out.println("Max Speed : "+c1.maxSpeed);
		System.out.println("Min Speed : "+c1.minSpeed);
		System.out.print("-----------------------------------!");
	}
}