 public class ChairDriver{
	public static void main(String[] args) {
		Chair ch1 = new Chair();

		ch1.brand = "XYZ";
		ch1.price = 1000;
		ch1.noOflegs = 4;
		ch1.color = "Red";

		System.out.println("Brand : "+ch1.brand);
		System.out.println("Price : "+ch1.price);
		System.out.println("No Of Legs : "+ch1.noOflegs);
		System.out.println("Color : "+ch1.color);
	}
}