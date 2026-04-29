import java.util.Scanner;
class ConvertPrime{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();

		for (int i = 2;i<=num ;i++ ) {

			if(num%2==0){
				System.out.print("IS prime Number :" + num);
			}
			
		}
	}

}