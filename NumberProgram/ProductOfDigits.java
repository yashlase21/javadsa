import java.util.*;
class ProductOfDigits{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number :");
		int number = sc.nextInt();

		int product = 1;
		
		while(number>0){
			int digit = number%10;
			product*=digit;
			number/=10;
		}

		System.out.print("Product of Digit is :"+product);

	}
	
}
