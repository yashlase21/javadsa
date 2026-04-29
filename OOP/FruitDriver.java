class FruitDriver{
	public static void main(String[] args) {
		Fruit f1 = new Fruit();

		f1.name = "Mango";
		f1.price = 2000;
		f1.test = "Sweet";
		f1.origin = "Ratnageri";
		f1.color = "Yellow";

		f1.DisplayName().DisplayTest().DisplayPrice();
	}
}