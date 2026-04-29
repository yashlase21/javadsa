class ACDriver{
	public static void main(String[] args) {
		AC a = new AC();

		a.brand = "Blue Star";
		a.price = 15000;
		a.ton = 1;
		a.maxTemp = 40;
		a.minTemp = 1;
		a. ambiantTemp = 22;

		a.displayAC();
		System.out.println();
		a.displaymaxTemp();
		System.out.println(" ");
		a.displayminTemp();
		System.out.println(" ");
		a.diplayTon();


		AC b = new AC();
		b.brand = "Red Star";
		b.price = 13000;
		b.ton = 2;
		b.maxTemp = 50;
		b.minTemp = 3;
		b. ambiantTemp = 32;
		System.out.println(" ");
		
		a.displayAC();


	}
}