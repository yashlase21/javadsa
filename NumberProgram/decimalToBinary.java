import java.util.Scanner;
class decimalToBinary{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A Number Binary Number : ");
		String binary = sc.next();

		int decimal = Integer.parseInt(binary,2);
		System.out.print("The decimal Number is  "+decimal);

	}
}