import java.util.Scanner;
class palindromCheckUsingBuilder{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The String : ");
		String str = sc.nextLine();
		String dup = str;
		StringBuilder sb = new StringBuilder(str);

		sb.reverse();
		System.out.print(sb+ ":");

		
	
			if (sb.toString().equals(dup)) {
			System.out.println(" The String Is Palindrom : ");
			}
			else{
				System.out.println("The String Is not Palindrom : ");
			}
		}

	}
