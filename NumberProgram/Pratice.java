import java.util.Scanner;
class Pr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number");
			int num = sc.nextInt();
			if(num%2==0) {
				System.out.print("It is Even number"+num);

				
			}else{
					System.out.print("It is odd number"+num);
			}
		}
	}

